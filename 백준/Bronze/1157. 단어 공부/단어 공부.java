import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] intArr = new int[58];
		for(int i = 0; i < str.length(); i++) {
			intArr[(int)str.charAt(i)-65] += 1;
		}
		for(int i = 32; i < 58; i++) {
			intArr[i-32] += intArr[i];
			intArr[i] = 0;
		}
		int maxnum = 0;
		int idx = 0;
		boolean isFirst = true;
		for(int i : intArr) {
			if(i > maxnum) {
				maxnum = i;
			}
		}
		for(int i = 0; i < 58; i++) {
			if(isFirst) {
				if(intArr[i] == maxnum) {
					idx = i;
					isFirst = false;
				}
			} else {
				if(intArr[i] == maxnum) {
					idx = -1;
				}
			}
		}
		if(idx != -1) {
			System.out.println((char)(idx+65));
		} else {
			System.out.println("?");
		}
	}
}
