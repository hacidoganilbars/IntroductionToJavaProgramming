package com.doganilbars.myfx008;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

	private String[] flagTitles = { "Turkey", "Canada", "China", "Denmark", "France", "Germany", "India", "Norway",
			"England", "America" };

	private ImageView[] ImageViews = { new ImageView("image/turkey.jpg"), new ImageView("image/canada.jpg"),
			new ImageView("image/china.jpg"), new ImageView("image/denmark.jpg"), new ImageView("image/france.jpg"),
			new ImageView("image/germany.jpg"), new ImageView("image/india.jpg"), new ImageView("image/norway.jpg"),
			new ImageView("image/england.jpg"), new ImageView("image/america.jpg") };

	@Override
	public void start(Stage primaryStage) throws Exception {

		ListView<String> lv = new ListView<String>(FXCollections.observableArrayList(flagTitles));
		lv.setPrefSize(400, 400);
		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		FlowPane imagePane = new FlowPane(11, 11);
		BorderPane borderPane = new BorderPane();
		borderPane.setLeft(new ScrollPane(lv));
		borderPane.setCenter(imagePane);

		lv.getSelectionModel().selectedItemProperty().addListener(ov -> {
			imagePane.getChildren().clear();

			for (Integer i : lv.getSelectionModel().getSelectedIndices()) {
				imagePane.getChildren().add(ImageViews[i]);
			}
		});

		Scene scene = new Scene(borderPane, 450, 170);
		primaryStage.setTitle("ListViewDemo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
