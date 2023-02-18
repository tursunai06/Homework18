import java.util.Arrays;
import java.util.Scanner;

public class Apartment  implements Pay{
    Scanner scanner = new Scanner(System.in);
    private Person [] people;

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public Apartment(Person[] people) {
        this.people = people;
    }

    @Override
    public void pay() {
        System.out.println("Input price for apartements" );
        int number = scanner.nextInt();
        System.out.println("For apartements pay: " + number * 3);

    }

    @Override
    public String toString() {
        return "Apartment{" +
                "people" + Arrays.toString(people) +
                '}';
    }
}
