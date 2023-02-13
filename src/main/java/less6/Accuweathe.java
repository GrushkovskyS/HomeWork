package less6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
public class Accuweathe {

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient()

                .newBuilder()
                .build();

        HttpUrl httpUrl = new HttpUrl.Builder()

                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegments("forecasts/v1/daily/1day/349727")
                .addQueryParameter("apikey", "hAfhU7N5O5QeFa9SDysQSuXTlpjR2R0w")
                .addQueryParameter("language", "en")
                //    .addQueryParameter("details", "true")
                //  .addQueryParameter("metric", "true")
                .build();

        Request request = new Request.Builder()

                .url(httpUrl)
                .get()
                .build();

        Response response = client.newCall(request).execute();
        String body = response.body().string();

        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(body);
    }
}