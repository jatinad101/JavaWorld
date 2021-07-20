package Programs.OOPs;


import java.io.IOException;

class Point
{
    int x, y;

    Point(int x, int y)
    {
        this.x = y;
        this.y = y;
    }

    Point setX(int x)
    {
        this.x = x;
        
        return this;
    }
    
     Point setY(int y)
    {
        this.y = y;
        
        return this;
    }
}
class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      
      Point p1 = new Point(10, 20);
      
      
      System.out.println(p1.setX(2).setY(3));

     

    } 
} 

    

