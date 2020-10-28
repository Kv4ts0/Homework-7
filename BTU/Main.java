package BTU;

import Interface.Interface1;
import Interface.Interface2;
import Interface.Interface3;
import Interface.Interface4;
import Class.Class1;
import Class.Class2;
import Class.Class3;
import Class.Class4;

public class Main {
    public static void main(String[] args){
        Interface1 in1 = new Class1();
        in1.method1();
        Interface2 in2 = new Class2();
        in2.method1();
        Interface3 in3 = new Class3();
        in3.method1();
        Interface4 in4 = new Class4();
        in4.method1();
    }
}
