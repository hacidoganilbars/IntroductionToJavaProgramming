package com.doganilbars.myfx006.main;

import com.doganilbars.myfx006.pane.DescriptionPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TextAreaDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		DescriptionPane descriptionPane = new DescriptionPane();

		descriptionPane.setTitle("Turkey");
		String description = "The Turkey national flag ...";
		descriptionPane.setImageView(new ImageView("image/turkey.jpg"));
		descriptionPane.setDescription(description);

		Scene scene = new Scene(descriptionPane, 450, 200);
		primaryStage.setTitle("TextAreaDemo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
