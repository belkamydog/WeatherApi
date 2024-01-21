package weather.app.model.weather;

import lombok.Data;

/**
 * Contain main weather data
 * @see #getTemp()
 * @see #getFeels_like()
 * @see #getTemp_min()
 * @see #getTemp_max()
 * @see #getPressure()
 * @see #getHumidity()
 * @see #getSea_level()
 * @see #getGrnd_level()
 */
@Data
public class Main{
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;
    private int sea_level;
    private int grnd_level;
}
