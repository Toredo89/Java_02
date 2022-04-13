package lesson_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Сource {

    private String name;

    List<Student> studentList;

    public Сource(String s, ArrayList<Student> students) {

    }

    public void Cource(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Collection<Object> getCourceList() {
        return null;
    }
}
