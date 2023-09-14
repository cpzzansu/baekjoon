import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray = br.readLine().split(" ");
        int a1 = Integer.parseInt(strArray[0]);
        int a0 = Integer.parseInt(strArray[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        for (int n = n0; n <= 101; n++) {
            if (a1 * n + a0 > c * n) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}
