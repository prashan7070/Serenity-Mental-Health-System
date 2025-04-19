package lk.ijse.gdse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PatientManageController {

    @FXML
    private TableColumn<?, ?> actionsColumn;

    @FXML
    private Button addRecordBtn;

    @FXML
    private TextArea addressField;

    @FXML
    private TableColumn<?, ?> ageColumn;

    @FXML
    private TextField ageField;

    @FXML
    private Button clearBtn;

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private Button deleteBtn;

    @FXML
    private TableColumn<?, ?> diagnosisColumn;

    @FXML
    private TableColumn<?, ?> emailColumn;

    @FXML
    private TextField emailField;

    @FXML
    private Button exportBtn;

    @FXML
    private TextField fullNameField;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private Label lastUpdatedLabel;

    @FXML
    private TextArea medicalHistoryField;

    @FXML
    private TableView<?> medicalRecordsTable;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TableColumn<?, ?> notesColumn;

    @FXML
    private Label patientIdLabel;

    @FXML
    private ComboBox<?> patientSelector;

    @FXML
    private TableView<?> patientsTable;

    @FXML
    private TableColumn<?, ?> phoneColumn;

    @FXML
    private TextField phoneField;

    @FXML
    private TableColumn<?, ?> prescriptionColumn;

    @FXML
    private TableColumn<?, ?> recordActionsColumn;

    @FXML
    private Button refreshBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Button searchBtn;

    @FXML
    private TextField searchField;

    @FXML
    private ComboBox<?> searchFilterCombo;

    @FXML
    private Label statusLabel;

    @FXML
    private Label totalPatientsLabel;

    @FXML
    private TableColumn<?, ?> treatmentColumn;

    @FXML
    private Button updateBtn;

    @FXML
    void handleAddRecord(ActionEvent event) {

    }

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleDelete(ActionEvent event) {

    }

    @FXML
    void handleExport(ActionEvent event) {

    }

    @FXML
    void handleRefresh(ActionEvent event) {

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

}
