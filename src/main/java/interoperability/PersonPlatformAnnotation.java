package interoperability;

import org.jetbrains.annotations.NotNull;

public class PersonPlatformAnnotation {
    @NotNull private String name;
    private int age;

    public PersonPlatformAnnotation(@NotNull String name, int age) {
        this.name = name;
        this.age = age;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
