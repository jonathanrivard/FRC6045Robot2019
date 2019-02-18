package frc.robot;

public class RobotMap {
    //CONTROL JOYSTICK
    public static int CONTROL_JOYSTICK = 0;
    public static int CONTROL_JOYSTICK_TRIGGER = 1;
    public static int CONTROL_JOYSTICK_THUMB = 2;
    //LEFT JOYSTICK
    public static int LEFT_JOYSTICK = 1;
    public static int LEFT_JOYSTICK_TRIGGER = 0;
    //RIGHT JOYSTICK
    public static int RIGHT_JOYSTICK = 2;
    public static int RIGHT_JOYSTICK_TRIGGER = 0;
    public static int RIGHT_POS_ONE = 13; 
    public static int RIGHT_POS_TWO = 12; 
    public static int RIGHT_POS_THREE = 11; 
    public static int RIGHT_POS_FOUR = 14; 
    public static int RIGHT_POS_FIVE = 15; 
    public static int RIGHT_POS_SIX = 16; 
    public static int RIGHT_POS_SEVEN = 4; 
    public static int RIGHT_POS_EIGHT = 3; 
    //DIGITAL INPUTS
    //-Lift
    public static int DIGITAL_LIFT_UP = 4;
    public static int DIGITAL_LIFT_DOWN = 5;
    //-Claw
    //--Grabber
    public static int DIGITAL_CLAW_GRABBER_OPEN = 0;
    public static int DIGITAL_CLAW_GRABBER_CLOSED = 1;
    //--Tilter
    public static int DIGITAL_CLAW_TILTER_TOP = 2;
    public static int DIGITAL_CLAW_TILTER_BOTTOM = 3;
    //MOTORS
    //-Drivetrain
    public static int MOTOR_LEFT_FRONT = 14;
    public static int MOTOR_LEFT_BACK = 15;
    public static int MOTOR_RIGHT_FRONT = 1;
    public static int MOTOR_RIGHT_BACK = 0;
    //-Lift
    public static int MOTOR_LIFT = 13;
    //-Claw
    public static int MOTOR_CLAW = 2;
    public static int MOTOR_CLAW_TILT = 0;
    public static int MOTOR_CLAW_BELT_LEFT = 12;
    public static int MOTOR_CLAW_BELT_RIGHT = 3;
    //-Hook
    public static int MOTOR_HOOK = 0;
    //
    public static int GRAB_HATCH_POS = 5;
    public static int CLAW_CLOSED_POSITION = 0;
    public static int CLAW_OPEN_POSITION = 0;
    // Manual grab is z axis
    // Manual tilt is y axis
    //SCALER
    public static float SCALER_DRIVE = 0.7f;
    public static float SCALER_LIFT_MANUAL = 0.6f;
    public static float SCALER_LIFT_AUTO = 0.6f;
    public static float SCALER_CLAW_GRAB = 0.5f;
    public static float SCALER_CLAW_BELT_OUT = 0.8f;
    public static float SCALER_CLAW_BELT_IN = 0.4f;
    public static float SCALER_CLAW_TILT = 0.5f;
    public static float SCALER_HOOK = 0.5f;
    //LIFT POSITIONS
    public static int POS_ONE = 23350; //Top Ball Height
    public static int POS_TWO = 23350; //Second to Top Height
    public static int POS_THREE = 13500; //Third to Top Height
    public static int POS_FOUR = 13500; //Four to Top Height
    public static int POS_FIVE = 5270; //Fifth to Top Height
    public static int POS_SIX = 2900; //Bottom Ball and Hatch Height
    public static int POS_SEVEN = 0; //Shuttle Ball Height
    public static int POS_EIGHT = 0; //Bottom
}
