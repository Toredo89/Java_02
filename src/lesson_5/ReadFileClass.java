package lesson_5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;


public class ReadFileClass {

    public static ArrayList<FIleObject> fIleObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "src/lesson_5/Task.csv";
    public static final String title = "value1"+ ";" + "value2"
            + ";" + "value3" + ";"+ System.getProperty("line.separator");


    public static void main(String[] args) throws IOException {
        createFileObjects();
        writeStream();

        AppData appData = readToObject();
    }

    public static void createFileObjects(){
        Random random = new Random();

        for(int i=1;i<50;i++){
            fIleObjectArrayList.add( new FIleObject(i, random.nextInt(50), random.nextInt(100)));
        }
    }

    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile);){
            writer.write(title);
            for(FIleObject fIleObject : fIleObjectArrayList) {
                writer.write(fIleObject.getValue() + ";" + fIleObject.getValueFrom()
                        + ";" + fIleObject.getValueFrom() + ";"+ System.getProperty("line.separator"));
            }
        }
    }

    public static void writeStream() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile)){
            for(byte b :title.getBytes(StandardCharsets.UTF_8)){
                fileOutputStream.write(b);
            }
            for(FIleObject fIleObject : fIleObjectArrayList){
                String raw = fIleObject.getValue() + ";" + fIleObject.getValueFrom()
                        + ";" + fIleObject.getValueTo() + ";"+ System.getProperty("line.separator");
                for(byte b :raw.getBytes(StandardCharsets.UTF_8)){
                    fileOutputStream.write(b);
                }
            }
        }
    }

    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                System.out.println(title);
                System.out.println(line);
            }
        };

        return appData;
    }
}




