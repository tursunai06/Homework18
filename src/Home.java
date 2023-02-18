import java.util.Arrays;
import java.util.Scanner;

public class Home implements Pay {
  Scanner scanner = new Scanner(System.in);
  private Person [] people;

  public Person[] getPeople() {
    return people;
  }

  public void setPeople(Person[] people) {
    this.people = people;
  }

  public Home(Person[] people) {
    this.people = people;
  }

  @Override
  public void pay() {
    System.out.println("Input price for home");
    int number = scanner.nextInt();
    System.out.println("For home pay: " + number * 5);
  }

  @Override
  public String toString() {
    return "Home{" +
            "people" + Arrays.toString(people) +
            '}';
  }
}
