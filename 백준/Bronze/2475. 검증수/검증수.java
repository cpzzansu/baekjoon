import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        int[] intArr = new int[5];

        for(int i = 0; i < 5; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int sum = 0;

        for(int x : intArr){
           sum += x * x;
        }

        System.out.println(sum%10);


    }
}