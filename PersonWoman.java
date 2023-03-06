public class PersonWoman extends Person {
    public PersonWoman(String name, int age) {
        super(name, age);

        Gender gender = Gender.woman;
        this.gender = gender;
    }
}