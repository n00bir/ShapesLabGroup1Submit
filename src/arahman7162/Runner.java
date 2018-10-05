package arahman7162;

public class Runner {
    public static void main (String[] args){
        Shape shape1 = new Rectangle(2,2);
        Shape shape2 =  new ETriangle (3);
        Shape shape3 =  new Circle(4);
        System.out.println(shape2);
        System.out.println("My Perimeter is: " + shape2.getPerimeter());
        System.out.println("My Area is :" + shape2.getArea());
        Shape[] shapes = { shape1,shape2,shape3};
        for (Shape cur : shapes){
            System.out.println(cur);
            System.out.println("My Perimeter is: " + cur.getPerimeter());
            System.out.println("My Area is :" + cur.getArea());
        }
    }
}