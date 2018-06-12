package com.doganilbars.myfx013;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class FlagAnthem extends Application {

	private static final int NUMBER_OF_NATIONS = 7;
	private static final String URLBase = "http://cs.armstrong.edu/liang/common";
	private int currentIndex = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Image[] images = new Image[NUMBER_OF_NATIONS];
		MediaPlayer[] mp = new MediaPlayer[NUMBER_OF_NATIONS];

		for (int i = 0; i < NUMBER_OF_NATIONS; i++) {
			images[i] = new Image(URLBase + "/image/flag" + i + ".gif");
			mp[i] = new MediaPlayer(new Media(URLBase + "/audio/anthem/anthem" + i + ".mp3"));
		}

		Button btnPlayPause = new Button(">");
		btnPlayPause.setOnAction(e -> {
			if (btnPlayPause.getText().equals(">")) {
				btnPlayPause.setText("||");
				mp[currentIndex].pause();
				;
			} else {
				btnPlayPause.setText(">");
				mp[currentIndex].play();
				;
			}
		});

		ImageView imageView = new ImageView(images[currentIndex]);
		ComboBox<String> cboNation = new ComboBox<String>();
		ObservableList<String> items = FXCollections.observableArrayList("Denmark", "Germany", "China", "India",
				"Norway", "UK", "US");
		cboNation.getItems().addAll(items);
		cboNation.setValue(items.get(0));
		cboNation.setOnAction(e -> {
			mp[currentIndex].stop();
			currentIndex = items.indexOf(cboNation.getValue());
			imageView.setImage(images[currentIndex]);
			mp[currentIndex].play();
		});

		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(btnPlayPause, new Label("Select a nation: ", cboNation));
		hBox.setAlignment(Pos.CENTER);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(imageView);
		borderPane.setBottom(hBox);

		Scene scene = new Scene(borderPane, 350, 270);
		primaryStage.setTitle("FlagAnthem");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
