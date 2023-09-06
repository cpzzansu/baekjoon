import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] intArray = new int[3];

        for(int i = 0; i < 3; i++){
            intArray[i] = Integer.parseInt(br.readLine());
        }

        int sum = intArray[0] + intArray[1] + intArray[2];

        if(sum != 180){
            System.out.println("Error");
        } else {
            if(intArray[0] == intArray[1]){
                if(intArray[0] == intArray[2]){
                    System.out.println("Equilateral");
                } else {
                    System.out.println("Isosceles");
                }
            } else {
                if(intArray[0] == intArray[2]){
                    System.out.println("Isosceles");
                } else if (intArray[1] == intArray[2]) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
    }


}

