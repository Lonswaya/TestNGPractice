import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ExclusiveListTest {
    public static String GOOD_STRING = "Yes this string";
    public static String BAD_STRING = "Not this string";

    public ThreadLocal<ExclusiveList> list = new ThreadLocal<ExclusiveList>();
    public List badList;

    @BeforeClass(alwaysRun = true)
    public void classSetup() {
        badList = Arrays.asList(BAD_STRING);
    }

    @BeforeMethod(alwaysRun = true)
    public void testSetup() {
        list.set(new ExclusiveList(badList));
    }

    @AfterMethod(alwaysRun = true)
    public void testCleanup() {
        // Cleanup whatever threadlocals you may have
        list.remove();
    }

    @Test(groups = { "exclusive_list", "p1" })
    public void testExclusiveGoodString() {
        boolean result = list.get().add(GOOD_STRING);
        Assert.assertTrue(result, "The addition return was not true for a good string");
        Assert.assertEquals(list.get().size(), 1);
        Assert.assertEquals(list.get().get(0), GOOD_STRING);
    }

    @Test(groups = { "exclusive_list", "p1" })
    public void testExclusiveBadString() {
        boolean result = list.get().add(BAD_STRING);
        Assert.assertFalse(result, "The addition return was true for a bad string");
        Assert.assertEquals(list.get().size(), 0);
    }

}

