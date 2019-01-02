package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label helloWorld;
    private int count = 0;

    public void Count(ActionEvent actionEvent)
    {
        count++;
        helloWorld.setText("Score: " + String.valueOf(count));
    }
}
