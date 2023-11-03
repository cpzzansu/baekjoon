import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        String result = "";

        for(String x : strArr){
            result += x;
        }

        if(result.equals("12345678")){
            System.out.println("ascending");
        } else if (result.equals("87654321")) {
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }

    }
}