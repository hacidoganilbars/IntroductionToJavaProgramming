package com.doganilbars.myfx016.main;

import com.doganilbars.myfx016.pane.ClockPane;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClockAnimation extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		ClockPane clockPane = new ClockPane();

		EventHandler<ActionEvent> eventHandler = e -> {
			clockPane.setCurrentTime();
		};

		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();

		Scene scene = new Scene(clockPane, 250, 250);
		primaryStage.setTitle("ClockAnimation");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
