package part1;

import java.time.LocalDate;

class Spartan{

    String name;
    String id;
    LocalDate dateOfBirth;

    public Spartan(String name, String id, LocalDate dateOfBirth) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    static String schoolName = "Cydeo";
    static String programmingLanguage = "Java";

    static String magicWord = "Wooden Spoon";
    @Override
    public String toString() {
        return "Spartan{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}


public class ClassAndObjectPractice {

    public static void main(String[] args) {

        Spartan spartan1 = new Spartan("Yulia", "A01", LocalDate.of(1992, 4, 11));
        Spartan spartan2 = new Spartan("Mustafa", "A02", LocalDate.of(1990, 11, 4));

        System.out.println(spartan1);
        System.out.println(spartan2);

        System.out.println(spartan1.schoolName);
        System.out.println(spartan2.schoolName);


    }

}
