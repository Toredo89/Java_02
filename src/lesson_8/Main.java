package lesson_8;

import lesson_8.Weather.WeatherData;

import java.sql.*;
import java.util.ArrayList;

public class Main extends DatabaseRepositorySQLiteImpl {

    @Override
    public boolean saveWeatherData(WeatherData weatherData) throws SQLException {
        return super.saveWeatherData(weatherData);
    }

    static WeatherData weatherData;

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8db.db");
             Statement statement = connection.createStatement()) {

            // Пример очистки при запуске
            performDropTable(statement);

            // Пример создания БД
            performCreateDB(statement);

            // Примеры вставки записей, autoCommit
            populateDB(statement, connection);

            // Пример обновления записей
            performUpdateDb(statement);

            // Удаление записей
            performDeleteRows(statement);

            // Демонстрация prepared statement
            //performPreparedStatement(connection, weatherData);

            performUpdateWeather();

        }

    }

    private static void performUpdateWeather() {
    }

    private static void performCreateDB(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE weather (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "city STRING, localDate STRING, weather_text STRING, temperature Double);");
    }

    private static void performDeleteRows(Statement statement) throws SQLException {
        statement.executeUpdate("DELETE FROM weather WHERE id > 10");
    }


    private static void performUpdateWeather(String s, Statement statement) throws SQLException {
        switch (statement.executeUpdate(s)) {
        }
    }

    private static void performDropTable(Statement statement) throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS weather");
    }

    /**
     * @param connection
     * @param weatherData
     * @throws SQLException
     */
     private static void performCreateDB(Connection connection, WeatherData weatherData) throws SQLException {
         ArrayList<MyClass> arrayList;
         try (PreparedStatement saveWeather = connection.prepareStatement(insertWeatherQuery)) {
             for (MyClass myClass : arrayList = new ArrayList<MyClass>()) {

             }

             saveWeather.setString(1, weatherData.getCity());
             saveWeather.setString(2, weatherData.getLocalDate());
             saveWeather.setString(3, weatherData.getText());
             saveWeather.setDouble(4, weatherData.getTemperature());
             saveWeather.execute();
             return;
         } catch (SQLException throwable) {
             throwable.printStackTrace();
         }
         throw new SQLException("Failure on saving weather string");
     }




    String filename = "lesson8db.db";
    static String insertWeatherQuery = "INSERT INTO weather (city, localDate, weather_text, temperature) VALUES (?,?,?,?)";

    private static void performUpdateDb(Statement statement) throws SQLException {
        performUpdateWeather(statement);
        either("UPDATE weather SET temperature = 0 WHERE id > 10");
    }

    private static void performUpdateWeather(Statement statement) {
    }

    private static void either(String s) {
    }

    private static void populateDB(Statement statement, Connection connection) throws SQLException {
        String city;
        String localDate;
        String weather_text;
        Double temperature;

        String performCreateDB = new String();
        String createDB = performCreateDB;
        {
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS weather (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "city TEXT NOT NULL, localDate TEXT NOT NULL, weather_text TEXT NOT NULL, temperature REAL NOT NULL);");
        }

        String readWeatherFromDB = new String();
        String weatherFromDB = readWeatherFromDB;
        WeatherData weatherData = Main.weatherData;
        {
            System.out.println("");
        }
    }

    public static void setWeatherData(WeatherData weatherData) {
        Main.weatherData = weatherData;
    }

    public class MyClass {
        private String city;
        private String localDate;
        private String weather_text;
        private Double temperature;

        public MyClass(String string, String string1, String string2, String string3, double temperature) {
        }
    }
}



