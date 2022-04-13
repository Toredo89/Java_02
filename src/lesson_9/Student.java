package lesson_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {

    private String name;

    public Student(String student1,String student2) {
        //Object ProgrammingCourses = null;
        //Object ComputerScienceCourses = null;
        List<Student> Student;
        Student = new ArrayList<>(Arrays.asList(
                //new student1("Ivan", ProgrammingCourses),
                //new student2("Petr", ComputerScienceCourses);
                //new student3("Aleks", ComputerScienceCourses),
                //new student4("Marti", ComputerScienceCourses),
                //new student5("Roman", ProgrammingCourses);
        ));
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student room = (Student) o;
        return Objects.equals(name, room.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
