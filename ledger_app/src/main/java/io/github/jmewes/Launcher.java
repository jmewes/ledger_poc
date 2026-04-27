package io.github.jmewes;

/**
 * Entry point used when running from a fat jar.
 * <p>
 * JavaFX requires that the class listed in the jar manifest does not extend
 * {@link javafx.application.Application}, otherwise the runtime's class-loader
 * validation fails when launching from a shaded (uber) jar.  This thin
 * launcher delegates immediately to {@link App#main(String[])}.
 */
public class Launcher {
    public static void main(String[] args) {
        App.main(args);
    }
}
