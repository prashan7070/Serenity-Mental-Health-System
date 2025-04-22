package lk.ijse.gdse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminDashBoardController implements Initializable {

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
    private AnchorPane contentPanelAnchor;

    @FXML
    private Button dashboardBtn;

    @FXML
    void handleHome(ActionEvent event) {

    }

    @FXML
    void handlePatientManage(ActionEvent event) {

        navigateTo("/view/PatientManage.fxml");

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

        navigateTo("/view/UserManage.fxml");


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

    public void navigateTo(String fxmlPath){

        try {
            contentPanelAnchor.getChildren().clear();
            AnchorPane contentPanel = FXMLLoader.load(getClass().getResource(fxmlPath));
            contentPanel.prefWidthProperty().bind(contentPanelAnchor.widthProperty());
            contentPanel.prefHeightProperty().bind(contentPanelAnchor.heightProperty());
            contentPanelAnchor.getChildren().add(contentPanel);


        } catch (IOException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Fail to load page!").show();

        }

    }


}
