package com.doganilbars.myfx010;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BounceBallSlider extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BallPane ballPane = new BallPane();
		Slider slSpeed = new Slider();
		slSpeed.setMax(20);
		ballPane.rateProperty().bind(slSpeed.valueProperty());

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(ballPane);
		borderPane.setBottom(slSpeed);

		Scene scene = new Scene(borderPane, 250, 250);
		primaryStage.setTitle("BounceBallSlider");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
