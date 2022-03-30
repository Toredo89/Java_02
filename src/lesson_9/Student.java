package lesson_9;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;

import java.nio.file.FileStore;
import java.util.*;
import java.util.stream.Collectors;

import static lesson_9.Сourses.courses.ProgrammingCourses;
import static lesson_9.Сourses.courses.*;

public class Student<students> {

    private static Object Attendance;

    private static <o1> int compare(Object o1, Object o2) {
        return (int) o2;
    }

    enum Cource {
    }

    private String name;
    private static String take_courses;
    private static int attendance;

    public Student(PropertyName name, Object programmingCourses) {
    }
    String getTake_courses; int getAttendance;

    private void streamSimpleTask() {
        List<Student> Students = new ArrayList<>(Arrays.asList(
                new Student("Ivan", ProgrammingCourses),
                new Student("Petr", ComputerScienceCourses),
                new Student("Aleks", ComputerScienceCourses),
                new Student("Marti", ComputerScienceCourses),
                new Student("Roman", ProgrammingCourses),
                new Student("Dima", TestingTheoryCourses),
                new Student("Evgen", TestingTheoryCourses),
                new Student("Arthur", ProgrammingCourses)
        ));
        Collection<Object> students = null;
        List<String> studentsNames = students.stream()
                .filter(student -> Student.Attendance == students)
                .sorted(Student::compare)
                .map(student -> student.name)
                .collect(Collectors.toList());
        System.out.println(studentsNames);
    }

    private static List<Student> getList(){
        Faker faker = new Faker();
        Random random = new Random(20);
        Random randomPosition = new Random();
        Random randomSalary = new Random();
        for(int i =0; i<100;i++){
            Random randomWork = new Random();
            Random randomValue = new Random();
            List<Student> student = new ArrayList<Student>();
            for(int j=0;j<randomWork.nextInt(4); j++){
                attendance(Student.attendance(faker.courses().name(), randomValue.nextInt(10)));
            }

            Student students = new Student(faker.name().fullName(),random.nextInt(65));
            Object[] Student = new Object[0];
            Object o = (Student)[randomPosition.nextInt(2)];
            randomSalary.nextInt(1000);
            students.add(student);
        }
        return null;
    }

    private void add(List<Student> student) {
    }

    private static void attendance(Object attendance) {
    }

    private static Object attendance(String name, int nextInt) {
    }

    private static class Faker {
        public FileStore courses() {
            return null;
        }

        public Faker bool() {
            return null;
        }

        public CreatorCandidate.Param name() {


        class Сourses{
            String label;
            Integer value;

            public Сourses(String label, Integer value) {
                this.label = label;
                this.value = value;
            }
        }
    }
}
