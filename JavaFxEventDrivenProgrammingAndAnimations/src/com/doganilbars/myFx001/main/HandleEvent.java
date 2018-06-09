package com.doganilbars.myFx001.main;

import com.doganilbars.myFx001.handler.CancelHandler;
import com.doganilbars.myFx001.handler.OKHandler;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class HandleEvent extends Application {
	@Override
	public void start(Stage primaryStage) {
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btnOK = new Button("OK");
		Button btnCancel = new Button("Cancel");
		OKHandler handler1 = new OKHandler();
		btnOK.setOnAction(handler1);
		CancelHandler handler2 = new CancelHandler();
		btnCancel.setOnAction(handler2);
		pane.getChildren().addAll(btnOK, btnCancel);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("HandleEvent");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
