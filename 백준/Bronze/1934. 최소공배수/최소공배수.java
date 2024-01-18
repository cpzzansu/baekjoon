import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] strArray = br.readLine().split(" ");

            int a = Integer.parseInt(strArray[0]);
            int b = Integer.parseInt(strArray[1]);

            if(a > b) {
                leastCommonMultiple(b, a);
            } else {
                leastCommonMultiple(a, b);
            }

        }
    }

    static void leastCommonMultiple(int low, int high) {

        int lowMultiple = -1;
        int highMultiple = 0;

        int i = 1;
        int j = 1;

        while(lowMultiple != highMultiple) {
            highMultiple = high * i;
            while(lowMultiple < highMultiple) {
                lowMultiple = low * j;
                j++;
            }
            i++;
        }
        System.out.println(highMultiple);
    }
}