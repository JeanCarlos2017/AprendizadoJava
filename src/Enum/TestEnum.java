package Enum;

import java.util.stream.Stream;

public enum TestEnum {
    JEDI("jedi"),
    NEUTRO("figurante"),
    SITH("sith");

    private String value;

    TestEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TestEnum of(String value) {
        return Stream.of(TestEnum.values()).
                filter(it -> it.getValue().equals(value))
                .findFirst()
                .orElseThrow();
    }

    public static void main(String[] args) {
        TestEnum testEnum = TestEnum.of("figurante");
        System.out.println(testEnum);
    }
}
