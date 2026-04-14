public class inheritance2 extends inheritance1 {
    void print2(){
        super.print1();
        System.out.println("inheritance2");
    }
    inheritance2(){
        System.out.println("Child Constructor");
    }
}
