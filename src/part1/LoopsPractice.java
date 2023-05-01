package part1;

import java.util.Scanner;

public class LoopsPractice {

    public static void main(String[] args) {

        for(int i = 0; i < 10;i++){
            System.out.println("EU batch 10");
        }

        System.out.println("Cydeo School");


        System.out.println("-------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        int num = 0;

        while(true){
            System.out.println("Enter a positive number:");
            num = scan.nextInt();
            if(num > 0){
                break; // exits the loop
            }
        }

        System.out.println("You have entered: "+num);


        System.out.println("-------------------------------------------------");

        for (char i = 'A'; i <= 'K'; i++) {
            if(i == 'D' || i == 'H' || i== 'J'){
                return; // exits the method
                //continue; // skips
            }
            System.out.println(i);
        }


        System.out.println("Hello");





    }


}