package Application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Controller {
    int click = 0;
    public Controller(){}
    @FXML
    private Button pushBtn;

    @FXML
    private Text tempData;

    @FXML
    private Label welcomeText;

    @FXML
    public void pushBtn(){
        pushBtn.setOnAction(actionEvent -> {
            click++;
            welcomeText.setText(String.valueOf(click));
            System.out.println(click);
        });
    }

}
