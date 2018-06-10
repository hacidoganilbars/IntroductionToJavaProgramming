package com.doganilbars.myfx011.main;

import com.doganilbars.myfx011.pane.ClockPane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayResizableClock extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		ClockPane clockPane = new ClockPane();
		String timeString = clockPane.getHour() + ":" + clockPane.getMinute() + ":" + clockPane.getSecond();
		Label lblCurrentTime = new Label(timeString);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(clockPane);
		borderPane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

		Scene scene = new Scene(borderPane, 250, 250);
		primaryStage.setTitle("DisplayClock");
		primaryStage.setScene(scene);
		primaryStage.show();

		borderPane.widthProperty().addListener(observable -> clockPane.setW(clockPane.getWidth()));
		borderPane.heightProperty().addListener(observable -> clockPane.setH(clockPane.getHeight()));
	}

	public static void main(String[] args) {
		launch(args);
	}

}
