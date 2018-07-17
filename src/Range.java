public class Range {
    public int la;
    public int lb;
    public int ra;
    public int rb;

    public static boolean hasIntersection(Range p1){

boolean Q = p1.la-p1.lb<p1.ra-p1.rb;
return Q;
    }
}
