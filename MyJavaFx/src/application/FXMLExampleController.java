package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLExampleController {

	
	
	@FXML protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
		Parent root=FXMLLoader.load(getClass().getResource("fxml_welcome.fxml"));
		Scene newScene= new Scene(root,300,250);
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setTitle("New Welcome");
		stage.setScene(newScene);
		stage.show();
	}
}
