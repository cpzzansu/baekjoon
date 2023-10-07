import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i < n; i++){
            String iString = String.valueOf(i);
            int splitAndSum = 0;
            String[] iStringArr = iString.split("");
            for(int j = 0; j < iStringArr.length; j++){
                splitAndSum += Integer.parseInt(iStringArr[j]);
            }
            if((i + splitAndSum) == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println("0");
    }
}