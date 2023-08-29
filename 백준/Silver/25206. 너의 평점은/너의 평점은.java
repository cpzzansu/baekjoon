import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] scoreArr = {"A+", "A0", "B+", "B0", "C+","C0","D+","D0","F"};
        double[] scoreNumArr = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        double result = 0;
        double resultLearnTime = 0;

        for(int i = 0; i < 20; i++){
            String[] strArr = br.readLine().split(" ");
            String score = strArr[2];
            if(!score.equals("P")){
                int indexNum = Arrays.asList(scoreArr).indexOf(score);
                double learnTime = Double.parseDouble(strArr[1]);
                double scoreNum = scoreNumArr[indexNum];
                double resultScore = learnTime * scoreNum;

                resultLearnTime += learnTime;
                result += resultScore;
            }
        }
        System.out.println(Math.round((result / resultLearnTime)*1000000)/1000000.0);
    }
}