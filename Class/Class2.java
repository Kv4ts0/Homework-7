package Class;

import Interface.Interface2;

import java.util.Scanner;

public class Class2 implements Interface2 {

    @Override
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number\n");
        int inpt1 = sc.nextInt();
        System.out.println("Enter the second number\n");
        int inpt2 = sc.nextInt();
        System.out.println("Enter the third number\n");
        int inpt3 = sc.nextInt();
        System.out.println("Enter the fourth number\n");
        int inpt4 = sc.nextInt();
        System.out.println("Enter the fiveth number\n");
        int inpt5 = sc.nextInt();
        if (inpt1 != inpt2 & inpt1 != inpt3 & inpt2 != inpt3 | inpt1 != inpt4 & inpt1 != inpt5 & inpt4 != inpt5){
            System.out.println("NO");
        }
    }
}
