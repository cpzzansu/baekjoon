import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        for(int i = 0; i < number; i++){
            String[] strArr = br.readLine().split(" ");

            int h = Integer.parseInt(strArr[0]);
            int w = Integer.parseInt(strArr[1]);
            int n = Integer.parseInt(strArr[2]);

            int firstNum = n%h;
            int secondNum = n/h + 1;
            if(firstNum == 0){
                firstNum = h;
                secondNum = secondNum -1;
            }

            String first = String.valueOf(firstNum);
            String second = String.valueOf(secondNum);
            if(second.length() == 1) second = "0" + second;

            System.out.println(first + second);
        }
    }
}