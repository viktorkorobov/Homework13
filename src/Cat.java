import java.io.Serializable;

public class Cat implements Serializable {
    String Name;
    int Age;

    private int Weight=2;

    private final static long seriaVersionUID= -12l;

    public Cat(String name, int age) {
        Name = name;
        Age = age;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
