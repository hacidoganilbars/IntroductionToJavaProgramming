package com.doganilbars.myfx003.main;

import com.doganilbars.myfx003.pane.CirclePane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ControlCircle extends Application {

	private CirclePane circlePane = new CirclePane();

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btnEnlarge = new Button("Enlarge");
		Button btnShrink = new Button("Shrink");
		hBox.getChildren().addAll(btnEnlarge, btnShrink);

		btnEnlarge.setOnAction(new EnlargeHandler());
		btnShrink.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
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

	}

	class EnlargeHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent actionEvent) {
			circlePane.enLarge();
		}
	}

//	class ShrinkHandler implements EventHandler<ActionEvent> {
//
//		@Override
//		public void handle(ActionEvent event) {
//			circlePane.shrink();
//		}
//	}

	public static void main(String[] args) {
		launch(args);
	}
}
