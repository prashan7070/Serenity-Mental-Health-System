package lk.ijse.gdse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.gdse.bo.custom.BOFactory;
import lk.ijse.gdse.bo.custom.BOTypes;
import lk.ijse.gdse.bo.custom.LoginBO;
import lk.ijse.gdse.dto.UserDTO;

import java.io.IOException;
import java.util.Optional;

public class LoginViewController {

    @FXML
    private RadioButton adminRadioButton;

    @FXML
    private Hyperlink forgotPasswordLink;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private RadioButton receptionistRadioButton;

    @FXML
    private ToggleGroup roleToggleGroup;

    @FXML
    private CheckBox showPasswordCheckBox;

    @FXML
    private TextField usernameField;

    @FXML
    private AnchorPane loginAnchor;

    LoginBO loginBO = BOFactory.getInstance().getBO(BOTypes.LOGIN);


    @FXML
    void handleForgotPassword(ActionEvent event) {

    }

    @FXML
    void handleLogin(ActionEvent event) {

        String username = usernameField.getText();
        String password = passwordField.getText();

        try {

            Optional<UserDTO> userDTO = loginBO.validateLogin(username,password);

            boolean isTrue = true;

           if (isTrue){
                Stage stage = (Stage) loginAnchor.getScene().getWindow();
                stage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/AdminDashboard.fxml"));
                Parent dashboardRoot = fxmlLoader.load();
                AdminDashBoardController adminDashBoardController = fxmlLoader.getController();

                Stage dashboardStage = new Stage();
                Image image = new Image(getClass().getResourceAsStream("/images/favican.png"));
                dashboardStage.getIcons().add(image);
                dashboardStage.setScene(new Scene(dashboardRoot));
                dashboardStage.show();
            }else {

//                new Alert(Alert.AlertType.ERROR,"Wrong Credentials").show();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void togglePasswordVisibility(ActionEvent event) {

    }

}
