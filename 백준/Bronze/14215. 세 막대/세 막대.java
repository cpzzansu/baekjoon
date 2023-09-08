import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strArray = br.readLine().split(" ");
    int[] intArray = new int[3];
    for (int i = 0; i < 3; i++) {
      intArray[i] = Integer.parseInt(strArray[i]);
    }

    Arrays.sort(intArray);

    int maxNum = intArray[2];
    int sumRestNumber = intArray[0] + intArray[1];

    if (maxNum >= sumRestNumber) {
      System.out.println(2 * sumRestNumber - 1);
    } else {
      System.out.println(maxNum + sumRestNumber);
    }
  }
}
