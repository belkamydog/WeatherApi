package weather.app.model.weather;

import lombok.Data;

import java.util.ArrayList;

/**
 * Contain objects with weather data
 * @see Coord
 * @see Weather
 * @see #getBase()
 * @see Main
 * @see #getVisibility()
 * @see Wind
 * @see Rain
 * @see Snow
 * @see Clouds
 * @see #getDt()
 * @see Sys
 * @see #getTimezone()
 * @see #getId()
 * @see #getName()
 * @see #getCod()
 */
@Data
public class Root {
    private Coord coord;
    private ArrayList<Weather> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Rain rain;
    private Snow snow;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;
}
