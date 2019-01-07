package afar.jacoco.demo;

import static java.util.Objects.isNull;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greet(String person) {
        if (isNull(person)) {
            return "Hello";
        }
        return "Hello " + person;
    }
}
