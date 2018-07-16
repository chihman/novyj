/**
 * Created by pro-28 on 10.07.2018.
 */
public class point {
    public static double distanceBetween (int xa, int xb, int ya, int yb){
        double a = Math.sqrt(Math.pow((xb-xa),2)+Math.pow((yb-ya),2));
        return a;
    }
    public static double distanceBeetween (point p1, point p2 ){
        double a = Math.sqrt(Math.pow((p1.y-p1.x),2)+Math.pow((p2.y-p2.x),2));
        return a;
    }
}
