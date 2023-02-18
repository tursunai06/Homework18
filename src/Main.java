public class Main {
    public static void main(String[] args) {
        Person person = new Person("Kubatov", "Amir", 45, "businessman");
        Person person1 = new Person("Kasymbekova", "Aidana", 40, "doctor");
        Person person2 = new Person("Kabylova", "Ailin", 20, "student");
        Person person3 = new Person("Kabylov", "Nurbek", 15, "pupil");
        Person person4 = new Person("Kabylova", "NUrzhan", 10, "pupil");

        Person[] people = {person, person1, person2, person3, person4};
        Person[] people1 = {person, person1, person2};
        Person[] people2 = {person, person1};



        Hotel hotel = new Hotel(people2);
        hotel.pay();
        System.out.println(hotel);
        System.out.println("----------------------------");

        Home home = new Home(people);
        home.pay();
        System.out.println(home);
        System.out.println("----------------------------");

        Apartment apartment = new Apartment(people1);
        apartment.pay();
        System.out.println(apartment);



    }
}