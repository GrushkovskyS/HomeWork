package less7.Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseRepository {
    private String insertWeather = "insert into weather (city, localdate, temperature) values (?, ?, ?)";
    private String getWeather = "select * from weather";
    private static final String DB_PATH = "jdbc:sqlite:geek.db";

  static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean saveWeatherToDataBase(Weather weather) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_PATH)){
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
            saveWeather.setString(1, weather.getCity());
            saveWeather.setString(2, weather.getLocalDate());
            saveWeather.setDouble(3, weather.getTemperature());
            return saveWeather.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new SQLException("Сохранение не выполнилось");
    }

    public void saveWeatherToDataBase(List<Weather> weatherList) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_PATH)){
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
          for (Weather weather : weatherList) {
              saveWeather.setString(1, weather.getCity());
              saveWeather.setString(2, weather.getLocalDate());
              saveWeather.setDouble(3, weather.getTemperature());
              saveWeather.addBatch();
          }
            saveWeather.addBatch();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    public List<Weather> getSavedToDBWeather() {
      List<Weather> weather =new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_PATH)){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getWeather);
            while (resultSet.next()){
                System.out.print(resultSet.getInt("id"));
                System.out.println(" ");
                System.out.print(resultSet.getString("city"));
                System.out.println(" ");
                System.out.print(resultSet.getString("localdate"));
                System.out.println(" ");
                System.out.print(resultSet.getDouble("temperature"));
                System.out.println(" ");
                weather.add (new Weather(resultSet.getString("city"),
                        resultSet.getString("localdate"),
                        resultSet.getDouble("temperature")));
            }
        } catch (SQLException throwables) {
                throwables.printStackTrace();
        }
      return weather;
    }

    public static void main(String[] args) throws SQLException {
      DataBaseRepository dataBaseRepository = new DataBaseRepository();
        System.out.println(dataBaseRepository.getSavedToDBWeather());

    }
}
