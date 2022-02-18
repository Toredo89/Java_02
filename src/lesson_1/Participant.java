package lesson_1;

public class Participant {

    private String name;
    private int canPassTheCourse;

    public Participant(String name, int canPassTheCourse) {
        this.name = name;
        this.canPassTheCourse = canPassTheCourse;
    }

    public String getName() {
        return name;
    }

    public int getCanPassTheCourse() {
        return canPassTheCourse;
    }
}