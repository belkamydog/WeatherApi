package weather.app.model.weather;

import lombok.Data;

/**
 * Contain info about wind
 * @see #getSpeed()
 * @see #getDeg()
 * @see #getGust()
 */
@Data
public class Wind{
    public double speed;
    public int deg;
    public double gust;
}
