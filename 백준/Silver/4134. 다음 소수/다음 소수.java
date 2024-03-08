import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long t = sc.nextLong();

        for (int i = 0; i < t; i++) {
            Long n = sc.nextLong();
            System.out.println(findNextPrime(n));
        }
        sc.close();
    }

    public static Long findNextPrime(Long n) {
        if (n <= 2) return 2l;
        if (n % 2 == 0) n++;

        while (!isPrime(n)) {
            n += 2;
        }
        return n;
    }

    public static boolean isPrime(Long n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}