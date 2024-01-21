package weather.app;

import org.junit.Assert;
import org.junit.Test;
import weather.app.controller.GetWeather;

public class AppTest {

    @Test
    public void SimpleTest() {
        GetWeather getWeather = new GetWeather("095013fbfdec555a78dfffb6689c49e8", 55.788f, 49.1221f, "metric", "ru");
        Assert.assertEquals(200, getWeather.getRootWeather().getCod());
    }
}
