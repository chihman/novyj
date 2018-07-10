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
}
