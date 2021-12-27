package tr.edu.ku.devnull.needforspear.View.AuthViews;

import tr.edu.ku.devnull.needforspear.Model.GameData.Constants;
import tr.edu.ku.devnull.needforspear.Model.UIModels.FocusableJTextField;
import tr.edu.ku.devnull.needforspear.Viewmodel.AuthHandler.LoginHandler;
import tr.edu.ku.devnull.needforspear.NeedforSpearGame;
import tr.edu.ku.devnull.needforspear.Viewmodel.GameLogicHandlers.BackgroundHandler;

import javax.swing.*;

/**
 * LoginView lets user to authenticate themselves
 * to play the game.
 *
 * @author Kaan Turkmen
 */
public class LoginView {
    private static FocusableJTextField dummyField, usernameField, emailField;
    private static JPasswordField passwordField;
    private static JButton loginButton, registerButton, forgotScreenButton, activationButton;

    /**
     * A method for starting creation of the LoginView.java
     */
    public static void createView() {
        createUIElements();
        determineUIElementsSizes();
        createActionListenersForLoginView();
        obtainVisibility();
    }

    /**
     * A method for assigning components to the class variables.
     */
    private static void createUIElements() {
        NeedforSpearGame.getMainFrame().setTitle(Constants.UIConstants.GAME_NAME);
        dummyField = new FocusableJTextField(Constants.UIConstants.USERNAME_TEXT_FIELD_PLACEHOLDER);
        usernameField = new FocusableJTextField(Constants.UIConstants.USERNAME_TEXT_FIELD_PLACEHOLDER);
        emailField = new FocusableJTextField(Constants.UIConstants.EMAIL_TEXT_FIELD_PLACEHOLDER);
        passwordField = new JPasswordField(Constants.UIConstants.PASSWORD_PASSWORD_FIELD_PLACEHOLDER);
        loginButton = new JButton(Constants.UIConstants.LOGIN_BUTTON_TEXT);
        registerButton = new JButton(Constants.UIConstants.REGISTER_BUTTON_PLACEHOLDER);
        forgotScreenButton = new JButton(Constants.UIConstants.FORGOT_MY_PASSWORD_BUTTON_PLACEHOLDER);
        activationButton = new JButton(Constants.UIConstants.ACTIVATE_MY_ACCOUNT_BUTTON_PLACEHOLDER);
    }

    /**
     * A method for determining the sizes of the elements.
     */
    private static void determineUIElementsSizes() {
        int x_coordinates_loc = (int) Constants.UIConstants.LOGIN_VIEW_COMPONENT_LOCATION.getXCoordinates().doubleValue();
        int y_coordinates_loc = (int) Constants.UIConstants.LOGIN_VIEW_COMPONENT_LOCATION.getYCoordinates().doubleValue();
        usernameField.setBounds(x_coordinates_loc, y_coordinates_loc, Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getWidth(), Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getLength());
        emailField.setBounds(x_coordinates_loc, y_coordinates_loc + Constants.UIConstants.PADDING_BETWEEN_TEXT_FIELDS, Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getWidth(), Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getLength());
        passwordField.setBounds(x_coordinates_loc, y_coordinates_loc + 2 * Constants.UIConstants.PADDING_BETWEEN_TEXT_FIELDS, Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getWidth(), Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getLength());
        loginButton.setBounds(x_coordinates_loc, y_coordinates_loc + 3 * Constants.UIConstants.PADDING_BETWEEN_TEXT_FIELDS, Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getWidth(), Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getLength());
        registerButton.setBounds(x_coordinates_loc, y_coordinates_loc + 4 * Constants.UIConstants.PADDING_BETWEEN_TEXT_FIELDS, Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getWidth(), Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getLength());
        forgotScreenButton.setBounds(x_coordinates_loc, y_coordinates_loc + 5 * Constants.UIConstants.PADDING_BETWEEN_TEXT_FIELDS, Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getWidth(), Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getLength());
        activationButton.setBounds(x_coordinates_loc, y_coordinates_loc + 6 * Constants.UIConstants.PADDING_BETWEEN_TEXT_FIELDS, Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getWidth(), Constants.UIConstants.MENU_AND_AUTH_VIEW_COMPONENT_SIZE.getLength());
    }

    /**
     * A method for creating listeners for the buttons.
     */
    private static void createActionListenersForLoginView() {
        loginButton.addActionListener(e -> {
            char[] encryptedPassword = passwordField.getPassword();

            if (LoginHandler.getInstance().isMail(emailField.getText())) {
                LoginHandler.getInstance().login(usernameField.getText(), emailField.getText(), String.valueOf(encryptedPassword));
            } else {
                System.out.println("Not a valid mail.");
            }

        });

        registerButton.addActionListener(e -> {
            char[] encryptedPassword = passwordField.getPassword();

            if (LoginHandler.getInstance().isMail(emailField.getText())) {
                LoginHandler.getInstance().register(usernameField.getText(), emailField.getText(), String.valueOf(encryptedPassword));
            } else {
                System.out.println("Not a valid mail.");
            }

        });

        activationButton.addActionListener(e -> {
            NeedforSpearGame.getMainFrame().getContentPane().removeAll();
            NeedforSpearGame.getMainFrame().repaint();
            NeedforSpearGame.startActivationView();
        });

        forgotScreenButton.addActionListener(e -> {
            NeedforSpearGame.getMainFrame().getContentPane().removeAll();
            NeedforSpearGame.getMainFrame().repaint();
            NeedforSpearGame.startVerificationView();
        });
    }

    /**
     * A method for creating visibility to the components.
     */
    private static void obtainVisibility() {
        NeedforSpearGame.getMainFrame().setContentPane(new BackgroundHandler().getBackgroundedJPanel(Constants.UIConstants.TITLE_SCREEN_BACKGROUND_IMAGE));
        NeedforSpearGame.getMainFrame().getContentPane().add(dummyField);
        NeedforSpearGame.getMainFrame().getContentPane().add(usernameField);
        NeedforSpearGame.getMainFrame().getContentPane().add(emailField);
        NeedforSpearGame.getMainFrame().getContentPane().add(passwordField);
        NeedforSpearGame.getMainFrame().getContentPane().add(loginButton);
        NeedforSpearGame.getMainFrame().getContentPane().add(registerButton);
        NeedforSpearGame.getMainFrame().getContentPane().add(forgotScreenButton);
        NeedforSpearGame.getMainFrame().getContentPane().add(activationButton);
        NeedforSpearGame.getMainFrame().setLayout(null);
        NeedforSpearGame.getMainFrame().setVisible(true);
    }
}
