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

        String[] strArrayOne = br.readLine().split(" ");
        String[] strArrayTwo = br.readLine().split(" ");

        int oneA = Integer.parseInt(strArrayOne[0]);
        int oneB = Integer.parseInt(strArrayOne[1]);

        int twoA = Integer.parseInt(strArrayTwo[0]);
        int twoB = Integer.parseInt(strArrayTwo[1]);

        int resultA = (oneA * twoB) + (twoA * oneB);
        int resultB = oneB * twoB;

        int commonMultiple = maximumCommonMultiple(resultA, resultB);

        while(commonMultiple > 1) {
            resultA = resultA / commonMultiple;
            resultB = resultB / commonMultiple;

            commonMultiple = maximumCommonMultiple(resultA, resultB);
        }

        System.out.println(resultA + " " + resultB);

    }

    public static int maximumCommonMultiple(Integer a, Integer b) {

        if (b == 0) {
            return a;
        }

        return maximumCommonMultiple(b, a % b);
    }
}