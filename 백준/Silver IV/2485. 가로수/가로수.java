import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> distances = new HashMap<>();
        List<Integer> streetTrees = new ArrayList<>();

        boolean isFirst = true;

        for (int i = 0; i < n; i++) {
            streetTrees.add(Integer.parseInt(br.readLine()));
            if (isFirst) {
                isFirst = false;
            } else {
                int distance = streetTrees.get(i) - streetTrees.get(i - 1);

                if (!distances.containsValue(distance)) {
                    distances.put(i, distance);
                }
            }
        }

        int maxDistance = distances.values().stream().reduce((a, b) -> maximumCommonMultiple(a, b)).orElse(1);

        System.out.println((streetTrees.get(streetTrees.size() - 1) - streetTrees.get(0)) / maxDistance - n + 1);

    }

    public static int maximumCommonMultiple(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}