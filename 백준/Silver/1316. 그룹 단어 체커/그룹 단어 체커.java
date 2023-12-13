import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int groopWord = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n+1; i++) {
			String str = sc.nextLine();
			boolean istrue = true;
			int maxNum = 0;
			int[] intArr = new int[26];
			for(int j = 0; j < str.length(); j++) {
				if(istrue) {
					intArr[(int)str.charAt(j) - 97] += 1;
					istrue = false;
				} else if(str.charAt(j-1) == str.charAt(j)) {
					
				} else {
					intArr[(int)str.charAt(j) - 97] += 1;
				}
			}
			for(int score : intArr) {
				if(maxNum < score) {
					maxNum = score;
				}
			}
			if(maxNum == 1) {
				groopWord += 1;
			}
		}
		System.out.println(groopWord);
	}
}