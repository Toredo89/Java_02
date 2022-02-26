package lesson_4.task_2;

public class MainClass2 {
    public static void main(String[] args) {
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("--------------------");

        System.out.println("Напоняем справочник");
        phonebook.add("Петров", "89547458");
        phonebook.add("Иванов", "96548564");
        phonebook.add("Иванов", "69554122");
        phonebook.add("Козлов", "95444211");
        phonebook.add("Сидоров", "85545444");
        System.out.println("--------------------");

        System.out.println("Получаем номера");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Козлов");
        System.out.println(phonebook.get("Козлов"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("--------------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Александров");
        System.out.println(phonebook.get("Александров"));
        System.out.println("--------------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Иванов", "96548564");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}
