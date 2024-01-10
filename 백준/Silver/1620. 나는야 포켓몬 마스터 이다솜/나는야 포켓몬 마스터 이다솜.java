import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArray = br.readLine().split(" ");
        int n = Integer.parseInt(strArray[0]);
        int m = Integer.parseInt(strArray[1]);

        Map<String, Integer> poketmonMap = new HashMap<>();

        for(int i = 1; i <= n; i++) {
            String poketmon = br.readLine();
            poketmonMap.put(poketmon, i);
        }

        List<Map.Entry<String, Integer>> numberList = new ArrayList<>(poketmonMap.entrySet());

        Collections.sort(numberList, Comparator.comparing(Map.Entry::getValue));

        for(int i = 0; i < m; i++) {

            String question = br.readLine();

            if(poketmonMap.containsKey(question)) {
                bw.write(String.valueOf(poketmonMap.get(question)));
                bw.newLine();
            } else {
                int number = Integer.parseInt(question);
                String numberPoketmon = numberList.get(number - 1).getKey();
                bw.write(numberPoketmon);
                bw.newLine();
            }
        }

        bw.flush();
    }
}

