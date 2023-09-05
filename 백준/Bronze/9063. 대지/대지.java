import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        int xMaxNumber;
        int xMinNumber;
        int yMaxNumber;
        int yMinNumber;

        List<Integer> xNumberList = new ArrayList<>();
        List<Integer> yNumberList = new ArrayList<>();

        for(int i = 0; i < number; i++){
            String[] strArray = br.readLine().split(" ");
            xNumberList.add(Integer.parseInt(strArray[0]));
            yNumberList.add(Integer.parseInt(strArray[1]));
        }

        xMaxNumber = xNumberList.get(0);
        xMinNumber = xNumberList.get(0);
        yMaxNumber = yNumberList.get(0);
        yMinNumber = yNumberList.get(0);

        for(int i = 1; i < xNumberList.size(); i++){
            if(xNumberList.get(i) > xMaxNumber){
                xMaxNumber = xNumberList.get(i);
            }
            if(xNumberList.get(i) < xMinNumber){
                xMinNumber = xNumberList.get(i);
            }
        }
        for(int i = 1; i < yNumberList.size(); i++){
            if(yNumberList.get(i) > yMaxNumber){
                yMaxNumber = yNumberList.get(i);
            }
            if(yNumberList.get(i) < yMinNumber){
                yMinNumber = yNumberList.get(i);
            }
        }

        int xLine = xMaxNumber - xMinNumber;
        int yLine = yMaxNumber - yMinNumber;

        int result = xLine * yLine;

        System.out.println(result);
    }
}