//package org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp.old;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp.robot24_25.*;
//@Disabled
//@TeleOp(name = "Ocean_guild_TeleOp")
//public class Ocean_Guild_TeleOp extends LinearOpMode {
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        initMotors(this);
//        boolean RB2prev = false;
//        int clawstate= 0;
//        int wriststate=0;
//        int poswrist  = 0;
//        boolean LB2prev =false;
//        double gear = 0.5;
//        double gear2 = 0.25;
//
//        waitForStart();
//        while (opModeIsActive()) {
//
//
//            boolean LStickIn2 = gamepad2.left_stick_button;
//            boolean RStickIn2 = gamepad2.right_stick_button;
//            boolean LBumper1 = gamepad1.left_bumper;
//            boolean RBumper1 = gamepad1.right_bumper;
//
//            double LStickY = gamepad1.left_stick_y;
//            double LStickX = gamepad1.left_stick_x;
//            double RStickY = -gamepad1.right_stick_y;
//            double RStickX = -gamepad1.right_stick_x;
//
//            double LTrigger1 = gamepad1.left_trigger;
//            double RTrigger1 = gamepad1.right_trigger;
//
//            boolean a1 = gamepad1.a;
//            boolean b1 = gamepad1.b;
//            boolean x1 = gamepad1.x;
//            boolean y1 = gamepad1.y;
//
//            boolean a2 = gamepad2.a;
//            boolean b2 = gamepad2.b;
//            boolean x2 = gamepad2.x;
//            boolean y2 = gamepad2.y;
//
//            double LTrigger2 = gamepad2.left_trigger;
//            double RTrigger2 = gamepad2.right_trigger;
//            boolean LBumper2 = gamepad2.left_bumper;
//            boolean RBumper2 = gamepad2.right_bumper;
//
//            double RStickY2 = -gamepad2.right_stick_y;
//            double RStickX2 = gamepad2.right_stick_x;
//            double LStickY2 = -gamepad2.left_stick_y;
//            double LStickX2 = gamepad2.left_stick_x;
//
//            boolean dpadUp1 = gamepad1.dpad_up;
//            boolean dpadDown1 = gamepad1.dpad_down;
//            boolean dpadRight1 = gamepad1.dpad_right;
//            boolean dpadLeft1 = gamepad1.dpad_left;
//
//            boolean dpadUp2 = gamepad2.dpad_up;
//            boolean dpadDown2 = gamepad2.dpad_down;
//            boolean dpadRight2 = gamepad2.dpad_right;
//            boolean dpadLeft2 = gamepad2.dpad_left;
//
//            // gear shift
//            double Rpower = RStickY;
//            double Lpower = -LStickY;
//            if ( poswrist == 0 || poswrist == 1){
//                Lpower = -LStickY *0.5;
//                Rpower = RStickY *0.5;
//                gear = 0.5;
//
//            }else {
//                Lpower = -LStickY *0.75;
//                Rpower = RStickY *0.75;
//            }
//
//
//       /*     // fine drive
//            if(dpadUp1){
//              frontLeft.setPower(gear2);
//              frontRight.setPower(gear2);
//              backLeft.setPower(gear2);
//              backRight.setPower(gear2);
//            } else if(dpadDown1){
//                frontLeft.setPower(-gear2);
//                frontRight.setPower(-gear2);
//                backLeft.setPower(-gear2);
//                backRight.setPower(-gear2);
//            } else if( dpadLeft1){
//                SetPower(gear2, gear2, -gear2, -gear2);
//            }else if(dpadRight1){
//                SetPower(-gear2, -gear2, gear2, gear2);
//            }
//
//        */
//
//            // stafe right fl, -bl,-fr,br
//            // stafe Left -fl, bl,fr,-br
//
//             if (LStickY > 0.1 || RStickY > 0.1 || LStickY < -0.1 || RStickY < -0.1) {
//                SetPower(Lpower, Lpower, Rpower, Rpower);
//             } else if (LBumper1) {
//                 SetPower(-0.75, 0.75, 0.75, -0.75);
//             } else if (RBumper1) {
//                 SetPower(.75, -0.75, -0.75, 0.75);
//             } else if (RTrigger1 > 0.5) {
//                 SetPower(-0.75, 0.75, 0.75, -0.75);
//             } else if (LTrigger1 >0.5) {
//                 SetPower(.75, -0.75, -0.75, 0.75);
//            }else {
//                 SetPower(0, 0, 0, 0);
//            }
//             telemetry.addData("LStickY",LStickY);
//             telemetry.addData("RStickY",RStickY);
//             telemetry.addData("SlidePose: " , slideOne.getCurrentPosition());
//             telemetry.update();
//
//            //AUX
//            //claw
//
//            if (RBumper2 && !RB2prev){
//                RB2prev = RBumper2;
//                if (clawstate==0){
//                    claw.setPosition(0.12); // semi out
//                    clawstate++;
//                }
//                if (clawstate==2){
//                    claw.setPosition(0);// in
//                    clawstate++;
//                }
//                if (clawstate==4){
//                    claw.setPosition(0.35);// out
//                    clawstate++;
//                }
//            }
//            if (!RBumper2 && RB2prev){
//                RB2prev = RBumper2;
//                int temp = clawstate + 1;
//                clawstate=(clawstate == 5)? 0: temp;
//            }
//
//
//            if (LBumper2 && !LB2prev){
//                LB2prev = LBumper2;
//                if (wriststate==0){
//                    wrist.setPosition(0.29); // flat
//                    poswrist = 0;
//                    wriststate++;
//                }
//                if (wriststate==2){
//                    wrist.setPosition(0.34);// down
//                    poswrist = 1;
//                    wriststate++;
//                }
//                if (wriststate==4){
//                    wrist.setPosition(0.2);// up
//                    poswrist = 2;
//                    wriststate++;
//                }
//            }
//            if (!LBumper2 && LB2prev){
//                LB2prev = LBumper2;
//                int temp = wriststate + 1;
//                wriststate=(wriststate == 5)? 0: temp;
//            }
//             if(dpadDown2){
//                 wrist.setPosition(0.085);
//             }
//
//
//
//            //slide up
//
//
//            if (RStickY2 > 0.1){
//                slideOne.setPower(1);
//            } else if (RStickY2 <-.1) {
//                slideOne.setPower(-1);
//            }else {
//                slideOne.setPower(0.15);
//            }
//            // slide out
//
//
//            if (LStickY2 < 0.1){
//                slideOut.setPosition(0.3);
//            }else{
//                slideOut.setPosition(0.04);
//            }
//            // parscope
//            if (dpadLeft2){
//                scope.setPosition(1);
//            }if (dpadRight2){
//                scope.setPosition(0.15);
//            }
//
//
//        }
//    }
//}
