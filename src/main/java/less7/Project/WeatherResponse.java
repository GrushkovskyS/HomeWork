package less7.Project;

import com.fasterxml.jackson.databind.ObjectMapper;


public class WeatherResponse extends AccuweatherModel{
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Weather weather = objectMapper.convertValue(UserInterfaceView.runInterface(),Weather.class);

        System.out.println(weather);
    }
}
