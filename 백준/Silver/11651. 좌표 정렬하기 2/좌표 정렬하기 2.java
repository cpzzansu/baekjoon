import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputNumberString = br.readLine().split(" ");
            points.add(new Point(Integer.parseInt(inputNumberString[0]),
                    Integer.parseInt(inputNumberString[1])));
        }

        Collections.sort(points);

        for (Point point : points) {
            bw.write(point.x + " " + point.y);
            bw.newLine();
        }
        bw.flush();
    }
}

class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.y == o.y) {
            return this.x - o.x;
        } else {
            return this.y - o.y;
        }
    }
}
