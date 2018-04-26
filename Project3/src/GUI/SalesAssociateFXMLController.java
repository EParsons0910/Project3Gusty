import bike.BikeDB;
import bike.SalesAssociate;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SalesAssociateFXMLController {
    
    @FXML
    private TabPane tabPane;

    @FXML
    private AnchorPane LoadSalesVanPane;

    @FXML
    private TextField transferFile;

    @FXML
    private Button okTransfer;

    @FXML
    private AnchorPane CreateSalesInvoicePane;

    @FXML
    private DatePicker pickADate;

    @FXML
    private Tab logOutTab;
    
    ArrayList<Node> added = new ArrayList();
    final int minimum = 5;
    
     @FXML
    void checkFile(ActionEvent event) {
        clearAdded(LoadSalesVanPane);
        transferFile = new TextField();
        okTransfer = new Button("Enter");
        okTransfer.addEventHandler(ActionEvent.ACTION, new EventHandler(){
            @Override
            public void handle(Event event){
                try {
                    loadSalesVan(transferFile.getText());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SalesAssociateFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }    

    private void loadSalesVan(String fileName) throws FileNotFoundException{
        BikeDB bike = BikeDB.getDB();
        SalesAssociate user = (SalesAssociate)(bike.getUser());
        Scanner scnr = new Scanner(System.in);
        fileName = scnr.nextLine();
        
    }
    private void logOut() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignIn.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = (Stage) tabPane.getScene().getWindow();
        stage.setScene(new Scene(root));  
        stage.show();
    }
    void initialize(URL url, ResourceBundle rb){
        tabPane.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<Tab>() {
                @Override
                public void changed(ObservableValue<? extends Tab> ov, Tab t, Tab t1) {
                    if (t1.equals(logOutTab)) {
                        try {
                            logOut();
                        } catch (Exception e) {e.printStackTrace();}
                    }
                    System.out.println("Tab Selection changed");
                }
            }
        );
    }

    private void addTo(AnchorPane ap, Node... args) {
        for (Node n : args) {
            added.add(n);
            ap.getChildren().add(n);
        }
    }

    private void clearAdded(AnchorPane ap) {
        for (Node n : added) {
            ap.getChildren().remove(n);
        }
        added.clear();
    }
    
    
}