package lesson_8;

public class MyClassBuilder {
    private String city;
    private String localDate;
    private String weather_text;
    private Double temperature;

    public MyClassBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public MyClassBuilder setLocalDate(String localDate) {
        this.localDate = localDate;
        return this;
    }

    public MyClassBuilder setWeather_text(String weather_text) {
        this.weather_text = weather_text;
        return this;
    }

    public MyClassBuilder setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
}