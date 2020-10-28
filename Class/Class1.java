package Class;
import java.util.*;
import Interface.Interface1;

public class Class1 implements Interface1 {

    String input;
    String revInput = "";

    @Override
    public void method1(){
        String input;
        String revInput= "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        input = in.nextLine();
        int len = input.length();
        for(int i = len - 1; i >= 0; i--)
            revInput = revInput + input.charAt(i);
        if (input.equals(revInput))
            System.out.println("It's a Palindrome");
        else
            System.out.println("It's not a Palindrome");

    }
}
