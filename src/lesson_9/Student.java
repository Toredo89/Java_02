package lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;

    ArrayList<Cource> studentList;

    public Student(String name, ArrayList<Cource> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public List<Cource> getStudentList() {
        return studentList;
    }
}
