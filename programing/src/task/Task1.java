package task;

public class Task1 {
	public static void main(String[] args) {
		String str = "level";
		stringRepeating(str);
	}

	static void stringRepeating(String str) {
		int[] ch = new int[145];
		for (int i = 0; i < str.length(); i++) {
			ch[str.charAt(i)]++;
		}

		for (int c = 0; c < ch.length; c++) {
			if (ch[c] > 0) {
				System.out.println((char) (c) + " : " + ch[c]);
			}
		}
	}

}
