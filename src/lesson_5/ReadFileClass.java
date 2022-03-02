package lesson_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReadFileClass {

    public static ArrayList<FIleObject> fIleObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "src/lesson_5/Task.csv";
    public static final String title = "value1"+ ";" + "value2"
            + ";" + "value3" + ";" + System.getProperty("line.separator");



    public static void main(String[] args) throws IOException {


        AppData appData = readToObject();
    }

    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while (null != (line = br.readLine())) {
                String[] values = line.split(";");
                System.out.println(title);
                System.out.println(line);
            }
        }

        return appData;
    }
}

