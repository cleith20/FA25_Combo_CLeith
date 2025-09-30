import java.util.Random;

public class CodingBat {

	public static void main(String[] args) {

		int a = new Random().nextInt(10);
		int b = new Random().nextInt(10);
		System.out.println(sortaSum(a, b));
	
		String out = "<<>>";
		String word = "word";
		System.out.println(makeOutWord(out, word));
		
		String str = "jjjk";
		System.out.println(firstTwo(str));
		
		System.out.println(firstHalf(str));
		
		String c = "abc";
		String d = "cat";
		System.out.println(conCat(c , d));
		
		
		String word2 = "Hello";
		int index = -3;
		System.out.println(twoChar(word2, index));
		
		
		String e = "java";
		String f = "hello";
		System.out.println(minCat(e, f));
		
		System.out.println(frontAgain(str));
		
	}
	
	private static boolean frontAgain(String str) {
		  if(str.length()<= 1)return false;
		  if(str.substring(0,1).equals(str.substring(str.length()-2, str.length()-1)))return true;
		  return false;
	}
	
	private static String minCat(String e, String f) {
		 if(e.length() >= f.length()) return e.substring(e.length()-f.length())+f;
		 if(f.length() >= e.length()) return e+ f.substring(f.length()-e.length());
		 return e+f;
		}

	private static String twoChar(String word2, int index) {
		 if(word2.length() <= index || word2.length() <= index+1 || index <=0)
			  return word2.substring(0,2);
			  return word2.substring(index, index+2);
	}

	private static String conCat(String c, String d) {
		 if(c.substring(c.length()-1).equals(d.substring(0,1)))
			  return c+d.substring(1);
			  return c+d;
	}

	private static String firstHalf(String str) {
		return str.substring(0, str.length()/2);
	}

	private static String firstTwo(String str) {
		if(str.length() < 2) 
			return(str);
		return(str.substring(0,2));
		}
		


	private static String makeOutWord(String out, String word) {
		String newWord = out.substring(0,2) + word + out.substring(2);
		return newWord;
		
	}

	private static int sortaSum(int a, int b) {
		int sum = a + b;
		if (sum <= 19 && sum >= 10)
			return 20;
		else
			return sum;
	}

}
