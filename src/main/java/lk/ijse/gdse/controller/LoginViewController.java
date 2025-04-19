package lk.ijse.gdse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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
    void handleForgotPassword(ActionEvent event) {

    }

    @FXML
    void handleLogin(ActionEvent event) {

    }

    @FXML
    void togglePasswordVisibility(ActionEvent event) {

    }

}
