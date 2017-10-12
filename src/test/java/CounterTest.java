import org.testng.Assert;
import org.testng.annotations.Test;

public class CounterTest {
    @Test(groups = { "counter", "p1" })
    public void isSumCorrect() {
        Assert.assertEquals(Counter.countSum(1, 1), 2, "Sum of 1 and 1 was not correct");
        Assert.assertEquals(Counter.countSum(1, 2), 3, "Sum of 1 and 2 was not correct");
        Assert.assertEquals(Counter.countSum(4, 4), 8, "Sum of 4 and 4 was not correct");
    }
    @Test(groups = { "counter", "p1" })
    public void isMaxCorrect() {
        Assert.assertEquals(Counter.findMax(1, 2, 3), 3);
        Assert.assertEquals(Counter.findMax(1, 1, 1), 1);
        Assert.assertEquals(Counter.findMax(198653, 9559192, 9563), 9559192);
    }
    @Test(groups = { "counter", "p1" })
    public void isMinCorrect() {
        Assert.assertEquals(Counter.findMin(1, 2, 3), 1);
        Assert.assertEquals(Counter.findMin(1, 1, 1), 1);
        Assert.assertEquals(Counter.findMin(198653, 9559192, 9563), 9563);
    }
}
