package weather.app.model.weather;

import lombok.Data;

/**
 * Contain sys info
 * @see #getId()
 * @see #getCountry()
 * @see #getType()
 * @see #getSunrise()
 * @see #getSunset()
 */
@Data
public class Sys{
    private int type;
    private int id;
    private String country;
    private int sunrise;
    private int sunset;
}
