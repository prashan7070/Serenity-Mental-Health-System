package lk.ijse.gdse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AdminDashBoardController {

    @FXML
    private TableColumn<?, ?> actionColumn;

    @FXML
    private ListView<?> alertsListView;

    @FXML
    private TabPane contentTabPane;

    @FXML
    private TableColumn<?, ?> dateTimeColumn;

    @FXML
    private TableColumn<?, ?> detailsColumn;

    @FXML
    private TableColumn<?, ?> patientColumn;

    @FXML
    private Label patientCountLabel;

    @FXML
    private Button patientManageBtn;

    @FXML
    private Label patientTrendLabel;

    @FXML
    private TableColumn<?, ?> programColumn;

    @FXML
    private Button programManageBtn;

    @FXML
    private TableView<?> recentActivityTable;

    @FXML
    private Button refreshBtn;

    @FXML
    private Button reportsBtn;

    @FXML
    private Label sessionCountLabel;

    @FXML
    private Button sessionManageBtn;

    @FXML
    private Label sessionTrendLabel;

    @FXML
    private Button settingsBtn;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private TableColumn<?, ?> therapistColumn;

    @FXML
    private Label therapistCountLabel;

    @FXML
    private Button therapistManageBtn;

    @FXML
    private Label therapistTrendLabel;

    @FXML
    private TableColumn<?, ?> timeColumn;

    @FXML
    private ComboBox<?> timeRangeCombo;

    @FXML
    private TableView<?> upcomingSessionsTable;

    @FXML
    private TableColumn<?, ?> userColumn;

    @FXML
    private Label userCountLabel;

    @FXML
    private Button userManageBtn;

    @FXML
    private Label userTrendLabel;

    @FXML
    void handlePatientManage(ActionEvent event) {

    }

    @FXML
    void handleProgramManage(ActionEvent event) {

    }

    @FXML
    void handleRefresh(ActionEvent event) {

    }

    @FXML
    void handleReports(ActionEvent event) {

    }

    @FXML
    void handleSessionManage(ActionEvent event) {

    }

    @FXML
    void handleSettings(ActionEvent event) {

    }

    @FXML
    void handleTherapistManage(ActionEvent event) {

    }

    @FXML
    void handleUserManage(ActionEvent event) {

    }

}
