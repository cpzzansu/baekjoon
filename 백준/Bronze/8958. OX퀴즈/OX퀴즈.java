import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        for(int i = 0; i < number; i++){
            int sumScore = 0;
            int score = 1;

            String[] x = br.readLine().split("");

            for(String s : x){
                if(s.equals("O")){
                    sumScore += score++;
                } else {
                    score = 1;
                }
            }

            System.out.println(sumScore);
        }

    }
}