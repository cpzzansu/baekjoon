import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        int resultOutPutNumber = getResultOutPutNumber();

        System.out.println(resultOutPutNumber);
    }

    private static int getResultOutPutNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int resultOutPutNumber = 0;

        Map<String, Integer> arrayN = new HashMap<>();

        for(int i = 0; i < n; i++) {
            arrayN.put(br.readLine(), 1);
        }

        for(int i = 0; i < m; i++) {
            if(arrayN.containsKey(br.readLine())) resultOutPutNumber++;
        }
        return resultOutPutNumber;
    }
}

