package Lesson6;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.*;
import java.util.Properties;

public class Main {

    static Properties prop = new Properties();

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/290868?apikey=euSBXAD7RDq8QGTgLvkiA5XNQ0aGQfPb&language=ru")
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);


    }


}