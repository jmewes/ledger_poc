package io.github.jmewes;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Injector injector = Guice.createInjector(new LedgerModule());

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/io/github/jmewes/main.fxml"));
        loader.setControllerFactory(injector::getInstance);

        Scene scene = new Scene(loader.load(), 400, 200);
        stage.setTitle("Ledger");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
