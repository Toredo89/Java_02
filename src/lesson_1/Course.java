package lesson_1;

public class Course  {
    String result;
    private int run;



    public Course (int run) {
        this.run = run;

    }

    public String doIt(Team team){
        result = "Команда: "+ team.getName()+ " " + '\n';
        for(Participant participant: team.getParticipants()){
            result += "Имя участника: " + participant.getName()+ " " + '\n';
            int value = participant.getCanPassTheCourse();
            testRun(value);


        }

        return result;
    }

    private void testRun(int value){
        if(value<run) result += "Бег - пробежал "+ '\n';

    }

}