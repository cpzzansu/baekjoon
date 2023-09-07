import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] strArray = br.readLine().split(" ");
            int[] intArray = new int[3];
            for (int i = 0; i < 3; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            int a = intArray[0];
            int b = intArray[1];
            int c = intArray[2];

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            Arrays.sort(intArray);

            int maxNum = intArray[2];
            int sumRestNumber = intArray[0] + intArray[1];

            if (maxNum >= sumRestNumber) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else {
                if (a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}

