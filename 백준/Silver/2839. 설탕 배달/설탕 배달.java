import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        int minResult = 2000;

        int n = number / 5;
        while (n >= 0){
            int x = 0;
            if(( number - (5 * n) ) % 3 == 0 ){
                x = ( number - (5 * n)) / 3;
                if((x + n) < minResult) minResult = x + n;
            }
            n--;
        }

        if(minResult == 2000) minResult = -1;

        System.out.println(minResult);
    }
}