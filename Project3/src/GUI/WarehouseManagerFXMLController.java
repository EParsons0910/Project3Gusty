import bike.BikeDB;
import bike.WarehouseManager;
import bike.WarehouseManager;
import bike.WarehousePart;
import bike.WarehouseFactory;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class WarehouseManagerFXMLController {

    @FXML
    private TabPane tabPane;

    @FXML
    private AnchorPane ExaminePartPane;

    @FXML
    private MenuButton optionbutton;

    @FXML
    private MenuItem loadPartNameItem, loadPartNumItem, loadPartQuantity;

    @FXML
    private AnchorPane updatePartPane;
    
    @FXML
    private Button enterFile;

    @FXML
    private TextField transferEnter;

    @FXML
    private ListView listView;
    
    @FXML
    private Tab logOutButton;
    
    ArrayList<Node> added = new ArrayList();
    final int minimum = 5;
    

    private void logOut() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignIn.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = (Stage) tabPane.getScene().getWindow();
        stage.setScene(new Scene(root));  
        stage.show();
    }
    
    @FXML
    void switchPartName(ActionEvent event) {
        clearAdded(ExaminePartPane);
        optionbutton.setText(loadPartNameItem.getText());
        TextField name = new TextField();
        name.setLayoutX(50);
        name.setLayoutY(100);
        Button searchBtn = new Button("Search");
        searchBtn.addEventHandler(ActionEvent.ACTION, new EventHandler() {
            @Override
            public void handle(Event event) {
                searchByName(name.getText());
            }
        });
        searchBtn.setLayoutX(50);
        searchBtn.setLayoutY(150);
        addTo(ExaminePartPane, name, searchBtn);
    }

    @FXML
    void switchPartNum(ActionEvent event) {
        clearAdded(ExaminePartPane);
        optionbutton.setText(loadPartNumItem.getText());
        TextField num = new TextField();
        num.setLayoutX(50);
        num.setLayoutY(100);
        Button searchBtn = new Button("Search");
        searchBtn.addEventHandler(ActionEvent.ACTION, new EventHandler() {
            @Override
            public void handle(Event event) {
                searchByNum(num.getText());
            }
        });
        searchBtn.setLayoutX(50);
        searchBtn.setLayoutY(150);
        addTo(ExaminePartPane, num, searchBtn);
    }

    @FXML
    void switchPartQuantity(ActionEvent event) {
        clearAdded(ExaminePartPane);
            optionbutton.setText(loadPartQuantity.getText());
            TextField num = new TextField();
            num.setLayoutX(50);
            num.setPrefColumnCount(2);
            num.setLayoutY(100);
            MenuButton compareBtn = new MenuButton("Select");
            MenuItem greaterThan = new MenuItem("Greater than");
            greaterThan.addEventHandler(EventType.ROOT, new EventHandler() {
                @Override
                public void handle(Event event) {
                    compareBtn.setText(greaterThan.getText());
                    event.consume();
                }
            });
            MenuItem lessThan = new MenuItem("Less than");
            lessThan.addEventHandler(EventType.ROOT, new EventHandler() {
                @Override
                public void handle(Event event) {
                    compareBtn.setText(lessThan.getText());
                    event.consume();
                }
            });
            MenuItem equalTo = new MenuItem("Equal to");
            equalTo.addEventHandler(EventType.ROOT, new EventHandler() {
                @Override
                public void handle(Event event) {
                    compareBtn.setText(equalTo.getText());
                    event.consume();
                }
            });
            compareBtn.getItems().addAll(greaterThan, lessThan, equalTo);
            compareBtn.setLayoutX(100);
            compareBtn.setLayoutY(100);
            Button searchBtn = new Button("Search");
            searchBtn.setLayoutX(50);
            searchBtn.setLayoutY(150);
            addTo(ExaminePartPane, num, compareBtn, searchBtn);
    }
    private void searchByName(String name) {
        BikeDB db = BikeDB.getDB();
        WarehouseManager user = (WarehouseManager)(db.getUser());
        WarehousePart[] parts = user.getPartsByName(name);
        ObservableList<WarehousePart> list = FXCollections.observableArrayList(parts);
        listView.setItems(list);
    }
    
    private void searchByNum(String num) {
        BikeDB db = BikeDB.getDB();
        WarehouseManager user = (WarehouseManager)(db.getUser());
        WarehousePart[] parts = user.getPartsByNum(num);
        ObservableList<WarehousePart> list = FXCollections.observableArrayList(parts);
        listView.setItems(list);
    }
    
    void initialize(URL url, ResourceBundle rb){
        tabPane.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<Tab>() {
                @Override
                public void changed(ObservableValue<? extends Tab> ov, Tab t, Tab t1) {
                    if (t1.equals(logOutButton)) {
                        try {
                            logOut();
                        } catch (Exception e) {e.printStackTrace();}
                    }
                    System.out.println("Tab Selection changed");
                }
            }
        );
    }
    
    private void updateInventory(String fileName) throws FileNotFoundException{
        BikeDB db = BikeDB.getDB();
        WarehouseManager user = (WarehouseManager)(db.getUser());
        Scanner scnr = new Scanner(System.in);
        fileName = scnr.nextLine();
        user.updateInventory(fileName);
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
