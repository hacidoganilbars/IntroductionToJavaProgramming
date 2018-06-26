package com.doganilbars.collections006;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MultipleBounceBall extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		MultipleBallPane ballPane = new MultipleBallPane();
		ballPane.setStyle("-fx-border-color: yellow");

		Button btnAdd = new Button("+");
		Button btnSubstract = new Button("-");
		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(btnAdd, btnSubstract);
		hBox.setAlignment(Pos.CENTER);

		btnAdd.setOnAction(e -> ballPane.add());
		btnSubstract.setOnAction(e -> ballPane.subtract());

		ballPane.setOnMousePressed(e -> ballPane.pause());
		ballPane.setOnMouseReleased(e -> ballPane.play());

		ScrollBar sbSpeed = new ScrollBar();
		sbSpeed.setMax(20);
		sbSpeed.setValue(10);
		ballPane.rateProperty().bind(sbSpeed.valueProperty());

		BorderPane pane = new BorderPane();
		pane.setCenter(ballPane);
		pane.setTop(sbSpeed);
		pane.setBottom(hBox);

		Scene scene = new Scene(pane, 250, 150);
		primaryStage.setTitle("MultipleBounceBall");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
