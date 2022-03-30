package lesson_9;

public class Сourses {
    public Сourses(String courses, int take_courses) {
        this.courses = courses;
        this.take_courses = String.valueOf(take_courses);
    }

    enum courses {
        ProgrammingCourses, ComputerScienceCourses, TestingTheoryCourses;
    }
    private String courses;
    private String take_courses;
    int attendance;

    public Сourses(String courses, String take_courses, int attendance) {
        this.courses = courses;
        this.take_courses = take_courses;
        this.attendance = attendance;
    }
}
