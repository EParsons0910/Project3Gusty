import bike.BikeDB;
import bike.SalesAssociate;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SalesAssociateFXMLController {

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

    private void loadSalesVan(String fileName) throws FileNotFoundException{
        BikeDB bike = BikeDB.getDB();
        SalesAssociate user = (SalesAssociate)(bike.getUser());
        Scanner scnr = new Scanner(System.in);
        fileName = scnr.nextLine();
        
    }
}