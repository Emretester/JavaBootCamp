package part2;

import part2.abstraction_practice.*;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Shape s1 = new Cube(5);

        //System.out.println(s1.calc_volume());
        System.out.println(s1.calc_area());
        System.out.println(s1.calc_perimeter());

        s1 = new Cylinder(3, 5);

        s1 = new Square(5);

        s1 = new Rectangle(6, 7);

        s1 = new Circle(3);


        System.out.println("--------------------------------------");


        Circle circle = new Circle(10);

        Shape shape1 = (Shape) circle;  // upcasting

       // Volume shape2 = (Volume) circle;

     //   System.out.println(shape2.calc_volume());


        Shape shape3 = new Square(7);

        //System.out.println(shape3.getSide());
        System.out.println( ( (Square)shape3 ).getSide() );

       // System.out.println( ( (Circle)shape3 ).getRadius()  );



        Square square = (Square) shape3;
        System.out.println(square.getSide());


        List<Shape> shapes = new ArrayList<>();

        /*
        while(true){
            shapes.add( new Circle(10));
            shapes.add( new Square(20));
            shapes.add( new Rectangle(15, 30));
        }

         */


    }

}
