package Class;

import Interface.Interface3;

import java.util.Scanner;

public class Class3 implements Interface3 {
    int first;
    int last;
    @Override
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int inpt1 = sc.nextInt();
        last = (inpt1 %10);
        while (inpt1 >= 10)
                inpt1 /= 10;
        first = inpt1;
        System.out.println(2*(first) * (last));
    }
}
