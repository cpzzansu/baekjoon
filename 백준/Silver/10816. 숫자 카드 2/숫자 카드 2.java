import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> sanggunCard = new HashMap<>();

        String[] sanggun = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            if(!sanggunCard.containsKey(sanggun[i])){
                sanggunCard.put(sanggun[i], 1);
            } else {
                sanggunCard.put(sanggun[i], sanggunCard.get(sanggun[i]) + 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        String[] integerCard = br.readLine().split(" ");

        for(int i = 0; i < m; i++) {
            if(i < m-1) {
                if(sanggunCard.containsKey(integerCard[i])) {
                    bw.write(sanggunCard.get(integerCard[i]) + " ");
                } else {
                    bw.write(0 + " ");
                }
            } else {
                if(sanggunCard.containsKey(integerCard[i])) {
                    bw.write(String.valueOf(sanggunCard.get(integerCard[i])));
                } else {
                    bw.write(String.valueOf(0));
                }
            }
        }

        bw.flush();
    }
}

