package interoperability;

public class ObjectApplicationJava {
    public static void main(String[] args) throws Exception {
        System.out.println(ObjectApplication.name);

        ObjectApplication.INSTANCE.setName("kose");

        System.out.println(ObjectApplication.name);
    }
}
