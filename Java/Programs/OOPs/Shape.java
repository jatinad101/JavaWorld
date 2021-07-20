package OOPs;

public interface Shape{

       public String LABLE = "Shape";

       void draw();

       double getArea();

}
class Circle implements Shape{
    
    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    public double getRadius(){
        return this.radius;
    }
}

class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }
}
class ShapeTest{

    public static void main(String[] args){

        Shape s1  = new Circle(10);
        s1.draw();
        Circle c = (Circle) s1;
        System.out.println("Radius of the circle is = "+c.getRadius());
        
        System.out.println("Area of the circle = "+s1.getArea());

        s1 = new Rectangle(25, 25);
        s1.draw();
        System.out.println("Area of the rectangle = "+s1.getArea());

     
    }

}
    

    

