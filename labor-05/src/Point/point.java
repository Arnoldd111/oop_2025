package Point;

public class point {
    private int x,y;

    private static final point ORIGIN = new point(0,0);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(point a, point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

    public double distance_from_origin(){
        return distance(this,ORIGIN);
    }

    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
