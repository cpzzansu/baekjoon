import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] intArr = new int[3];

        for(int i = 0; i < 3; i++){
            intArr[i] = Integer.parseInt(br.readLine());
        }

        int sum = intArr[0] * intArr[1] * intArr[2];

        String sumString = String.valueOf(sum);

        int[] resultArr = new int[10];

        String[] sumStringArr = sumString.split("");

        for(String x : sumStringArr){
            int y = Integer.parseInt(x);

            resultArr[y] += 1;
        }

        for(int x : resultArr){
            System.out.println(x);
        }
    }
}