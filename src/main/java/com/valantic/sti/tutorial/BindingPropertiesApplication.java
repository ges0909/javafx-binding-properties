package com.valantic.sti.tutorial;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BindingPropertiesApplication extends Application {
    Stage window;

    @Override
    public void start(final Stage stage) {
        window = stage;
        window.setTitle("Binding Properties");

        final TextField userInput = new TextField();
        userInput.setMaxWidth(200);

        // bottom text
        final Label firstLabel = new Label("Welcome to the site ");
        final Label secondLabel = new Label();
        final HBox bottomText = new HBox(firstLabel, secondLabel);
        bottomText.setAlignment(Pos.CENTER);

        final VBox vBox = new VBox(10, userInput, bottomText);
        vBox.setAlignment(Pos.CENTER);

        secondLabel.textProperty().bind(userInput.textProperty());

        final Scene scene = new Scene(vBox, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(final String... args) {
        launch(args);
    }
}