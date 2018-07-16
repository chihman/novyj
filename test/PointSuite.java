import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Created by pro-28 on 10.07.2018.
 */
public class PointSuite {
@Test
    public void distanceBetweenIntsTest(){
    double result = point.distanceBetween(1,3,1,4);
    Assert.assertEquals(3.6056,result,0.001);
    System.out.println(result);
}
@Test
    public void distanceBetweenPointsTest(){
    Point p1 = new Point();
    p1.x=1;
    p1.y=3;
    Point p2 = new Point();
    p2.x=1;
    p2.y=4;
    double result = point.distanceBetween(p1.x,p1.y,p2.x,p2.y);
    Assert.assertEquals(3.6056,result,0.001);
    System.out.println(result);
}
}
