package lesson_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class MainApp {


    public static void main(String[] args) {
        List<Сource> result = getListOfCource(4, 4);
        //1 задание
        assert result != null;
        result.stream().flatMap(student -> student.getCourceList().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(student -> student.getCourceList().stream()).collect(Collectors.toSet());

        //2 задание
        result.stream().sorted((student1,student2) -> student1.getCourceList().size() - student2.getCourceList().size()).limit(3).collect(Collectors.toList());

        //3 задание
        Student paramStudent = new Student("student1,student2,student3,student4,student5");
        result.stream().filter(house -> house.getCourceList().equals(paramStudent)).collect(Collectors.toList());

        System.out.println();

    }

    private static MainApp limit(int i) {
        return null;
    }

    private static void collect(Collector<Object,?, Set<Object>> toSet) {
    }

    private static DoubleStream distinct() {
        return null;
    }

    private static List<Сource> getListOfCource(int i) {
        return null;
    }

    private static List<Сource> getListOfCource(int j, int m) {
        ArrayList<Сource> result = new ArrayList<>();
        for (int i = 0; i < j; i++) {
            ArrayList<Student> students = new ArrayList<>();
            for (int h = 0; h < m; h++) {
                students.add(new Student("Student" + h));
            }
            result.add(new Сource("student" + i, students));
        }
        return result;
    }
}