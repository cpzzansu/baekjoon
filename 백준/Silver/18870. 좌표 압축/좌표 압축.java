import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] strArray = br.readLine().split(" ");

        List<String> strList = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(strArray)));

        List<Integer> indexList = strList.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(indexList);

        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < indexList.size(); i++) {
            indexMap.put(String.valueOf(indexList.get(i)), i);
        }

        boolean isFirst = true;

        for (int i = 0; i < strArray.length; i++) {


            if (isFirst) {
                bw.write(String.valueOf(indexMap.get(strArray[i])));
                isFirst = false;
            } else {
                bw.write(" " + indexMap.get(strArray[i]));
            }
        }

        bw.flush();
    }
}

