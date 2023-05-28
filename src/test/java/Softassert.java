import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
    @Test
    public void test() {
        Assert.assertTrue(5>8);
        Assert.assertFalse(8==8);
        Assert.assertEquals(5,9);
        Assert.assertNotEquals(6,6);
    }
    @Test
    public void test2()
    {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(5>8,"true testi failed"); //
        softAssert.assertFalse(8==8,"false testi failed");
        softAssert.assertAll();
    }
}
