package io.github.jmewes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label greetingLabel;

    private final GreetingService greetingService;

    public MainController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @FXML
    public void initialize() {
        greetingLabel.setText(greetingService.getGreeting());
    }
}
