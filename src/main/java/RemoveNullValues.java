import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullValues {

    /**
     * In this approach the evaluation is been done over the same List using lambda, Java8 style
     * @param list to be evaluated.
     * @return a list without null values.
     */
    public List<String> removeNullValuesV1(List<String> list){
        list.removeIf(Objects::isNull);
        return list;
    }

    /**
     * In this approach we create a new list without the null values using lambda, Java8 style
     * @param list to be evaluated
     * @return a List without null values
     */
    public List<String> removeNullValuesV2(List<String> list){
        return list.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    /**
     *In this approach we make the evaluation over the same list, Java 7 and before style
     * @param list to be evaluated
     * @return a List without null values
     */
    public List<String> removeNullValuesV3(List<String> list){
        list.removeAll(Collections.singleton(null));
        return list;
    }
}
