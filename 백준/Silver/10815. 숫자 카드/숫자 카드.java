import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] sangCards = br.readLine().split(" ");

        Map<String, Integer> sangCardMap = new HashMap<>();

        for(String sangCard : sangCards) {
            sangCardMap.put(sangCard, 1);
        }

        int m = Integer.parseInt(br.readLine());
        String[] mCards = br.readLine().split(" ");

        for(int i = 0; i < mCards.length; i++) {
            if(sangCardMap.containsKey(mCards[i])) {
                bw.write("1");
            } else {
                bw.write("0");
            }

            if(i != (mCards.length -1)) bw.write(" ");
        }

        bw.flush();
    }
}

