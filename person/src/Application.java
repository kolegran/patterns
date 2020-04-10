import person.Person;

public class Application {
    public static void main(String[] args) {
        final Person person = new Person.PersonBuilder()
            .firstName("John")
            .lastName("Doe")
            .sex("male")
            .age(25)
            .build();

        System.out.println(person);
    }
}
