package com.doganilbars.myfx009.main;

import com.doganilbars.myfx009.pane.CirclePane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ControlCircleWithMouseAndKey extends Application {

	private CirclePane circlePane = new CirclePane();

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btnEnlarge = new Button("Enlarge");
		Button btnShrink = new Button("Shrink");
		hBox.getChildren().add(btnEnlarge);
		hBox.getChildren().add(btnShrink);

		btnEnlarge.setOnAction(e -> circlePane.enLarge());
		btnShrink.setOnAction(e -> circlePane.shrink());

		circlePane.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				circlePane.enLarge();
			} else if (e.getButton() == MouseButton.SECONDARY) {
				circlePane.shrink();
			}
		});

		circlePane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.U) {
				circlePane.enLarge();
			} else if (e.getCode() == KeyCode.D) {
				circlePane.shrink();
			}
		});

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);

		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("ControlCircle");
		primaryStage.setScene(scene);
		primaryStage.show();

		circlePane.requestFocus();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
