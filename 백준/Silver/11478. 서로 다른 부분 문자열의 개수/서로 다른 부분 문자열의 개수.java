import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strings = br.readLine();

        Map<String, Integer> resultMap = new HashMap<>();

        for(int i = 1; i <= strings.length(); i++) {
            for(int j = 0; j < strings.length(); j++) {
                if((j + i) > strings.length()) break;
                 String result = strings.substring(j, j + i);
                 resultMap.put(result, 1);
            }
        }

        int length = resultMap.size();

        System.out.println(length);

    }
}