package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField userName;
    static String User_name;

    @FXML
    void NameOnAction(ActionEvent event) throws IOException {

            User_name=userName.getText();
            userName.clear();
            Stage stage = new Stage();
            stage.setScene(new Scene(FXMLLoader.load(LoginController.class.getResource("/view/client.fxml"))));
            stage.close();
            stage.centerOnScreen();
            stage.show();

    }

}
