package part2;

class A{

    public A(int a){
        System.out.println("Constructor A");
    }

    public int a;

    public void methodA(){
        System.out.println("MethodA");
    }

}


class B extends A{

    public B(double a){
        super(10);
        System.out.println("Constructor B");
    }

    public int b;

    public void methodB(){
        System.out.println("Method B");
    }

}


class C extends B{

    public C() {
        super(2.5);
        System.out.println("Constructor C");
    }

    public void methodC(){
        System.out.println("method C");
    }
}


public class Inheritance {

    public static void main(String[] args) {

      //  B obj1 = new B(2.5);

        C obj2 = new C();
        obj2.methodA();
        obj2.methodB();
        obj2.methodC();

    }


}
