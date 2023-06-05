package ch12;

public class JavaSingleTonTest {

    private static final JavaSingleTonTest INSTANCE = new JavaSingleTonTest();

    public JavaSingleTonTest() {
    }

    public static JavaSingleTonTest getInstance() {
        return INSTANCE;
    }
}
