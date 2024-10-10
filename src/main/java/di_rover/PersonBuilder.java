package di_rover;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Entered age is incorrect");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null) {
            throw new IllegalStateException("You should be enter name of person!");
        }

        if (this.surname == null) {
            throw new IllegalStateException("You should be enter surname of person!");
        }

        Person person = new Person(this.name, this.surname, this.age);
        person.setAddress(this.address);

        return person;
    }
}
