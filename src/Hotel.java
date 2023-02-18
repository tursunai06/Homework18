import java.util.Arrays;
import java.util.Scanner;

public class Hotel implements Pay{
   Scanner scanner = new Scanner(System.in);
   private Person [] people;

   public Hotel(Person[] people) {
      this.people = people;
   }

   public Person[] getPeople() {
      return people;
   }

   public void setPeople(Person[] people) {
      this.people = people;
   }

   public Hotel(Scanner scanner) {
      this.scanner = scanner;
   }

   @Override
   public void pay() {
      System.out.println("Input price for hotel");
      int number = scanner.nextInt();
      System.out.println("For hotel pay: " + number * 2);
   }

   @Override
   public String toString() {
      return "Hotel{" +
              "people" + Arrays.toString(people) +
              '}';
   }
}
