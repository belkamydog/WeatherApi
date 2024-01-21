package weather.app.model.weather;

import lombok.Data;

/**
 * Contain coordinate of place
 * @see #getLat()
 * @see #getLon()
 */
@Data
public class Coord {
    private double lon;
    private double lat;
}
