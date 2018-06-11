package com.doganilbars.myfx001;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class LabelWithGraphic extends Application {
	@Override
	public void start(Stage primaryStage) {
		ImageView tr = new ImageView("image/turk.gif");
		Label lbl1 = new Label("TR\n90 Türkiye", tr);
		lbl1.setStyle("-fx-border-color: green; -fx-border-width: 2");
		lbl1.setContentDisplay(ContentDisplay.BOTTOM);
		lbl1.setTextFill(Color.RED);

		Label lbl2 = new Label("Circle", new Circle(50, 50, 25));
		lbl2.setContentDisplay(ContentDisplay.TOP);
		lbl2.setTextFill(Color.ORANGE);

		Label lbl3 = new Label("Rectangle", new Rectangle(10, 10, 50, 25));
		lbl3.setContentDisplay(ContentDisplay.RIGHT);

		Label lbl4 = new Label("Ellipse", new Ellipse(50, 50, 50, 25));
		lbl4.setContentDisplay(ContentDisplay.LEFT);

		Ellipse ellipse = new Ellipse(50, 50, 50, 25);
		ellipse.setStroke(Color.GREEN);
		ellipse.setFill(Color.WHITE);
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));
		Label lbl5 = new Label("A pane inside a label", stackPane);
		lbl5.setContentDisplay(ContentDisplay.BOTTOM);

		HBox hBox = new HBox(20);
		hBox.getChildren().addAll(lbl1, lbl2, lbl3, lbl4, lbl5);

		Scene scene = new Scene(hBox, 450, 150);
		primaryStage.setTitle("LabelWithGraphic");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
