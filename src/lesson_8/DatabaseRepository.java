package lesson_8;

import lesson_8.Weather.WeatherData;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public interface DatabaseRepository {

    boolean saveWeatherData(WeatherData weatherData) throws SQLException;

    List<WeatherData> getAllSavedData() throws IOException;
}