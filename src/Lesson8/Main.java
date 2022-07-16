package Lesson8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Lesson8.DatabaseRepositorySQLiteImpl;
import Lesson8.entity.WeatherData;

public class Main {
    public static void main(String[] args) throws SQLException {

        WeatherData weather = new WeatherData("Tomsk", "2022-07-14", "weather", 20.5);
        DatabaseRepositorySQLiteImpl connection = new DatabaseRepositorySQLiteImpl();
        connection.getConnection();
        connection.createTableIfNotExists();
        connection.saveWeatherData(weather);

    }
}
