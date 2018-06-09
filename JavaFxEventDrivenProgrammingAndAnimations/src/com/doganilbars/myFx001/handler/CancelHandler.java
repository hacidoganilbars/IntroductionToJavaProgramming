package com.doganilbars.myFx001.handler;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CancelHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent actionEvent) {
		System.out.println("Cancel button clicked");

	}

}
