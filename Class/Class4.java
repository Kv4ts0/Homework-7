package Class;

import Interface.Interface4;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class Class4 implements Interface4 {
    List<Integer> l1 = new ArrayList<Integer>();
    @Override
    public void method1(){
        Random rand = new Random();
        int [] newArray = new int [100];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = rand.nextInt(99);
            if (i < newArray[i])
                l1.add(newArray[i]);
        }
        System.out.print(l1.size());
    }

}
