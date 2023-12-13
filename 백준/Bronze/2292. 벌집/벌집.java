import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeatNum = 6;

        int n = Integer.parseInt(br.readLine());

        int currentNum = 1;

        int roomNum = 1;

        while (currentNum < n){
            currentNum += repeatNum;

            repeatNum += 6;

            roomNum += 1;
        }

        System.out.println(roomNum);
    }
}
