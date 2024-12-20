package lecture8.constructosSetters;


class Person {
    private String currentName;
    private final String birthName;
    private String updatedName;
    private int age;
    private int kidsQuantity;

    public Person(String birthName, int age) {
        this.birthName = birthName;
        currentName = birthName;
        this.age = age;
    }

    @Deprecated
    public String getBirthName() {
        return updatedName != null
                ? updatedName
                : birthName;
    }

    public void setKidsQuantity(int kidsQuantity) {
        this.kidsQuantity = kidsQuantity;
    }

    public int aging() {
        return age++;
    }

    public int aging(int years) {
        int newAge = age + years;
        return newAge;
    }

    public int getAge() {
        return this.age;
    }

    public String changeName(String updatedName) {
        this.updatedName = updatedName;
        this.currentName = updatedName;
        return this.currentName;
    }
}

