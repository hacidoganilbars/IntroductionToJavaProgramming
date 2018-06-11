package com.doganilbars.myfx010;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {
	public final double radius = 20;
	private double x = radius;
	private double y = radius;
	private double dx = 1;
	private double dy = 1;
	private Circle circle = new Circle(x, y, radius);
	private Timeline annimation;

	public BallPane() {
		circle.setFill(Color.GREEN);
		getChildren().add(circle);
		annimation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
		annimation.setCycleCount(Timeline.INDEFINITE);
		annimation.play();
	}

	public void play() {
		annimation.play();
	}

	public void pause() {
		annimation.pause();
	}

	public void increaseSpeed() {
		annimation.setRate(annimation.getRate() + 0.1);
	}

	public void decreaseSpeed() {
		annimation.setRate(annimation.getRate() > 0 ? annimation.getRate() - 0.1 : 0);
	}

	public DoubleProperty rateProperty() {
		return annimation.rateProperty();
	}

	protected void moveBall() {
		if (x < radius || x > getWidth() - radius) {
			dx *= -1;
		}
		if (y < radius || y > getHeight() - radius) {
			dy *= -1;
		}

		x += dx;
		y += dy;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}

}
