package com.doganilbars.myfx009;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScrollBarDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Text text = new Text(20, 20, "JavaFX Programming");

		ScrollBar sbHorizontal = new ScrollBar();
		ScrollBar sbVertical = new ScrollBar();
		sbVertical.setOrientation(Orientation.VERTICAL);

		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(paneForText);
		borderPane.setBottom(sbHorizontal);
		borderPane.setRight(sbVertical);

		sbHorizontal.valueProperty()
				.addListener(ov -> text.setX(sbHorizontal.getValue() * paneForText.getWidth() / sbHorizontal.getMax()));

		sbVertical.valueProperty()
				.addListener(ov -> text.setY(sbVertical.getValue() * paneForText.getHeight() / sbVertical.getMax()));

//		text.xProperty().bind(
//				sbHorizontal.valueProperty().multiply(paneForText.widthProperty()).divide(sbHorizontal.maxProperty()));
//
//		text.yProperty().bind(
//				sbVertical.valueProperty().multiply(paneForText.heightProperty().divide(sbVertical.maxProperty())));

		Scene scene = new Scene(borderPane, 450, 170);
		primaryStage.setTitle("ScrollBarDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
