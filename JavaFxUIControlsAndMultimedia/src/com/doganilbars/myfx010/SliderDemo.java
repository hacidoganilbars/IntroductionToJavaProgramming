package com.doganilbars.myfx010;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SliderDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Text text = new Text(20, 20, "JavaFX Programming");

		Slider slHorizontal = new Slider();
		slHorizontal.setShowTickLabels(true);
		slHorizontal.setShowTickMarks(true);

		Slider slVertical = new Slider();
		slVertical.setOrientation(Orientation.VERTICAL);
		slVertical.setShowTickLabels(true);
		slVertical.setShowTickMarks(true);
		slHorizontal.setValue(100);

		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(paneForText);
		borderPane.setBottom(slHorizontal);
		borderPane.setRight(slVertical);

		slHorizontal.valueProperty()
				.addListener(ov -> text.setX(slHorizontal.getValue() * paneForText.getWidth() / slHorizontal.getMax()));

		slVertical.valueProperty()
				.addListener(ov -> text.setY(slVertical.getValue() * paneForText.getHeight() / slVertical.getMax()));

//		text.xProperty().bind(
//				slHorizontal.valueProperty().multiply(paneForText.widthProperty()).divide(slHorizontal.maxProperty()));
//
//		text.yProperty().bind((slVertical.maxProperty().subtract(slVertical.valueProperty())
//				.multiply(paneForText.heightProperty().divide(slVertical.maxProperty()))));

		Scene scene = new Scene(borderPane, 450, 170);
		primaryStage.setTitle("SliderDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
