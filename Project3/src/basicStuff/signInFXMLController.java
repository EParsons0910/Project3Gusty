package basicStuff;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Jackson Trahan
 */
public class SignInFXMLController implements Initializable {
    
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    
    @FXML
    private void signIn(ActionEvent event) throws Exception {
        Scanner in = new Scanner(new File("users.txt"));
        while (in.hasNextLine()) {
            String[] signIn = in.nextLine().split(", ");
            if (signIn[1].equals(username.getText())) {
                if (signIn[2].equals(password.getText())) {
                    Parent root = null;
                    switch (signIn[0].toLowerCase()) {
                        case "office manager":
                            root = FXMLLoader.load(getClass().getResource("OfficeManager.fxml"));
                            break;
                        case "warehouse manager":
                            root = FXMLLoader.load(getClass().getResource("WarehouseManager.fxml"));
                            break;
                        case "sales associate":
                            root = FXMLLoader.load(getClass().getResource("SalesAssociate.fxml"));
                            break;
                        case "system admin":
                            root = FXMLLoader.load(getClass().getResource("SystemAdmin.fxml"));
                            break;
                    }
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.show();
                } else {
                    System.out.println("Error: Sign in invalid");
                }
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
