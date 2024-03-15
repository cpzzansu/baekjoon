import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> nList = new ArrayList<>();

        int n = sc.nextInt();
        while (n != 0) {
            nList.add(n);
            n = sc.nextInt();
        }

        int maxN = 0;

        for (int i=0; i< nList.size(); i++) {
            if (nList.get(i) > maxN) maxN = nList.get(i);
        }

        ArrayList<Boolean> primeList;

        maxN *= 2;

        primeList = new ArrayList<Boolean>(maxN+1);
        // 0번째와 1번째를 소수 아님으로 처리
        primeList.add(false);
        primeList.add(false);
        // 2~ n까지 소수로 설정
        for(int i=2; i<=maxN; i++ )
            primeList.add(i, true);

        // 2부터  ~ i*i <= n
        // 각각의 배수들을 지워간다.
        for(int i=2; (i*i)<=maxN; i++){
            if(primeList.get(i)){
                for(int j = i*i; j<=maxN; j+=i) primeList.set(j, false);
                //i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
            }
        }

        for (int i=0; i<nList.size(); i++) {
            int resultNumber = 0;
            for(int j=(nList.get(i)+1); j<=(nList.get(i)*2); j++) {
                if (primeList.get(j)) {
                    resultNumber += 1;
                }
            }
            System.out.println(resultNumber);
        }
    }
}