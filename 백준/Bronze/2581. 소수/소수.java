import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int minPrime = 0;
        int sumPrime = 0;
        boolean isFirst = true;

        for(int i = M; i <= N; i++){
            boolean isPrime = isPrimeNumber(i);
            if(isPrime){
                if(isFirst){
                    minPrime = i;
                    isFirst = false;
                }
                sumPrime += i;
            }
        }
        if(minPrime == 0){
            System.out.println("-1");
        } else {
            System.out.println(sumPrime);
            System.out.println(minPrime);
        }
    }

    public static boolean isPrimeNumber(int num){

        int cnt = 0;

        for (int i = 1; i <=num; i++){
            int restNum = num % i;
            if(restNum == 0) cnt++;
        }

        if(cnt == 2) return true;

        return false;
    }

}