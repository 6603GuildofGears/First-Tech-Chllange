//package org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp.old;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//
//
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp.old.robot24_25test.*;
//
//@Disabled
//@TeleOp(name = "Alex Drive")
//public class Alex_Drive extends LinearOpMode {
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        initMotors(this);
//        int clawstate= 0;
//        int wriststate=0;
//        boolean LB2prev =false;
//        boolean RB2prev = false;
//        int poswrist  = 0;
//
//
//        waitForStart();
//        while (opModeIsActive()) {
//
//
//            waitForStart();
//            while (opModeIsActive()) {
//
//                boolean LStickIn2 = gamepad2.left_stick_button;
//                boolean RStickIn2 = gamepad2.right_stick_button;
//                boolean LBumper1 = gamepad1.left_bumper;
//                boolean RBumper1 = gamepad1.right_bumper;
//
//                double LStickY = gamepad1.left_stick_y;
//                double LStickX = gamepad1.left_stick_x;
//                double RStickY = -gamepad1.right_stick_y;
//                double RStickX = -gamepad1.right_stick_x;
//
//                double LTrigger1 = gamepad1.left_trigger; //
//                double RTrigger1 = gamepad1.right_trigger; //
//
//                boolean a1 = gamepad1.a;
//                boolean b1 = gamepad1.b;
//                boolean x1 = gamepad1.x;
//                boolean y1 = gamepad1.y;
//
//                boolean a2 = gamepad2.a;
//                boolean b2 = gamepad2.b;
//                boolean x2 = gamepad2.x;
//                boolean y2 = gamepad2.y;
//
//                double LTrigger2 = gamepad2.left_trigger;
//                double RTrigger2 = gamepad2.right_trigger;
//                boolean LBumper2 = gamepad2.left_bumper;
//                boolean RBumper2 = gamepad2.right_bumper;
//
//                double RStickY2 = -gamepad2.right_stick_y;
//                double RStickX2 = gamepad2.right_stick_x;
//                double LStickY2 = -gamepad2.left_stick_y;
//                double LStickX2 = gamepad2.left_stick_x;
//
//                boolean dpadUp1 = gamepad1.dpad_up;
//                boolean dpadDown1 = gamepad1.dpad_down;
//                boolean dpadRight1 = gamepad1.dpad_right;
//                boolean dpadLeft1 = gamepad1.dpad_left;
//
//                boolean dpadUp2 = gamepad2.dpad_up;
//                boolean dpadDown2 = gamepad2.dpad_down;
//                boolean dpadRight2 = gamepad2.dpad_right;
//                boolean dpadLeft2 = gamepad2.dpad_left;
//
//
//                if (Math.abs(LStickX) > 0 || Math.abs(LStickY) > 0 || Math.abs(RStickX) > 0) {
//                    //Orientation angles = imu.getAngularOrientation();
//                    double rotation = 0; //Math.toRadians(angles.firstAngle);
//                /*
//                if (Math.abs(LStickX) < .05 && Math.abs(RStickX) < .05) {
//                    SetPower(LStickY, LStickY, LStickY, LStickY);
//                }
//                else if (Math.abs(LStickY) < .05 && Math.abs(RStickX) < .05) {
//                    SetPower(LStickX, -LStickX, -LStickX, LStickX);//+--+
//                }
//                */
//
//                    double newX = -LStickX * Math.cos(rotation) - -LStickY * Math.sin(rotation); //Angle Difference Identity
//                    double newY = LStickY * Math.cos(rotation) - -LStickX * Math.sin(rotation); //Trigonometry
//
//                    double r = Math.hypot(newX, newY);
//                    double robotAngle = Math.atan2(newY, newX) - Math.PI / 4;
//                    double rightX = -gamepad1.right_stick_x;
//
//                    double v1 = r * Math.cos(robotAngle) + rightX; //lf
//                    double v2 = r * Math.sin(robotAngle) + rightX; //rf
//                    double v3 = r * Math.sin(robotAngle) - rightX; //lb
//                    double v4 = r * Math.cos(robotAngle) - rightX; //rb
//
//
//                    SetPower(v1, v2, v3, v4);
//
//
//
//                }else {
//                    frontLeft.setPower(0);
//                    backLeft.setPower(0);
//                    frontRight.setPower(0);
//                    backRight.setPower(0);
//                }
//                if (RBumper2 && !RB2prev){
//                    RB2prev = RBumper2;
//                    if (clawstate==0){
//                        claw.setPosition(0.12); // semi out
//                        clawstate++;
//                    }
//                    if (clawstate==2){
//                        claw.setPosition(0);// in
//                        clawstate++;
//                    }
//                    if (clawstate==4){
//                        claw.setPosition(0.35);// out
//                        clawstate++;
//                    }
//                }
//                if (!RBumper2 && RB2prev){
//                    RB2prev = RBumper2;
//                    int temp = clawstate + 1;
//                    clawstate=(clawstate == 5)? 0: temp;
//                }
//
//
//                if (LBumper2 && !LB2prev){
//                    LB2prev = LBumper2;
//                    if (wriststate==0){
//                        wrist.setPosition(0.29); // flat
//                        poswrist = 0;
//                        wriststate++;
//                    }
//                    if (wriststate==2){
//                        wrist.setPosition(0.34);// down
//                        poswrist = 1;
//                        wriststate++;
//                    }
//                    if (wriststate==4){
//                        wrist.setPosition(0.2);// up
//                        poswrist = 2;
//                        wriststate++;
//                    }
//                }
//                if (!LBumper2 && LB2prev){
//                    LB2prev = LBumper2;
//                    int temp = wriststate + 1;
//                    wriststate=(wriststate == 5)? 0: temp;
//                }
//                if(dpadDown2){
//                    wrist.setPosition(0.085);
//                }
//
//
//
//                //slide up
//
//
//                if (RStickY2 > 0.1){
//                    slideOne.setPower(1);
//                } else if (RStickY2 <-.1) {
//                    slideOne.setPower(-1);
//                }else {
//                    slideOne.setPower(0.15);
//                }
//                // slide out
//
//
//                if (LStickY2 < 0.1){
//                    slideOut.setPosition(0.3);
//                }else{
//                    slideOut.setPosition(0.04);
//                }
//                // parscope
//                if (dpadLeft2){
//                    scope.setPosition(1);
//                }if (dpadRight2){
//                    scope.setPosition(0.15);
//                }
//
//
//            }
//        }
//    }
//
//}
