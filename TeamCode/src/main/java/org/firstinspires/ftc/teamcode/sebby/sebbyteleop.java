package org.firstinspires.ftc.teamcode.sebby;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


import static org.firstinspires.ftc.teamcode.sebby.sebbyrobot.*;

@TeleOp(name = "Sebby's Stuff")
public class sebbyteleop extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        double gear = 1;

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


                //drive

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

                } else if (dpadUp1) {
                    SetPower(1, 1, 1, 1); //0.3
                } else if (dpadRight1) {
                    SetPower(1, -1, -1, 1); //0.5
                } else if (dpadLeft1) {
                    SetPower(-1, 1, 1, -1);
                } else if (dpadDown1) {
                    SetPower(-1, -1, -1, -1);


                } else {
                 SetPower(0,0,0,0);
                }

                //AUX





            }
        }

    }
}
