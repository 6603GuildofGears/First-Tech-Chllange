package org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import static org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp.robotv3_2024_2025.*;

@TeleOp(name = "The Procrastonator")
public class The_Procrastonator extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        initMotors(this);

        int clawstate = 0;
        int wriststate = 0;
        int poswrist = 0;
        int bucketstate = 0;
        int posbucket = 0;

        double gear = 1;
        boolean RB2prev = false;
        boolean LB2prev = false;
        boolean RT2prev = false;


        waitForStart();
        while (opModeIsActive()) {


            waitForStart();
            while (opModeIsActive()) {

                boolean LStickIn2 = gamepad2.left_stick_button;
                boolean RStickIn2 = gamepad2.right_stick_button;
                boolean LBumper1 = gamepad1.left_bumper;
                boolean RBumper1 = gamepad1.right_bumper;

                double LStickY = gamepad1.left_stick_y;
                double LStickX = gamepad1.left_stick_x;
                double RStickY = -gamepad1.right_stick_y;
                double RStickX = -gamepad1.right_stick_x;

                double LTrigger1 = gamepad1.left_trigger; //
                double RTrigger1 = gamepad1.right_trigger; //

                boolean a1 = gamepad1.a;
                boolean b1 = gamepad1.b;
                boolean x1 = gamepad1.x;
                boolean y1 = gamepad1.y;

                boolean a2 = gamepad2.a;
                boolean b2 = gamepad2.b;
                boolean x2 = gamepad2.x;
                boolean y2 = gamepad2.y;

                double LTrigger2 = gamepad2.left_trigger;
                double RTrigger2 = gamepad2.right_trigger;
                boolean LBumper2 = gamepad2.left_bumper;
                boolean RBumper2 = gamepad2.right_bumper;

                double RStickY2 = -gamepad2.right_stick_y;
                double RStickX2 = gamepad2.right_stick_x;
                double LStickY2 = -gamepad2.left_stick_y;
                double LStickX2 = gamepad2.left_stick_x;

                boolean dpadUp1 = gamepad1.dpad_up;
                boolean dpadDown1 = gamepad1.dpad_down;
                boolean dpadRight1 = gamepad1.dpad_right;
                boolean dpadLeft1 = gamepad1.dpad_left;

                boolean dpadUp2 = gamepad2.dpad_up;
                boolean dpadDown2 = gamepad2.dpad_down;
                boolean dpadRight2 = gamepad2.dpad_right;
                boolean dpadLeft2 = gamepad2.dpad_left;




                if (Math.abs(LStickX) > 0 || Math.abs(LStickY) > 0 || Math.abs(RStickX) > 0) {
                    //Orientation angles = imu.getAngularOrientation();
                    double rotation = 0; //Math.toRadians(angles.firstAngle);
                /*
                if (Math.abs(LStickX) < .05 && Math.abs(RStickX) < .05) {
                    SetPower(LStickY, LStickY, LStickY, LStickY);
                }
                else if (Math.abs(LStickY) < .05 && Math.abs(RStickX) < .05) {
                    SetPower(LStickX, -LStickX, -LStickX, LStickX);//+--+
                }
                */

                    double newX = -LStickX * Math.cos(rotation) - -LStickY * Math.sin(rotation); //Angle Difference Identity
                    double newY = LStickY * Math.cos(rotation) - -LStickX * Math.sin(rotation); //Trigonometry

                    double r = Math.hypot(newX, newY);
                    double robotAngle = Math.atan2(newY, newX) - Math.PI / 4;
                    double rightX = -gamepad1.right_stick_x;

                    double v1 = r * Math.cos(robotAngle) + rightX * gear; //lf
                    double v2 = r * Math.sin(robotAngle) + rightX * gear; //rf
                    double v3 = r * Math.sin(robotAngle) - rightX * gear; //lb
                    double v4 = r * Math.cos(robotAngle) - rightX * gear; //rb


                    SetPower(v1, v2, v3, v4);


                } else if (LBumper1) {
                    SetPower(-gear, gear, gear, -gear);

                } else if (RBumper1) {
                    SetPower(gear, -gear, -gear, gear);

                }  else if (dpadUp1) {
                    SetPower(1 , 1 , 1 , 1 ); //0.3
                } else if (dpadRight1) {
                    SetPower(1, -1, -1, 1); //0.5
                } else if (dpadLeft1) {
                    SetPower(-1, 1, 1, -1);
                } else if (dpadDown1) {
                    SetPower(-1, -1, -1, -1);


                } else {
                    frontLeft.setPower(0);
                    backLeft.setPower(0);
                    frontRight.setPower(0);
                    backRight.setPower(0);
                }



                telemetry.addData("LSlidePose: ", slideLeft.getCurrentPosition());
                telemetry.addData("RSlidePose: ", slideRight.getCurrentPosition());
                telemetry.addData("wrist",wrist.getPosition());
                telemetry.addData("bucket",bucket.getPosition());
                telemetry.addData("claw",claw.getPosition());
                telemetry.update();

                //AUX
                //claw

                // bucket test




                if (RBumper2 && !RB2prev) {
                    RB2prev = RBumper2;
                    if (clawstate == 0) {
                        claw.setPosition(0.22); //  closed
                        clawstate++;
                    }
                    if (clawstate == 2) {
                        claw.setPosition(0);// open
                        clawstate++;
                    }

                }
                if (!RBumper2 && RB2prev) {
                    RB2prev = RBumper2;
                    int temp = clawstate + 1;
                    clawstate = (clawstate == 3) ? 0 : temp;
                }

                //bucket

                if(RTrigger2> 0.5){
                    bucket.setPosition(1);
                }else {
                    bucket.setPosition(0.67);
                }
                //intake
                if (LTrigger2 > 0.5){
                    intake.setPower(-1);
                } else if (a2) {
                    intake.setPower(1);
                }else{
                    intake.setPower(0);
                }


                    // wrist
                if (LBumper2 && !LB2prev) {
                    LB2prev = LBumper2;
                    if (wriststate == 0) {
                        wrist.setPosition(0); // down
                        poswrist = 0;
                        wriststate++;
                    }
                    if (wriststate == 2) {
                        wrist.setPosition(0.055);// up

                        poswrist = 1;
                        wriststate++;
                    }

                }
                if (!LBumper2 && LB2prev) {
                    LB2prev = LBumper2;
                    int temp = wriststate + 1;
                    wriststate = (wriststate == 3) ? 0 : temp;
                }



                //slide up




                if (RStickY2 > 0.1) {
                   slideLeft.setPower(1);
                   slideRight.setPower(1);
                } else if (RStickY2 < -.1) {
                    slideLeft.setPower(-.75);
                    slideRight.setPower(-.75);
                } else {
                    slideLeft.setPower(0.04);
                    slideRight.setPower(0.04);
                }
                // extend out
                if(LStickY2> 0.1){
                    extendLeft.setPower(0.5);
                    extendRight.setPower(0.50);
                }else if(LStickY2 < -0.1){
                    extendLeft.setPower(-0.50);
                    extendRight.setPower(-0.50);
                }else{
                    extendLeft.setPower(-0.075);
                    extendRight.setPower(-0.075);
                }

            }
        }
    }
}

