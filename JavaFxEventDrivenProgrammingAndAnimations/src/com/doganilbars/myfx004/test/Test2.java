package com.doganilbars.myfx004.test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Test2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btnOk = new Button("OK");
		btnOk.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println(event.getSource());
			}
		});
		Scene scene = new Scene(btnOk);
		primaryStage.setTitle("Test2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
