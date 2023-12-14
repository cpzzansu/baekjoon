import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Integer[] notYetSort = new Integer[n];

        for(int i = 0; i < n; i++){
            notYetSort[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(notYetSort);

        for(int sort : notYetSort){
            bw.write(String.valueOf(sort));
            bw.newLine();
        }
        bw.flush();
    }
}
