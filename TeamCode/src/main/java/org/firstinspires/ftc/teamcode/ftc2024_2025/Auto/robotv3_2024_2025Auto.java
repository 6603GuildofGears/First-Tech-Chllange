package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class robotv3_2024_2025Auto {
    //    public Robot() {}
    static DcMotor frontLeft;
    static DcMotor frontRight;
    static DcMotor backRight;
    static DcMotor backLeft;
    static DcMotor slideLeft;
    static DcMotor slideRight;
    static DcMotor slideout;
    static Servo wrist;
    static CRServo intake;
    static Servo bucket;
    static Servo claw;
    static DcMotor extendLeft;
    static DcMotor extendRight;

    static BNO055IMU imu;
    // static Orientation lastAngles = new Orientation();
    static double globalAngle;
    //servos


    public static void initMotors(OpMode opMode) {
        frontLeft = opMode.hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = opMode.hardwareMap.get(DcMotor.class, "frontRight");
        backRight = opMode.hardwareMap.get(DcMotor.class, "backRight");
        backLeft = opMode.hardwareMap.get(DcMotor.class, "backLeft");
        slideLeft = opMode.hardwareMap.get(DcMotor.class, "slideLeft");
        slideRight = opMode.hardwareMap.get(DcMotor.class, "slideRight");
        wrist = opMode.hardwareMap.get(Servo.class,"wrist");
        extendLeft = opMode.hardwareMap.get(DcMotor.class,"extendLeft");
        extendRight = opMode.hardwareMap.get(DcMotor.class,"extendRight");
        intake = opMode.hardwareMap.get(CRServo.class,"intake");
        bucket = opMode.hardwareMap.get(Servo.class,"bucket");
        claw= opMode.hardwareMap.get(Servo.class,"claw");



        //power



        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.FORWARD);
        slideLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        slideRight.setDirection(DcMotorSimple.Direction.REVERSE);
        wrist.setDirection(Servo.Direction.REVERSE);
        bucket.setDirection(Servo.Direction.REVERSE);
        extendLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        extendRight.setDirection(DcMotorSimple.Direction.REVERSE);



        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        slideLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        slideRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public static void resetMotors() {
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        slideLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        slideRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        slideLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        slideRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


    }



    public static void SetPower(double LFPower, double LBPower, double RFPower, double RBPower) {
        //public static void SetPower(double LPower,double RPower){
        frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        slideLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        slideRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //the names are right but it was buging
        frontLeft.setPower(LFPower);
        backLeft.setPower(LBPower);
        frontRight.setPower(RFPower);
        backRight.setPower(RBPower);
    }

    public static void initIMU(OpMode opMode) {
        BNO055IMU.Parameters parameters = new BNO055IMU.Parameters();
        parameters.mode = BNO055IMU.SensorMode.IMU;
        parameters.angleUnit = BNO055IMU.AngleUnit.DEGREES;
        parameters.accelUnit = BNO055IMU.AccelUnit.METERS_PERSEC_PERSEC;
        parameters.loggingEnabled = false;
        //This line is only necessary if the the Control Hub is mounted vertically (as done this year)
        //BNO055IMUUtil.remapAxes(imu, AxesOrder.XYZ, AxesSigns.NPN);

        imu = opMode.hardwareMap.get(BNO055IMU.class, "imu");

        imu.initialize(parameters);

        opMode.telemetry.addData("Mode: ", "imu calibrating");
        opMode.telemetry.update();

        // make sure the imu gyro is calibrated before continuing.
        while (!imu.isGyroCalibrated()) {
        }
        opMode.telemetry.addData("imu calib status: ", imu.getCalibrationStatus().toString());
        opMode.telemetry.update();
        //  resetAngle();
    }

    /*private static void resetAngle() {
        lastAngles = imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES);
        globalAngle = 0;
    }*/
}

