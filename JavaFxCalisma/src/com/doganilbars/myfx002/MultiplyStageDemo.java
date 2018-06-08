package com.doganilbars.myfx002;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultiplyStageDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new Button("OK"), 200, 250);
		primaryStage.setTitle("MyJavaFx");
		primaryStage.setScene(scene);
		primaryStage.show();

		Stage stage = new Stage();
		stage.setTitle("Second Stage");
		stage.setScene(new Scene(new Button("New Stage"), 100, 100));
		stage.show();
	}

	// public static void main(String[] args) {
	// launch(args);
	// }
}
