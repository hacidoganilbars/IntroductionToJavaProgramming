package com.doganilbars.myfx002;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonDemo extends Application {
	protected Text text = new Text(50, 50, "JavaFX Programming");

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(getPane(), 450, 200);
		primaryStage.setTitle("ButtonDemo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	protected BorderPane getPane() {
		HBox paneForButtons = new HBox(20);
		Button btnLeft = new Button("Left", new ImageView("image/left.gif"));
		Button btnRight = new Button("Right", new ImageView("image/right.gif"));
		paneForButtons.getChildren().addAll(btnLeft, btnRight);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-color: green");

		BorderPane borderPane = new BorderPane();
		borderPane.setBottom(paneForButtons);

		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		borderPane.setCenter(paneForText);

		btnLeft.setOnAction(e -> text.setX(text.getX() - 10));
		btnRight.setOnAction(e -> text.setX(text.getX() + 10));

		return borderPane;

	}

	public static void main(String[] args) {
		launch(args);
	}

}
