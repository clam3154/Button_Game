package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class BackEnd
{
    public Label score;
    private int count = 0;

    public void pressButton(ActionEvent actionEvent)
    {
        count++;
        score.setText("Score: " + String.valueOf(count));
    }
}