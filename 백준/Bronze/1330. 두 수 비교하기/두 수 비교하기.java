import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] strings = br.readLine().split(" ");

            int A = Integer.parseInt(strings[0]);
            int B = Integer.parseInt(strings[1]);

            if (A > B) {
                System.out.println(">");
            } else if (A < B) {
                System.out.println("<");
            } else {
                System.out.println("==");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}