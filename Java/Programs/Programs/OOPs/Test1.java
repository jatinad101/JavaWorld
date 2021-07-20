package Programs.OOPs;

public class Test1 {
    final int x;
    {
        x = 100;
    }
    
}
class maple{
    public static void main(String[] args){
        Test1 t1 = new Test1();
        System.out.println(t1.x);

        Test1 t2 = new Test1();
        System.out.println(t2.x);
    }
}
