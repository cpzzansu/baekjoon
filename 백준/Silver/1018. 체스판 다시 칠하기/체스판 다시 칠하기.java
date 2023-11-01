import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        int y = Integer.parseInt(strArr[0]);
        int x = Integer.parseInt(strArr[1]);

        List<String> board = new ArrayList<>();

        for(int i = 0; i < y; i++){
            board.add(br.readLine());
        }

        String W = "WBWBWBWB";
        String B = "BWBWBWBW";

        String currentBoard = "W";

        int changeNum = 0;
        int minChangeNum = 63;

        int ny = 0;
        int nx = 0;

        int chessNum = 0;

        while(ny + 8 <= y){
            while(nx + 8 <= x){
                for(int i = ny; i < ny + 8; i++){
                    String yBoard = board.get(i);
                    for(int j = nx; j < nx + 8; j++){
                        if(currentBoard.equals("W")){
                            if(W.charAt(chessNum) != yBoard.charAt(j)) changeNum++;
                        } else {
                            if(B.charAt(chessNum) != yBoard.charAt(j)) changeNum++;
                        }
                        chessNum++;
                    }
                    chessNum = 0;
                    if(currentBoard.equals("W")){
                        currentBoard = "B";
                    } else {
                        currentBoard = "W";
                    }
                }
                if(minChangeNum > changeNum) minChangeNum = changeNum;
                changeNum = 0;
                if(currentBoard.equals("W")){
                    currentBoard = "B";
                } else {
                    currentBoard = "W";
                }
                for(int i = ny; i < ny + 8; i++){
                    String yBoard = board.get(i);
                    for(int j = nx; j < nx + 8; j++){
                        if(currentBoard.equals("W")){
                            if(W.charAt(chessNum) != yBoard.charAt(j)) changeNum++;
                        } else {
                            if(B.charAt(chessNum) != yBoard.charAt(j)) changeNum++;
                        }
                        chessNum++;
                    }
                    chessNum = 0;
                    if(currentBoard.equals("W")){
                        currentBoard = "B";
                    } else {
                        currentBoard = "W";
                    }
                }
                if(minChangeNum > changeNum) minChangeNum = changeNum;
                changeNum = 0;
                nx++;
            }
            nx = 0;
            ny++;
        }
        System.out.println(minChangeNum);
    }
}