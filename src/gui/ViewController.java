//Não faz parte do projeto

package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Sexo;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Sexo> comboBoxSexo;

	private ObservableList<Sexo> obsList;
	
	@FXML
	public void onComboBoxSexoAction() {
		Sexo sexo = comboBoxSexo.getSelectionModel().getSelectedItem();
		System.out.println(sexo);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Sexo> list = new ArrayList<>();
		list.add(new Sexo(1, "M", "Masculino"));
		list.add(new Sexo(1, "F", "Feminino"));
		list.add(new Sexo(1, "O", "Outros"));

		obsList = FXCollections.observableArrayList(list);
		comboBoxSexo.setItems(obsList);

		Callback<ListView<Sexo>, ListCell<Sexo>> factory = lv -> new ListCell<Sexo>() {
			@Override
			protected void updateItem(Sexo item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getAbrevSexo());
			}
		};
		
		comboBoxSexo.setCellFactory(factory);
		comboBoxSexo.setButtonCell(factory.call(null));
		

	}

}
