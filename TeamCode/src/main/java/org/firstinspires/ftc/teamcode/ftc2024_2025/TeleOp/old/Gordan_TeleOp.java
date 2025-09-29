
/*package org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25.*;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled

@TeleOp(name = "Gordan_TeleOp")
public  class Gordan_TeleOp{

/*
    @Override
    public void runOpMode() throws InterruptedException {
        initMotors(this);
      //  wrist.setPosition(0.146);
       // slideOut.setPosition(0.185);
        //claw.setPosition(0.45);
        //sleep(500);
       // holder.setPosition(0.25);
        int RB2state = 0;
        int LB2state = 0;
        int a2state = 0;
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

            double LTrigger1 = gamepad1.left_trigger;
            double RTrigger1 = gamepad1.right_trigger;

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

            // Drive
            if (RStickY > 0.1) {
                frontRight.setPower(1);
                backRight.setPower(1);
            } else if (RStickY < -0.1) {
                frontRight.setPower(-1);
                backRight.setPower(-1);
            } else {
                frontRight.setPower(0);
                backRight.setPower(0);
                                                                                                         }
            if (LStickY > 0.1) {
                frontLeft.setPower(1);
                backLeft.setPower(1);
            } else if (LStickY < -0.1) {
                frontLeft.setPower(-1);
                backLeft.setPower(-1);
            } else {
                frontLeft.setPower(0);
                backLeft.setPower(0);
            }
            //lstrafe
            if (LBumper1) {
                frontRight.setPower(1);
                backRight.setPower(-1);
                frontLeft.setPower(1);
                backLeft.setPower(-1);
                //rstrafe
            } else if (RBumper1) {
                frontRight.setPower(-1);
                backRight.setPower(1);
                frontLeft.setPower(-1);
                backLeft.setPower(1);
            } else {
                frontRight.setPower(0);
                backRight.setPower(0);
                frontLeft.setPower(0);
                backLeft.setPower(0);
            }
            //AUX
/*
            //holder
            if(y2) {
                holder.setPosition(.5);
            }

            //claw
            if (a2state == 0 && a2 || a2state == 1 && a2) {
                if (a2state == 0) {
                    claw.setPosition(0.1);
                    a2state = 1;
                }
            } else if (a2state == 2 && a2 || a2state == 3 && a2) {
                if (a2state == 2) {
                    claw.setPosition(0.45);
                    a2state = 3;
                }
            } else if (!a2 && a2state == 3) {
                a2state = 0;
            } else if (!a2 && a2state == 1) {
                a2state = 2;
            }

            // wrist
            if (LB2state == 0 && LBumper2 || LB2state == 1 && LBumper2) {
                if (LB2state == 0) {
                    wrist.setPosition(0.325);
                    LB2state = 1;
                }
            } else if (LB2state == 2 && LBumper2 || LB2state == 3 && LBumper2) {
                if (LB2state == 2) {
                    wrist.setPosition(0.08 );
                    LB2state = 3;
                }
            } else if (!LBumper2 && LB2state == 3) {
                LB2state = 0;
            } else if (!LBumper2 && LB2state == 1) {
                LB2state = 2;
            }
            // Marshall's Special Spot
            if(x2){
                wrist.setPosition(0.3);
            }if(dpadUp2){
                wrist.setPosition(0.25);
            }

            //slide up

            if (LStickY2 > 0.1) {
                slideOne.setPower(1);
            } else if (LStickY2 < -0.1) {
                slideOne.setPower(-1);
            } else {
                slideOne.setPower(0.05);
                }
            // slide out
            if (RB2state == 0 && RBumper2 || RB2state == 1 && RBumper2) {
                if (RB2state == 0) {
                    slideOut.setPosition(0.335);
                    RB2state = 1;
                }
            } else if (RB2state == 2 && RBumper2 || RB2state == 3 && RBumper2) {
                if (RB2state == 2) {
                    slideOut.setPosition(0.16);
                    RB2state = 3;
                }
            } else if (!RBumper2 && RB2state == 3) {
                RB2state = 0;
            } else if (!RBumper2 && RB2state == 1) {
                RB2state = 2;
            }


*/



//}





