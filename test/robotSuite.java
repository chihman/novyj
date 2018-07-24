import org.junit.Assert;
import org.junit.Test;

public class robotSuite {
    @Test
    public void RTESTp()

    {

        Robot R = new Robot();
        R.turnRight();
        R.stepForvard();

        int result4 = R.getX();
        Assert.assertEquals(1, result4);
        System.out.println(result4);

        int result5 = R.getY();
        Assert.assertEquals(0, result5);
        System.out.println(result5);}

        @Test
        public void RTEST ()

        {
            Robot R = new Robot();

            R.stepForvard();

            int result = R.getX();
            Assert.assertEquals(0, result);
            System.out.println(result);

            int result2 = R.getY();
            Assert.assertEquals(1, result2);
            System.out.println(result2);
        }
        @Test
        public void test2 () {
        Robot R2 = new Robot();


        int result = R2.getX();
        Assert.assertEquals(0, result);
        System.out.println(result);
        int result2 = R2.getY();
        Assert.assertEquals(0, result2);
        System.out.println(result2);
    }
    }}
