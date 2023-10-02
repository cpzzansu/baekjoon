import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] nNumbers = new int[n];
        String[] stringNnumbers = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            nNumbers[i] = Integer.parseInt(stringNnumbers[i]);
        }
        int cardOne = 0;
        int cardTwo = 0;
        int cardThree = 0;
        int maxSum = 0;
        for(int i = 0; i < (n-2); i++){
            cardOne = nNumbers[i];
            for(int j = (i+1); j < (n-1); j++){
                cardTwo = nNumbers[j];
                for(int z = (j+1); z < n; z++){
                    cardThree = nNumbers[z];
                    int sumCardNumber = cardOne + cardTwo + cardThree;
                    if(sumCardNumber < m){
                        if(maxSum < sumCardNumber){
                            maxSum = sumCardNumber;
                        }
                    } else if (sumCardNumber == m) {
                        maxSum = sumCardNumber;
                        System.out.println(maxSum);
                        return;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}