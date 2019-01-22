package frc.robot;

public class RobotMap {
    //Toggles for Subsystems

    //Joystick Mapping
    public static int JOYSTICK_USB;
    //Motor Channels
    public static int MOTOR_LEFT_FRONT;
    public static int MOTOR_LEFT_BACK;
    public static int MOTOR_RIGHT_FRONT;
    public static int MOTOR_RIGHT_BACK;
    public static int MOTOR_PUSHER;
    public static int MOTOR_CUBE_LOCK;

    public static void init(){
        JOYSTICK_USB = 0;
        MOTOR_LEFT_FRONT = 0;
        MOTOR_LEFT_BACK = 1;
        MOTOR_RIGHT_FRONT = 2;
        MOTOR_RIGHT_BACK = 3;
        MOTOR_PUSHER = 4;
        MOTOR_CUBE_LOCK = 7;
    }

    
    //Scalers
}
