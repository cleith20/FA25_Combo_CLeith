
public class Conway {
	GridCanvas grid;

	public Conway() {
		grid = new GridCanvas(40, 50, 20);
		grid.turnOn(1, 5);
		grid.turnOn(1, 6);
		grid.turnOn(2, 5);
		grid.turnOn(2, 6);
		grid.turnOn(11, 5);
		grid.turnOn(11, 6);
		grid.turnOn(11, 7);
		grid.turnOn(12, 4);
		grid.turnOn(12, 8);
		grid.turnOn(13, 3);
		grid.turnOn(13, 9);
		grid.turnOn(14, 3);
		grid.turnOn(14, 9);
		grid.turnOn(15, 6);
		grid.turnOn(16, 4);
		grid.turnOn(16, 8);
		grid.turnOn(17, 5);
		grid.turnOn(17, 6);
		grid.turnOn(17, 7);
		grid.turnOn(18, 6);
		grid.turnOn(21, 3);
		grid.turnOn(21, 4);
		grid.turnOn(21, 5);
		grid.turnOn(22, 3);
		grid.turnOn(22, 4);
		grid.turnOn(22, 5);
		grid.turnOn(23, 2);
		grid.turnOn(23, 6);
		grid.turnOn(25, 2);
		grid.turnOn(25, 6);
		grid.turnOn(25, 7);
		grid.turnOn(35, 3);
		grid.turnOn(35, 4);
		grid.turnOn(36, 3);
		grid.turnOn(36, 4);
		
	}

	public GridCanvas getGrid() {
		return grid;
	}

	public void mainloop() {
		while (true) {
			this.update();
			grid.repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// do nothing
			}
		}
	}

	private void update() {
		int[][] counts = countNeighbors();
		updateGrid(counts);

	}

	private void updateGrid(int[][] counts) {
		int rows = grid.numRows();
		int cols = grid.numCols();

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				Cell cell = grid.getCell(r, c);
				updateCell(cell, counts[r][c]);
			}
		}
	}

	private static void updateCell(Cell cell, int count) {
		if (cell.isOn()) {
			if (count < 2 || count > 3) {
				cell.turnOff();
			}
		} else {
			if (count == 3) {
				cell.turnOn();
			}
		}

	}

	private int[][] countNeighbors() {
		int rows = grid.numRows();
		int cols = grid.numCols();

		int[][] counts = new int[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				counts[r][c] = countAlive(r, c);
			}
		}
		return counts;
	}

	private int countAlive(int r, int c) {
		int count = 0;
		count += grid.test(r - 1, c - 1);
		count += grid.test(r - 1, c);
		count += grid.test(r - 1, c + 1);
		count += grid.test(r, c - 1);
		count += grid.test(r, c + 1);
		count += grid.test(r + 1, c - 1);
		count += grid.test(r + 1, c);
		count += grid.test(r + 1, c + 1);

		return count;
	}

}
