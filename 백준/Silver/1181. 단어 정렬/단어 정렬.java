import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<String> strList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            strList.add(br.readLine());
        }

        strList = new ArrayList<>(new LinkedHashSet<>(strList));

        Collections.sort(strList, (o1, o2) -> {
            if(o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                return o1.compareTo(o2);
            }
        });

        for (String result : strList) {
            bw.write(result);
            bw.newLine();
        }
        bw.flush();
    }
}

