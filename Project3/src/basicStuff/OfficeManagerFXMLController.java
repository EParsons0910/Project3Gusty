package basicStuff;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Jackson Trahan, Elizabeth Parsons
 */
public class OfficeManagerFXMLController implements Initializable {
    @FXML
    private TextField input;

    @FXML
    private Button nameSearchButton;

    @FXML
    private Button numSearchButton;

    @FXML
    private TextArea output;
    
    @FXML
    private void nameSearch(ActionEvent event) {
        
    }
    
    @FXML
    private void numSearch(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}