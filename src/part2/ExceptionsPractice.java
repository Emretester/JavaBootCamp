package part2;

import part2.abstraction_practice.Circle;
import part2.abstraction_practice.Shape;
import part2.abstraction_practice.Square;

import java.io.IOException;

public class ExceptionsPractice {

    public static void main(String[] args) {


        Shape shape3 = new Square(7);

        System.out.println(((Square) shape3).getSide());

        try {
            System.out.println(((Circle) shape3).getRadius());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }


        System.out.println("Hello");

       // method1();
        method2();


    }


    public static void method1() throws IOException{
        throw new IOException("This is a checked exception");
    }


    public static void method2() {
        try {
            throw new IOException("This is a checked exception");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
