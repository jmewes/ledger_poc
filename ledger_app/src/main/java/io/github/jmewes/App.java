package io.github.jmewes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GreetingService greetingService = new GreetingServiceImpl();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/io/github/jmewes/main.fxml"));
        loader.setControllerFactory(controllerClass -> {
            if (controllerClass == MainController.class) {
                return new MainController(greetingService);
            }
            try {
                return controllerClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException("Failed to instantiate controller: " + controllerClass, e);
            }
        });

        Scene scene = new Scene(loader.load(), 400, 200);
        stage.setTitle("Ledger");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
