package weather.app.model.weather;

import lombok.Data;

/**
 * Contain add data about weather
 * @see #getId()
 * @see #getMain()
 * @see #getDescription()
 * @see #getIcon()
 */
@Data
public class Weather{
    public int id;
    public String main;
    public String description;
    public String icon;
}
