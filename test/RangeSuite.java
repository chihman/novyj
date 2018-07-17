import org.junit.Assert;
import org.junit.Test;

public class RangeSuite {
    @Test
    public  void hasIntersectionIntsTest(){
        Range p1 = new Range();
        p1.la = 1;
        p1.lb = 1;
        p1.ra = 1;
        p1.rb = 1;
        boolean result = Range.hasIntersection(p1);
        Assert.assertEquals(true,result);
        System.out.println(result);
    }
}
