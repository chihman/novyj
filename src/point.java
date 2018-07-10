/**
 * Created by pro-28 on 10.07.2018.
 */
public class point {
    public static double distanceBetween (int xa, int xb, int ya, int yb){
        double a = Math.sqrt(Math.pow((xb-xa),2)+Math.pow((yb-ya),2));
        return a;
    }
}
