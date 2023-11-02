import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        int i = 0;

        int numberth = 0;

        String x = "";

        while(numberth < number){
            String strI = String.valueOf(i);
            if(strI.contains("666")){
                x = strI;
                numberth++;
            }
            i++;
        }

        System.out.println(x);

    }
}