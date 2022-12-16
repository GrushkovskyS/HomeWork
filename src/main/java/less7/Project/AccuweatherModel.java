package less7.Project;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class AccuweatherModel implements WeatherModel{

    private static final String PROTOCOL = "http";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECAST = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY ="1day";
    private static final String FIVE_DAYS = "5day";
    private static final String API_KEY = "MgywqraNghnsQMvrv9ogidLQRIo3iS0P";
    private static final String API_KRY_QUERY_PARAM = "apikey";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    private DataBaseRepository dataBaseRepository = new DataBaseRepository();

    @Override
    public void getWeather(String selectedCity, Period period) throws IOException {
        switch (period){
            case NOW:
                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOCOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECAST )
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(ONE_DAY)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KRY_QUERY_PARAM, API_KEY)
                        .build();

                Request request =new Request.Builder()
                        .url(httpUrl)
                        .build();

                Response oneDayEorecastResponse = okHttpClient.newCall(request).execute();
                String weatherResponse = oneDayEorecastResponse.body().string();
                System.out.println(weatherResponse);

                dataBaseRepository.getSavedToDBWeather();

                break;


            case FIVE_DAYS:
                HttpUrl httpUrl5 = new HttpUrl.Builder()
                        .scheme(PROTOCOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECAST )
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAYS)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KRY_QUERY_PARAM, API_KEY)
                        .build();

                Request request5 =new Request.Builder()
                        .url(httpUrl5)
                        .build();

                Response fiveDayEorecastResponse = okHttpClient.newCall(request5).execute();
                String weatherResponse5 = fiveDayEorecastResponse.body().string();
                System.out.println(weatherResponse5);
                break;
        }

    }

    private String detectCityKey(String selectedCity) throws IOException {

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KRY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q",selectedCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response cityResponse = okHttpClient.newCall(request).execute();
        String weatherResponse = cityResponse.body().string();
        String cityKey = objectMapper.readTree(weatherResponse).get(0).at("/Key").asText();

       // System.out.println(cityKey);

        return cityKey;
    }

    @Override
    public List<Weather> getSavedToDBWeather() {
        return dataBaseRepository.getSavedToDBWeather();

    }

    public static void main(String[] args) throws IOException {
        UserInterfaceView userInterfaceView = new UserInterfaceView();
        UserInterfaceView.runInterface();
    }

}
