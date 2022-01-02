package tr.edu.ku.devnull.needforspear.Viewmodel.State;

import tr.edu.ku.devnull.needforspear.NeedforSpearGame;
import tr.edu.ku.devnull.needforspear.View.PlayViews.MainMenuView;

/**
 * HelpViewState is a member of State Design Pattern.
 *
 * @author Kaan Turkmen, Can Usluel.
 */
public class HelpViewState extends ViewState {

    /**
     * Constructor of the HelpViewState.
     *
     * @param needforSpearGame The object which has states.
     */
    public HelpViewState(NeedforSpearGame needforSpearGame) {
        super(needforSpearGame);
    }

    /**
     * Event to be performed when switched to the activation view.
     */
    @Override
    public void switchToActivationView() {
        System.out.println("Invalid access from the HelpView. (ActivationView)");
    }

    /**
     * Event to be performed when switched to the login view.
     */
    @Override
    public void switchToLoginView() {
        System.out.println("Invalid access from the HelpView. (LoginView)");
    }

    /**
     * Event to be performed when switched to send verification view.
     */
    @Override
    public void switchToSendVerificationView() {
        System.out.println("Invalid access from the HelpView. (SendVerificationView)");
    }

    /**
     * Event to be performed when switched to validate and change password view.
     */
    @Override
    public void switchToValidateAndChangePasswordView() {
        System.out.println("Invalid access from the HelpView. (ValidateAndChangePasswordView)");
    }

    /**
     * Event to be performed when switched to the main menu view.
     */
    @Override
    public void switchToMainMenuView() {
        needforSpearGame.setCurrentState(new MainMenuViewState(needforSpearGame));

        MainMenuView mainMenuView = new MainMenuView();
        NeedforSpearGame.getInstance().getViewData().setMainMenuView(mainMenuView);

        mainMenuView.createView();
    }

    /**
     * Event to be performed when switched to the game view.
     */
    @Override
    public void switchToGameView() {
        System.out.println("Invalid access from the HelpView. (GameView)");
    }

    /**
     * Event to be performed when switched to the help view.
     */
    @Override
    public void switchToHelpView() {
        System.out.println("Already in HelpView.");
    }
}
