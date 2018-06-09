package com.doganilbars.myfx005;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LambdaHandlerDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btnNew = new Button("New");
		Button btnOpen = new Button("Open");
		Button btnSave = new Button("Save");
		Button btnPrint = new Button("Print");
		hBox.getChildren().addAll(btnNew, btnOpen, btnPrint, btnSave);

		btnNew.setOnAction((ActionEvent e) -> {
			System.out.println("Process New");
		});

		btnOpen.setOnAction((e) -> {
			System.out.println("Process Open");
		});

		btnSave.setOnAction(e -> {
			System.out.println("Process Save");
		});

		btnPrint.setOnAction(e -> System.out.println("Process Print"));

		Scene scene = new Scene(hBox, 300, 50);
		primaryStage.setTitle("LambdaHandlerDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
