import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int [][] matrix ={
                    {1,2,3,1},
                    {4,5,6,1},
                    {7,8,9,1},
            };
//        System.out.println("matrix.length = " + matrix.length); // row
//        System.out.println("matrix[0].length = " + matrix[0].length); //col
//        Scanner sc =new Scanner(System.in);
//        int num =sc.nextInt();
//        System.out.println("num = " + num);

//        inheritance2 in2 =new inheritance2();
//        in2.print1();

        Generic<String> generic1 = new Generic<String>();
        Generic<Integer> generic2 = new Generic<Integer>();
        generic1.setValue("Hello");
        generic2.setValue(100);
        System.out.println("generic1.getValue() = " + generic1.getValue());
        System.out.println("generic2.getValue() = " + generic2.getValue());
    }


}