import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] xArr = new String[3];
        String[] yArr = new String[3];

        for(int i = 0; i < 3; i++){

            String[] strArr = br.readLine().split(" ");

            xArr[i] = strArr[0];
            yArr[i] = strArr[1];
        }

        String x = xArr[0];
        String y = yArr[0];

        x = whichPoint(x, xArr);
        y = whichPoint(y, yArr);

        System.out.println(x + " " + y);
    }

    public static String whichPoint(String num, String[] strArr){
        for(int i = 1; i < 3; i++){
            if(num.equals(strArr[i])){
                if(i == 1){
                    num = strArr[2];
                    break;
                } else if (i == 2) {
                    num = strArr[1];
                }
            }
        }
        return num;
    }
}

