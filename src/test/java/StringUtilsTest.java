import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilsTest {

    @Test(groups = { "string_utils", "p1" })
    public void isEqualsCorrect() {
        Assert.assertTrue(StringUtils.isEquals("foo", "foo"));
        Assert.assertFalse(StringUtils.isEquals("foo", "bar"));
    }

    @Test(groups = { "string_utils", "p1" })
    public void isCombineCorrect() {
        Assert.assertEquals(StringUtils.combine("foo", "bar"), "foobar");
    }

    @Test(groups = { "string_utils", "p1" })
    public void isSearchCorrect() {
        Assert.assertEquals(StringUtils.indexOf("foo", "bar"), -1);
        Assert.assertEquals(StringUtils.indexOf("foobar", "bar"), 3);
        Assert.assertEquals(StringUtils.indexOf("foobar", "baret"), -1);
    }
}
