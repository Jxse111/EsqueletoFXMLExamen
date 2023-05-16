package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			HBox raiz = new HBox();
			raiz.setPadding(new Insets(50, 50, 50, 50));
			raiz.setAlignment(Pos.CENTER);
			
			Label lbRotada = new Label();
			lbRotada.setText("Hola mundo desde JavaFX!!!!");
			lbRotada.setFont(Font.font("Arial", 40));
			lbRotada.setMinWidth(150);
			
			raiz.getChildren().add(lbRotada);
			Scene escena = new Scene(raiz, 650, 150);
			escenarioPrincipal.setTitle("Hola mundo desde JavaFX");
			escenarioPrincipal.setScene(escena);
			escenarioPrincipal.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
