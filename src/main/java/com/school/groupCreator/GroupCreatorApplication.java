package com.school.groupCreator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroupCreatorApplication  {
	public static void main(String[] args) {
		Application.launch(GroupCreatorMain.class, args);
	}
}
