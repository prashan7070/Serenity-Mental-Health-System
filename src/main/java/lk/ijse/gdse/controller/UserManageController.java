package lk.ijse.gdse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class UserManageController implements Initializable {

    @FXML
    private Button clearBtn;

    @FXML
    private Button deleteBtn;

    @FXML
    private TableColumn<?, ?> emailColumn;

    @FXML
    private TextField emailField;

    @FXML
    private TextField fullNameField;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TableColumn<?, ?> passwordColumn;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TableColumn<?, ?> roleColumn;

    @FXML
    private ComboBox<?> roleComboBox;

    @FXML
    private Button saveBtn;

    @FXML
    private Button searchBtn;

    @FXML
    private TextField searchField;

    @FXML
    private Label totalUsersLabel;

    @FXML
    private Button updateBtn;

    @FXML
    private Label userIdLabel;

    @FXML
    private TableColumn<?, ?> usernameColumn;

    @FXML
    private TextField usernameField;

    @FXML
    private TableView<?> usersTable;

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleDelete(ActionEvent event) {

    }

    @FXML
    void handleSave(ActionEvent event) {

    }

    @FXML
    void handleSearch(ActionEvent event) {

    }

    @FXML
    void handleUpdate(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        idColumn.setCellValueFactory(new PropertyValueFactory<>(""));


    }
}
