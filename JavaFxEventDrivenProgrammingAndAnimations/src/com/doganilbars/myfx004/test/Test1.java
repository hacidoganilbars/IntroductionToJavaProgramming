package com.doganilbars.myfx004.test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hBox = new HBox();
		hBox.setAlignment(Pos.CENTER);
		Button btnOk = new Button("OK");
		hBox.getChildren().add(btnOk);
		
		btnOk.setOnAction(new Handler());
		
		Scene scene = new Scene(hBox);
		primaryStage.setTitle("Test1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	class Handler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			System.out.println(event.getSource());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
