package Programs.Matrixprograms;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args){
        List<String> l1 = new ArrayList<>();
        l1.add("1");
        l1.add("2");

        List<String> l2 = new ArrayList<>();
        l2.add("3");
        l2.add("4");
        l2.add("5");

        List<String>[] arraylist = new List[2];
        arraylist[0] = l1;
        arraylist[1] = l2;

        for(int i=0; i<arraylist.length; i++){
            List<String> l = arraylist[i];
            System.out.println(l);
        }
    }
    
}
