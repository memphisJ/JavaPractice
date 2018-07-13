import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer> {
    int div;
    ConsImpl(int div){
        this.div = div;
    }

    public void accept(Integer i) {
        if (i%div == 0)
            System.out.println(i);
    }
}

public class JavaLambda {
    public static void main(String...args){
        System.out.println("Print the content of the List.");
        List<Integer> values = Arrays.asList(3,9,10,7,15);
        values.forEach(i -> System.out.println(i));

        // Implementing the consumer value
        System.out.println("Multiples from 3");
        Consumer consumer = new ConsImpl(3);
        values.forEach(consumer);

        //Defining in lambada Style
        System.out.println("Print the content from into the lambda function.");
        Consumer<Integer> consumerLambda = i -> System.out.println("Into a Lambda function -> " + i);
        values.forEach(consumerLambda);
    }
}
