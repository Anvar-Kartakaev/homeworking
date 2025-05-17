import java.util.Objects;

public class Student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) && age == student.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // На проверку
}
