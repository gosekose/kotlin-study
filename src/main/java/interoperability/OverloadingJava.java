package interoperability;

public class OverloadingJava {
    public static void main(String[] args) throws Exception {
        System.out.println(OverloadingExKt.restrictToRange(100, 1, 10));
        System.out.println(OverloadingExKt.restrictToRange(100, 20));
        System.out.println(OverloadingExKt.restrictToRange(100));
    }
}
