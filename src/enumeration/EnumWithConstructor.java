package enumeration;

enum EnumWithConstructor {
    // setting default ages for fields
    JOHN(20),
    JANE(24),
    KELLY(17),
    OTIS(19),
    JACKSON(30),
    JAMES(26),
    NATASHA(29);

    private int age;

    // constructor for the enum
    EnumWithConstructor(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // set specific age
    public void setAge(int age) {
        this.age = age;
    }

}
