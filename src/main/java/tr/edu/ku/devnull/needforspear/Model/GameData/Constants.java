package tr.edu.ku.devnull.needforspear.Model.GameData;

import java.awt.*;

/**
 * Constants interface is used to store all the necessary constants for the game.
 *
 * @author Kaan Turkmen, Gökçe Sevimli
 */
public interface Constants {

    /**
     * Constants which are mainly used for the proportion purposes.
     */
    interface ProportionConstants {
        int HEIGHT_OF_NOBLE_PHANTASM = 20;
        int WIDTH_OF_NOBLE_PHANTASM = Constants.UIConstants.INITIAL_SCREEN_WIDTH / 10;
        int Y_CENTER_OF_NOBLE_PHANTASM = Constants.ProportionConstants.HEIGHT_OF_NOBLE_PHANTASM / 2;
        double REGULAR_SPEED_OF_NOBLE_PHANTASM = (1.0 * Constants.UIConstants.INITIAL_SCREEN_WIDTH / 10.0 / 1000.0);
        double DOUBLE_SPEED_OF_NOBLE_PHANTASM = (1.0 * Constants.UIConstants.INITIAL_SCREEN_WIDTH / 5.0 / 1000.0);
        double RATE_OF_TWENTY_DEGREES_PER_SECOND = (0.35 / 1000.0);
        double RATE_OF_FORTY_FIVE_DEGREES_PER_SECOND = (0.78 / 1000);
        double RADIAN_EQUIVALENCE_OF_FORTY_FIVE_DEGREES = 0.78;
        int HEIGHT_OF_THE_OBSTACLE = 20;
        int RADIUS_OF_THE_SPHERE = 16;
        double RATIO_OF_NOBLE_PHANTASM = 0.1;
        double EXPLOSIVE_ORBIT_RADIUS = 1.5 * WIDTH_OF_NOBLE_PHANTASM;
        int RADIUS_OF_THE_BULLET = 9;
        int SPEED_OF_THE_BULLET = 2;
        int RADIUS_OF_EXPLOSIVE_OBSTACLE = 15;
        int SPELL_SIZE = 15;
        int WIDTH_OF_EXPLOSIVE_OBSTACLE = 30;
        int HEIGHT_OF_EXPLOSIVE_OBSTACLE = 30;
        int CHANGE_IN_X_LOCATION_USING_WIDTH_OF_EXPLOSIVE_OBSTACLE = WIDTH_OF_EXPLOSIVE_OBSTACLE / 3;
        int CHANGE_IN_Y_LOCATION_USING_HEIGHT_OF_EXPLOSIVE_OBSTACLE = HEIGHT_OF_EXPLOSIVE_OBSTACLE / 3;
    }

    interface SphereConstantSpeeds {
        int NORMAL_SPEED = 2;
        int HARD_SPEED = 4;
    }

    /**
     * Constants which are mainly used for the UI purposes.
     */
    interface UIConstants {
        String TITLE_SCREEN_BACKGROUND_IMAGE = "TitleScreen.png";
        String ACTIVATION_VIEW_BACKGROUND_IMAGE = "ActivateAccountBackground.png";
        String SEND_VERIFICATION_VIEW_BACKGROUND_IMAGE = "ForgotPasswordBackground.png";
        String VALIDATE_AND_CHANGE_PASSWORD_VIEW_BACKGROUND_IMAGE = "ValidateAndResetBackground.png";
        String MAIN_MENU_BACKGROUND_IMAGE = "MainMenuBackground.png";
        String GAME_BACKGROUND_IMAGE = "GameBackground.png";
        String PHANTASM_IMAGE = "Phantasm3.png";
        String PHANTASM_IMAGE_EXPANSION = "Phantasm4.png";
        String SPHERE_IMAGE = "Sphere.png";
        String BULLET_IMAGE = "Bullet.png";
        String EXPLOSIVE_OBSTACLE = "ExplosiveObstacle.png";
        String FIRM_OBSTACLE = "FirmObstacle.png";
        String SIMPLE_OBSTACLE = "SimpleObstacle.png";
        String GIFT_OBSTACLE = "GiftObstacle.png";
        String HOLLOW_OBSTACLE = "HollowObstacle.png";
        String HELP_VIEW_BACKGROUND_IMAGE = "HelpScreen.png";
        String GAME_ICON = "GameIcon.png";
        String CHANCE_GIVING_ABILITY = "ChanceSpell.png";
        String EXPANSION_SPELL = "ExpansionSpell.png";
        String HEX_SPELL = "HexSpell.png";
        String UNSTOPPABLE_SPELL = "UnstoppableSpell.png";

        String USER_DIRECTORY_KEYWORD = "user.dir";
        String USER_DIRECTORY_TO_RESOURCE_FOLDER = "src/main/java/tr/edu/ku/devnull/needforspear/Resources/Images/";

        String BACKGROUND_MUSIC = "backgroundMusic.wav";
        String SOUNDS_FOLDER_PATH = "src/main/java/tr/edu/ku/devnull/needforspear/Resources/Sounds/";

        String GAME_NAME = "Need for Spear!";
        String USERNAME_TEXT_FIELD_PLACEHOLDER = "Username";
        String EMAIL_TEXT_FIELD_PLACEHOLDER = "Email address";
        String PASSWORD_PASSWORD_FIELD_PLACEHOLDER = "Password";
        String LOGIN_BUTTON_TEXT = "Login";

        String REGISTER_BUTTON_PLACEHOLDER = "Register";
        String FORGOT_MY_PASSWORD_BUTTON_PLACEHOLDER = "Forgot My Password";
        String ACTIVATE_MY_ACCOUNT_BUTTON_PLACEHOLDER = "Activate My Account";
        String VERIFICATION_CODE_PLACEHOLDER = "Verification Code";
        String BACK_BUTTON_PLACEHOLDER = "Back";

        String NEW_GAME_TEXT = "New Game";
        String LOAD_GAME_TEXT = "Load Game";
        String HELP_SCREEN_TEXT = "Help!";
        String CHANGE_DIFFICULTY_TEXT = "Change Difficulty";
        String EXIT_GAME_TEXT = "Quit";
        String BACK_TO_MENU_TEXT = "Back to Menu";

        String RESET_PASSWORD_PLACEHOLDER = "Reset Password";

        String NEW_PASSWORD_PLACEHOLDER = "New Password";

        String SWITCH_TO_RUNNING_MODE_TEXT = "Switch to running mode";
        String CREATE_A_NEW_MAP_TEXT = "Create a new map";
        String SAVE_A_MAP_TEXT = "Save game";
        String PAUSE_GAME_TEXT = "Pause game";
        String RESUME_GAME_TEXT = "Resume game";
        String SCORE_TEXT = "Score: ";
        String LIVES_TEXT = "Remaining lives: ";
        String NON_EXISTING_MAP_ERROR_TEXT = "There isn't a previously saved map";
        String ALERT_TEXT = "Alert";
        String MUTE_TEXT = "Mute";
        String UNMUTE_TEXT = "Unmute";
        String SIMPLE_OBSTACLE_NUM_TEXT = "Enter the number of simple obstacles (min 75, max 120):";
        String FIRM_OBSTACLE_NUM_TEXT = "Enter the number of firm obstacles (min 10, max 20): ";
        String EXPLOSIVE_OBSTACLE_NUM_TEXT = "Enter the number of explosive obstacles (min 5, max 10): ";
        String GIFT_OBSTACLE_NUM_TEXT = "Enter the number of gift obstacles (min 10, max 20): ";
        String OK_TEXT = "OK";
        String ENTER_VALID_NUMBER_TEXT = "Please enter a valid number";
        String ENTER_BETWEEN_GIVEN_VALUES_TEXT = "Please enter number between given values";
        String LOSE_GAME_TXT = "You have lost";
        String WIN_GAME_TXT = "You have won!\n Score: ";
        String PREVIOUS_GAME_LOST_TEXT = "You have lost in a previous game.";

        String USER_EXISTS_TEXT = "This user already exists on the game, please try another credentials!";
        String INCORRECT_PASSWORD_TEXT = "Incorrect password.";
        String VERIFICATION_TEXT = "Verification code is sent to your email!";
        String NEW_VERIFICATION_TEXT = "New verification code is sent to your email!";
        String VERIFY_BEFORE_LOGIN_TEXT = "Please verify your account before logging into your account!";
        String INTERNET_CONNECTION_ERROR_MESSAGE = "You do not have an internet connection! This game requires an internet connection to play!";
        String OBSTACLE_CLOSE_PHANTASM_TEXT = "Obstacle is too close to the phantasm!";
        String MAXIMUM_OBSTACLE_NUMBER_TEXT = "Maximum number for that obstacle type is reached";
        String MINIMUM_OBSTACLE_NUMBER_TEXT = "Minimum number for that obstacle type is reached";

        String RED_COLOR_STRING = "RED";
        String BLUE_COLOR_STRING = "BLUE";
        String ORANGE_COLOR_STRING = "ORANGE";
        String GREEN_COLOR_STRING = "GREEN";
        String PURPLE_COLOR_STRING = "PURPLE";

        String DARK_CYAN_COLOR_STRING = "DARKRED";
        String DARK_YELLOW_COLOR_STRING = "DARKBLUE";
        String PINK_COLOR_STRING = "DARKMAGENTA";
        String DARK_GREEN_COLOR_STRING = "DARKGREEN";

        String WEBSITE_TO_BE_PINGED = "https://www.google.com";

        int PADDING_BETWEEN_TEXT_FIELDS = 50;
        int PADDING_MAIN_MENU = 50;

        int INITIAL_SCREEN_WIDTH = 1280;
        int INITIAL_SCREEN_HEIGHT = 720;

        int BACK_BUTTON_X_COORDINATE = 70;
        int BACK_BUTTON_Y_COORDINATE = 600;

        int HELP_SCREEN_BACK_BUTTON_X_COORDINATE = 70;
        int HELP_SCREEN_BACK_BUTTON_Y_COORDINATE = 90;

        int OBSTACLE_TXT_X = 50;
        int OBSTACLE_TXT_Y = 50;
        int OBSTACLE_TXT_X_PADDING = 50;
        int OBSTACLE_TXT_Y_PADDING = 30;
        int OBSTACLE_TXT_WIDTH = 400;
        int OBSTACLE_TXT_HEIGHT = 20;
        int OBSTACLE_NUM_CHECK_FRAME_SIZE = 500;
        int FLOWLAYOUT_HGAP = 30;
        int FLOWLAYOUT_VGAP = 10;
        int OBSTACLE_VGAP = 20;
        int OBSTACLE_HGAP = 30;
        int INIT_LIVES = 3;
        int OVERLAY_PANEL_HEIGHT = 100;
        int OBSTACLE_DISTANCE_FROM_PHANTASM = 150;
        int INIT_SCORE = 0;
        int OBSTACLE_SIMPLE_HIT_HEALTH = 1;
        int OBSTACLE_MULTIPLE_HIT_MIN_HEALTH = 3;
        int OBSTACLE_MULTIPLE_HIT_MAX_HEALTH = 10;
        int OBSTACLE_SIZE_DIVISION_CONSTANT = 5;
        int ONE_HIT_DAMAGE = 1;
        int ONE_LIVES_GAIN_LOSE = 1;
        int SPELL_DURATION_SECONDS = 15;
        int TWICE_SPELL_DURATION_SECONDS = 30;
        int MILLISECONDS_TO_SECONDS = 1000;
        int MULTIPLIER_CONSTANT_OF_SPHERE = 2;
        int BULLET_MULTIPLIER_CONSTANT_OF_LOCATION = 2;
        int BULLET_MULTIPLIER_CONSTANT_OF_LOCATION_SECOND = 7;

        double OBSTACLE_MOVE_PROBABILITY = 0.2;
        double SPEED_DIVISION_CONSTANT = 400;
        double OBSTACLE_FAST_CONSTANT_OF_SPEED = 2.0;
        double SPELL_SIZE_DIVISION_CONSTANT = 2.0;
        double YMIR_NORMAL_MODE_PROBABILITY = 0.5;
        double YMIR_HARD_MODE_PROBABILITY = 0.75;
        double DIVISION_CONSTANT_OF_SPHERE = 2.0;
        double DIVISION_CONSTANT_OF_PHANTASM = 2.0;
        double BULLET_MULTIPLIER_CONSTANT = 57.29;
        double BULLET_DIVISION_CONSTANT = 8.0;

        Size MENU_AND_AUTH_VIEW_COMPONENT_SIZE = new Size(192, 50);

        Location LOGIN_VIEW_COMPONENT_LOCATION = new Location(943.0, 186.0);
        Location AUTH_VIEW_EXCEPT_LOGIN_LOCATION = new Location(550.0, 80.0);
        Location MAIN_MENU_VIEW_LOCATION = new Location(543.0, 361.0);

        Color OVERLAY_BACKGROUND_COLOR = new Color(0.21f, 0.22f, 0.28f);
        Color PURPLE_COLOR = new Color(102, 0, 153);

        Color GREEN_SPELL = Color.GREEN.darker().darker();
        Color CYAN_SPELL = Color.CYAN.darker();
        Color YELLOW_SPELL = Color.YELLOW.darker();
        Color PINK_SPELL = Color.PINK;

        Color TEXT_FIELD_FOREGROUND_COLOR = Color.GRAY;
    }

    /**
     * Constants for the names of the obstacles.
     */
    interface ObstacleNameConstants {
        String SIMPLE_OBSTACLE = "SimpleObstacle";
        String FIRM_OBSTACLE = "FirmObstacle";
        String EXPLOSIVE_OBSTACLE = "ExplosiveObstacle";
        String GIFT_OBSTACLE = "GiftObstacle";
        String HOLLOW_PURPLE_OBSTACLE = "HollowPurpleObstacle";
    }

    /**
     * Constants for the obstacle threshold.
     */
    interface ObstacleNumberConstants {
        int MIN_SIMPLE_OBSTACLE_NUM = 75;
        int MIN_FIRM_OBSTACLE_NUM = 10;
        int MIN_EXPLOSIVE_OBSTACLE_NUM = 5;
        int MIN_GIFT_OBSTACLE_NUM = 10;

        int MAX_SIMPLE_OBSTACLE_NUM = 120;
        int MAX_FIRM_OBSTACLE_NUM = 20;
        int MAX_EXPLOSIVE_OBSTACLE_NUM = 10;
        int MAX_GIFT_OBSTACLE_NUM = 20;

        int HOLLOW_OBSTACLE_NUM = 8;
        int INFINITE_VOID_NUM = 8;
    }

    /**
     * Array constants for the selections.
     */
    interface ArrayConstants {
        String[] OBSTACLE_NAMES_ARR = {Constants.ObstacleNameConstants.SIMPLE_OBSTACLE, Constants.ObstacleNameConstants.FIRM_OBSTACLE,
                Constants.ObstacleNameConstants.EXPLOSIVE_OBSTACLE, Constants.ObstacleNameConstants.GIFT_OBSTACLE};
    }

    /**
     * Constants for the names of the spells.
     */
    interface SpellNameConstants {
        String CHANCE = "ChanceGivingSpell";
        String EXPANSION = "ExpansionSpell";
        String HEX = "MagicalHexSpell";
        String UNSTOPPABLE = "UnstoppableSpell";
    }

    /**
     * Constants for the method messages.
     */
    interface MessageConstants {
        String OBSTACLE_SUBSCRIBER_MESSAGE = "I just detected that this obstacle got destroyed! I must set my isDestroyed value to true!";
        String HOLLOW_PURPLE_TRIGGERED = "Hollow Purple Spell is activated.";
        String DOUBLE_ACCEL_TRIGGERED = "Double Accel is activated.";
        String INFINITE_VOID_TRIGGERED = "Infinite Void is activated.";
        String RIGHT_BULLET_CREATION = "Right bullet created.";
        String LEFT_BULLET_CREATION = "Left bullet created.";
        String YMIR_ACTIVATION_MESSAGE = "Activation probability is set to 0.75";
        String YMIR_CALCULATION_MESSAGE = "Ymir is calculating!";
        String YMIR_EXCEPTION_MESSAGE = "EXCEPTION: YMIR Spell Method returned as a null.";
        String LOGIN_RESPONSE_FAIL = "Login Failed";
        String OBSTACLE_PLACEMENT_EXCEPTION = "Found an exception about obstacle placement.";
        String USER_NOMAP_EXCEPTION = "There isn't a previously saved map.";
        String PREVIOUS_GAME_LOST = "You have lost in previous game.";
        String CONFIRM_EXIT = "Are you sure?";
        String EXIT_TEXT = "Exit";
    }

    /**
     * Constants for the name of the sounds to be played.
     */
    interface SoundConstants {
        String NOBLE_PHANTASM_HIT_SOUND = "phantasmHitEffect.wav";
        String FRAME_HIT_SOUND = "frameHitEffect.wav";
        String OBSTACLE_HIT_SOUND = "obstacleHitEffect.wav";
    }
}