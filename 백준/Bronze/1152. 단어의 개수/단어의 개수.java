import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<String> set = new ArrayList<String>();
		String[] strArr = br.readLine().split(" ");
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i] != "") {
				set.add(strArr[i]);
			}
		}
		System.out.println(set.size());
	}
}