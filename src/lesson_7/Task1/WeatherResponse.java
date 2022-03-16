package lesson_7.Task1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.util.List;

class WeatherResponse  {

    private static String CITY = null;
    private static String DATE = null;
    private final Object City;
    private final Object Date;
    private String WeatherText;
    public Object values = null;
    private Object Temperature;

    public WeatherResponse(Object city, Object date, Object values) {
        City = city;
        Date = date;
        this.values = values;
    }

    static class ShowWeather {
        private String City;
        private String Date;
        private String WeatherText;
        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        private Object Temperature;
        @JsonSerialize()
        @JsonDeserialize()
        //@JsonProperty("birth_date")
        private LocalDate birthdate;
        private List<String> values;

        ShowWeather(List<String> values) {
            this.values = values;
        }
    }

        {
            this.WeatherText = WeatherText;
            this.Temperature = Temperature;
            this.values = values;
        }




        @JsonGetter("CITY")
        public String getCITY() {
            return CITY;
        }

        @JsonGetter("DATE")
        public String getDATE() {
            return DATE;
        }

        @JsonGetter("WeatherText")
        public String getWeatherText() {
            return WeatherText;
        }

        @JsonGetter("Temperature")
        public Object getTemperature() {
            return Temperature;
        }


        // Setter Methods

        @JsonSetter("CITY")
        public void setCITY(String CITY) {
            this.CITY = CITY;
        }

        @JsonSetter("DATE")
        public void setDATE(String DATE) {
            this.DATE = DATE;
        }

        @JsonSetter("WeatherText")
        public void setWeatherText(String WeatherText) {
            this.WeatherText = WeatherText;
        }

        @JsonSetter("Temperature")
        public void setTemperature(Object Temperature) {
            this.Temperature = Temperature;
        }

    }

    class temperature {
        Metric MetricObject;
        Imperial ImperialObject;


        // Getter Methods

        public Metric getMetric() {
            return MetricObject;
        }

        public Imperial getImperial() {
            return ImperialObject;
        }

        // Setter Methods

        public void setMetric(Metric MetricObject) {
            this.MetricObject = MetricObject;
        }

        public void setImperial(Imperial ImperialObject) {
            this.ImperialObject = ImperialObject;
        }
    }

    class Imperial {
        private float Value;
        private String Unit;
        private float UnitType;


        // Getter Methods

        public float getValue() {
            return Value;
        }

        public String getUnit() {
            return Unit;
        }

        public float getUnitType() {
            return UnitType;
        }

        // Setter Methods

        public void setValue(float Value) {
            this.Value = Value;
        }

        public void setUnit(String Unit) {
            this.Unit = Unit;
        }

        public void setUnitType(float UnitType) {
            this.UnitType = UnitType;
        }
    }

    class Metric {
        private float Value;
        private String Unit;
        private float UnitType;


        // Getter Methods

        public float getValue() {
            return Value;
        }

        public String getUnit() {
            return Unit;
        }

        public float getUnitType() {
            return UnitType;
        }

        // Setter Methods

        public void setValue(float Value) {
            this.Value = Value;
        }

        public void setUnit(String Unit) {
            this.Unit = Unit;
        }

        public void setUnitType(float UnitType) {
            this.UnitType = UnitType;
        }
    }






