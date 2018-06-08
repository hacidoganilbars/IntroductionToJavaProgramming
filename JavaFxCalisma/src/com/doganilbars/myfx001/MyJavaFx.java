package com.doganilbars.myfx001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button btOk = new Button("OK");
		Scene scene = new Scene(btOk, 200, 250);
		primaryStage.setTitle("MyJavaFx");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
