import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RemoveNullValuesTest {
    List<String> list = new ArrayList<>(Arrays.asList("A",null,"B",null,"C"));
    RemoveNullValues removeNullValuesV2 = new RemoveNullValues();

    @Test
    public void removeNullValuesV1() {
        Assert.assertEquals(removeNullValuesV2.removeNullValuesV1(list).size(),3);
    }

    @Test
    public void removeNullValuesV2() {
        Assert.assertEquals(removeNullValuesV2.removeNullValuesV2(list).size(),3);
    }

    @Test
    public void removeNullValuesV3() {
        Assert.assertEquals(removeNullValuesV2.removeNullValuesV3(list).size(),3);
    }
}
