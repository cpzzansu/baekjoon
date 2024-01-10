import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> currentEnterPerson = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String[] history = br.readLine().split(" ");

            if(history[1].equals("enter")) {
                currentEnterPerson.put(history[0], 1);
            } else {
                currentEnterPerson.remove(history[0]);
            }
        }

        List<String> names = new ArrayList<>(currentEnterPerson.keySet());

        Collections.sort(names, Collections.reverseOrder());

        for(String name : names) {
            bw.write(name);
            bw.newLine();
        }

        bw.flush();
    }
}

