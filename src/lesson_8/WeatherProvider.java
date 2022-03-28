package lesson_8;

import lesson_8.Weather.WeatherData;
import project.Periods;

import java.io.IOException;

public interface WeatherProvider {
    WeatherData getWeather(Periods periods) throws IOException;
    WeatherData getAllFromDb() throws IOException;
}
