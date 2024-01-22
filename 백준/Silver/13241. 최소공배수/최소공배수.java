import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray = br.readLine().split(" ");

        Long a = Long.parseLong(strArray[0]);
        Long b = Long.parseLong(strArray[1]);

        Long result = 0l;

        Map<Long, Integer> bMap = new HashMap();

        for (int i = 1; i <= a; i++) {
            bMap.put((b * i), 1);
        }

        for (int i = 1; i <= b; i++) {
            if(bMap.containsKey(a * i)) {
                result = a * i;
                break;
            }
        }

        System.out.println(result);
    }
}