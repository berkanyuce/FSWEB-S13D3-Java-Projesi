public class Person {
    String firstname;
    String lastname;
    int age;
    String sex;
    String job;

    public Person(String firstname, String lastname, int age) {
        this(firstname, lastname, age, "Unknown", "Unknown");
    }

    public Person(String firstname, String lastname, int age, String sex, String job) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.job = job;
    }

    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
    }
}
