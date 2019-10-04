package by.bsuir.autobase.entity;

public abstract class Human implements java.io.Serializable {

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
