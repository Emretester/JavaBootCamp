package part1;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        System.out.println(Arrays.toString(numbers));

        for (int i = 0, j = 10; i < 5; i++, j += 5) {
            numbers[i] = j;
        }

        System.out.println(Arrays.toString(numbers));


        System.out.println("----------------------------------------");

        int[] nums = {10, 20, 30, 40, 50}; // new int[5]

        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------------");

        char[] characters = new char[26];

        for(int i =0, j = 'A'; i < characters.length; i++, j++){
            characters[i] = (char)j;
        }

        System.out.println(Arrays.toString(characters));

        System.out.println("------------------------------------------");

        for(int i = characters.length -1; i >= 0; i--){
            System.out.println(characters[i]);
        }

        System.out.println("------------------------------------------");

        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4};

        int[] result = Arrays.stream(arr).distinct().toArray();

        System.out.println(Arrays.toString(result));






    }

}
