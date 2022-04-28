package lesson_9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Domain {

    public static void main(String[] args) {
        List<Student> result = getStudentList(3,3);
        //1 задание
        result.stream().flatMap(student -> student.getStudentList().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(student -> student.getStudentList().stream()).collect(Collectors.toSet());

        //2 задание
        result.stream().sorted((student1,student2) -> student1.getStudentList().size() - student2.getStudentList().size()).limit(3).collect(Collectors.toList());

        //3 задание
        Cource paramCource = new Cource("cource1");
        result.stream().filter(house -> house.getStudentList().contains(paramCource)).collect(Collectors.toList());

        System.out.println();

    }

    private static List<Student> getStudentList(int student, int cource){
        ArrayList<Student> result = new ArrayList<>();
        for (int i=0; i<student ;i++){
            ArrayList<Cource> cources = new ArrayList<Cource>();
            for (int c=0; c<cource ;c++){
                cources.add(new Cource("cource"+c));
            }
            result.add(new Student("student"+i, cources));
        }
        return result;
    }
}