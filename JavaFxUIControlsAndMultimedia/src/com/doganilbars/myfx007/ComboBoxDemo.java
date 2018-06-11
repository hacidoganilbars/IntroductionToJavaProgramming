package com.doganilbars.myfx007;

import com.doganilbars.myfx006.pane.DescriptionPane;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {

	private String[] flagTitles = { "Turkey", "Canada", "China", "Denmark", "France", "Germany", "India", "Norway",
			"England", "America" };

	private ImageView[] flagImage = { new ImageView("image/turkey.jpg"), new ImageView("image/canada.jpg"),
			new ImageView("image/china.jpg"), new ImageView("image/denmark.jpg"), new ImageView("image/france.jpg"),
			new ImageView("image/germany.jpg"), new ImageView("image/india.jpg"), new ImageView("image/norway.jpg"),
			new ImageView("image/england.jpg"), new ImageView("image/america.jpg") };

	private String[] flagDescription = new String[11];

	private DescriptionPane descriptionPane = new DescriptionPane();

	private ComboBox<String> cbo = new ComboBox<String>();

	@Override
	public void start(Stage primaryStage) throws Exception {
		flagDescription[0] = "Description for Turkey ...";
		flagDescription[1] = "Description for Canada ... ";
		flagDescription[2] = "Description for China ... ";
		flagDescription[3] = "Description for Denmark ... ";
		flagDescription[4] = "Description for France ... ";
		flagDescription[5] = "Description for Germany ... ";
		flagDescription[6] = "Description for India ... ";
		flagDescription[7] = "Description for Norway ... ";
		flagDescription[8] = "Description for England ... ";
		flagDescription[9] = "Description for America ...";

		setDisplay(0);

		BorderPane borderPane = new BorderPane();
		BorderPane paneForComboBox = new BorderPane();
		paneForComboBox.setLeft(new Label("Select a country: "));
		paneForComboBox.setCenter(cbo);
		borderPane.setTop(paneForComboBox);

		cbo.setPrefWidth(400);
		cbo.setValue("Turkey");

		ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
		cbo.getItems().addAll(items);
		borderPane.setCenter(descriptionPane);

		cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));

		Scene scene = new Scene(borderPane, 450, 170);
		primaryStage.setTitle("ComboBoxDemo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void setDisplay(int index) {
		descriptionPane.setTitle(flagTitles[index]);
		descriptionPane.setImageView(flagImage[index]);
		descriptionPane.setDescription(flagDescription[index]);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
