import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");
        int[] intArr = new int[4];

        for(int i = 0; i < 4; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int minDistance = intArr[0];

        if(intArr[1] < minDistance){
            minDistance = intArr[1];
        }
        if((intArr[2] - intArr[0]) < minDistance){
            minDistance = (intArr[2] - intArr[0]);
        }
        if((intArr[3] - intArr[1]) < minDistance){
            minDistance = (intArr[3] - intArr[1]);
        }

        System.out.println(minDistance);
    }
}