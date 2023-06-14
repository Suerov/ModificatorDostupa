package animals;

public class Hourse {

    public String name;
    public String color;
    public int age;

    public Hourse() {
    }

    public Hourse(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hourse{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }


}

