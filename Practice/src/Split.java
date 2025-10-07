
public class Split {

	public static void main(String[] args) {
		String sentence = "I wrote a beginner's guide to PC building, "
				+ "I hope some of you find it helpful. I tried to simplify things "
				+ "to make it easy to read without knowing all of the jargon up front, "
				+ "so hopefully it's pretty straightforward and easy to follow.";
		String[] word = sentence.split(sentence, 10);
		System.out.println(word);
	}

}
