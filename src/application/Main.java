package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {

	//Esse é o código correto, porém é necessário realizar ajustes
	/*
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Login.fxml"));
			Parent parent = loader.load();
			
			Scene mainScene = new Scene(parent);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sistema GKT Tur");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	*/

	
	//usar esse trecho para testar menuAdmin, menuCliente, MainView
	
private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
//			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); //Apenas mudar endereço da tela para verificar
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MenuAdmin.fxml")); //Apenas mudar endereço da tela para verificar
			ScrollPane scrollPane = loader.load();
			
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			mainScene = new Scene(scrollPane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Scene getMainScene() {
		return mainScene;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}