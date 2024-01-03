import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<String>[] strListArray = new List[200];

        for(int i = 0; i < n; i++) {
            String readLineStr = br.readLine();

            int age = Integer.parseInt(readLineStr.split(" ")[0]);

            int index = age - 1;

            if (strListArray[index] == null) {
                strListArray[index] = new ArrayList<>();
            }
            strListArray[index].add(readLineStr);
        }

        for(List<String> strList : strListArray){
            if (strList != null){
                for(String str : strList){
                    bw.write(str);
                    bw.newLine();
                }
            }
        }

        bw.flush();
    }
}

