    interface A{
        void show(int a);
    }

    public class AnonimousClass {
        public static void main(String...agrs){
            //A obj = new A() {
            //    public void show(int a) {
            //        System.out.println("Hi from anonymous A => " + a);
            //    }
            //};

            A obj;
            obj = (i) -> System.out.println("Hi => " + i);
            obj.show(10);


        }
    }
