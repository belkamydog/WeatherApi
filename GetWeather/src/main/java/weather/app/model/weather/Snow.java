package weather.app.model.weather;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Snow{
    @JsonProperty("1h")
    private double _1h;
}
