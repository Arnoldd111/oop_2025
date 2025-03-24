package Point;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<point> points = new ArrayList<>();
        System.out.println(points);

        for(int i=0;i<10;i++)
        {
            points.add(new point(i,i));
            System.out.println(points.get(i));
        }
        for(point p: points){
            System.out.printf("%.2f\n",p.distance_from_origin());
        }
    }



}
