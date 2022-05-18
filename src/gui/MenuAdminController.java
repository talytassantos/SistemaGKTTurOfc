package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

public class MenuAdminController implements Initializable {

	@FXML
	private MenuItem menuItemCadastrarClientes;

	@FXML
	private MenuItem menuItemCadastrarHoteis;

	@FXML
	private MenuItem menuItemCadastrarReservas;

	@FXML
	private MenuItem menuItemCadastrarQuartos;

	@FXML
	private MenuItem menuItemCadastrarServicos;
	
	@FXML
	private MenuItem menuItemListarClientes;

	@FXML
	private MenuItem menuItemListarHoteis;

	@FXML
	private MenuItem menuItemListarReservas;

	@FXML
	private MenuItem menuItemListarQuartos;

	@FXML
	private MenuItem menuItemListarServicos;
	
	@FXML
	private MenuItem menuItemAbout;

	@FXML
	public void onMenuItemCadastrarClientesAction() {
	}
	
	@FXML
	public void onMenuItemCadastrarHoteisAction() {
	}
	
	@FXML
	public void onMenuItemCadastrarReservasAction() {
	}
	
	@FXML
	public void onMenuItemCadastrarQuartosAction() {
	}
	
	@FXML
	public void onMenuItemCadastrarServicosAction() {
	}
	
	@FXML
	public void onMenuItemListarClientesAction() {
		loadView("/gui/ListaClientes.fxml");
	}
	
	@FXML
	public void onMenuItemListarHoteisAction() {
	}
	
	@FXML
	public void onMenuItemListarReservasAction() {
	}
	
	@FXML
	public void onMenuItemListarQuartosAction() {
	}
	
	@FXML
	public void onMenuItemListarServicosAction() {
	}

	@FXML
	public void onMenuItemAboutAction() {
		loadView("/gui/About.fxml");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
		}
		catch (IOException e) {
			Alerts.showAlert("IO Exception", "Erro ao carregar a página", e.getMessage(), AlertType.ERROR);
		}
	}

}
