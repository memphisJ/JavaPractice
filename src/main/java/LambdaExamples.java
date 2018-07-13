public class LambdaExamples {
    public static void main(String...args){
        MyFunctionWithNoParameters myFunction =()->{System.out.println("Hello from here.....");};
        myFunction.apply();

        /****/
        MyFunctionWithParameters myFunctionWithParameters = (String text1, String text2)->{
                                                                System.out.println("Text1 -> " + text1);
                                                                System.out.println("Text2 -> " + text2);
        };

        myFunctionWithParameters.apply("Name One", "Name Two");

        /****/
        MyFunctionWithReturnAndParameters myFunctionWithReturnAndParameters = (String text1, String text2)->{
            return text1 + " - " + text2;
        };

        String theReturnParam = myFunctionWithReturnAndParameters.apply("Param1","Param2");
        System.out.printf(theReturnParam);
    }
}
