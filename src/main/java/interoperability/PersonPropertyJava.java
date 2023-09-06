package interoperability;

public class PersonPropertyJava {
    public static void main(String[] args) throws Exception {
        PersonProperty person = new PersonProperty("gose", "kose");
        System.out.println(person.firstName);

        System.out.println(PersonObjectJvmField.name);
        System.out.println(PersonObjectJvmField.NAME);
    }
}
