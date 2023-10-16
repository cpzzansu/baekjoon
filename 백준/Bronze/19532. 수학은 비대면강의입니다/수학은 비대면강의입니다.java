import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNumberStringArray = br.readLine().split(" ");

        int[] inputNumberArray = new int[6];

        for(int i = 0; i < 6; i++){
            inputNumberArray[i] = Integer.parseInt(inputNumberStringArray[i]);
        }

        int a = inputNumberArray[0];
        int b = inputNumberArray[1];
        int c = inputNumberArray[2];
        int d = inputNumberArray[3];
        int e = inputNumberArray[4];
        int f = inputNumberArray[5];

        for(int x = -999; x <= 999; x++){
            for(int y = -999; y <=999; y++){
                if(a * x + b * y == c && d * x + e * y == f){
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }
}