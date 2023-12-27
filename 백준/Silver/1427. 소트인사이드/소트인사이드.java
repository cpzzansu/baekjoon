import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numberArray = br.readLine().split("");


        Arrays.sort(numberArray);
        Collections.reverse(Arrays.asList(numberArray));

        for(String sort : numberArray){
            bw.write(sort);
        }
        bw.flush();
    }
}
