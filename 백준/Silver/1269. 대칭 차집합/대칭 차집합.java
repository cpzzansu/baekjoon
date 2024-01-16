import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strNumber = br.readLine().split(" ");

        int aNumber = Integer.parseInt(strNumber[0]);
        int bNumber = Integer.parseInt(strNumber[1]);

        AtomicInteger resultCount = new AtomicInteger();

        String[] strArrayA = br.readLine().split(" ");
        String[] strArrayB = br.readLine().split(" ");

        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();

        for(String a : strArrayA) {
            mapA.put(a, 0);
        }

        for(String b : strArrayB) {
            mapB.put(b, 0);
        }

        mapA.forEach((key, value) -> {
            if(!mapB.containsKey(key)) {
                resultCount.addAndGet(1);
            }
        });

        mapB.forEach((key, value) -> {
            if(!mapA.containsKey(key)) {
                resultCount.addAndGet(1);
            }
        });

        System.out.println(resultCount);
    }
}

