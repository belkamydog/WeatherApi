package weather.app.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import weather.app.model.weather.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
  This class work with OpenWeather Api. It's get data in json deserialize to objects with weather data.
  You need call par. constructor with needs par-s and get Root object.
  You can get needs weather par-s in this object. Different getters help you.
  @author Artyom Efimov 21.01.2024
  @version 1.0
 */
@Getter
public class GetWeather {
    /**
     * Objects in this class contain weather data. Use getters for take it
     * @see Coord Coordidate
     * @see Clouds Clouds
     * @see Main Main data
     * @see Rain Rain
     * @see Snow Snow
     * @see Sys Sys
     * @see Weather Weather
     * @see Wind Wind
     * @see Root Root
     */
    private Root rootWeather;

    /**
     *
     * @param appid access token for Api
     * @param latitude latitude your city
     * @param longitude longitude your city
     * @param units Units of measurement ("standard", "metric", "imperial")
     * @param language language for fields from answer
     */
    public GetWeather(String appid, float latitude, float longitude, String units, String language) {
        createRequest(appid, latitude, longitude, units, language);
    }

    private void createRequest(String appid, float latitude, float longitude, String units, String language) {
        String url = "https://api.openweathermap.org/data/2.5/weather?" + "lat=" + latitude +
                "&lon=" + longitude +
                "&units=" + units +
                "&lang=" + language +
                "&appid=" + appid;
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> answer = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            rootWeather = objectMapper.readValue(answer.body(), Root.class);
        } catch (IOException | InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
