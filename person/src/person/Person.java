package person;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final String sex;
    private final int age;

    private Person(String firstName, String lastName, String sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", sex='" + sex + '\'' +
            ", age=" + age +
            '}';
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String sex;
        private int age;

        public Person build() {
            return new Person(firstName, lastName, sex, age);
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }
    }
}
