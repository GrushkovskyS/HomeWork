package less7.Project;
import java.io.IOException;
import java.util.List;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException;

    List<Weather> getSavedToDBWeather();
}
