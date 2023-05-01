package part1;

public class MethodsPractice {

    public static void main(String[] args) {

          String str = "Wooden Spoon";

          String result = reverse(str);

        System.out.println(result);


        String str2 = "Cydeo School";

        System.out.println( reverse(str2) );


    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }


}
