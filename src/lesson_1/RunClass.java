package lesson_1;

public class RunClass {

    public static void main(String[] args) {
        Participant[] participant = new Participant[4];
        participant[0] = new Participant("Андрей", 100);
        participant[1] = new Participant("Иван", 100);
        participant[2] = new Participant("Сергей", 100);
        participant[3] = new Participant("Алексей", 100);
        Team team = new Team("Вперед", participant);

        Course  course  = new Course (200);
        String result = course.doIt(team);
        System.out.println(result);

    }
}