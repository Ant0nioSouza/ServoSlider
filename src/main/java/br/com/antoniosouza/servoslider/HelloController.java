package br.com.antoniosouza.servoslider;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Slider servoSlider;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Slide to slide in real life!");
    }

    @FXML
    protected void updateSliderValue() {
        welcomeText.setText("actual Slider value is " + Double.toString(servoSlider.getValue()));
    }
}