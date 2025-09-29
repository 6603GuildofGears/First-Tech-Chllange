//package org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp.old;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp.robotv3_2024_2025.*;
//@Disabled
//@TeleOp(name = "Encoder")
//public class Encoder_reset extends LinearOpMode {
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        initMotors(this);
//        boolean RB2prev = false;
//        int clawstate = 0;
//        int wriststate = 0;
//        int poswrist = 0;
//        bucket.setPosition(0.4);
//        wrist.setPosition(0.35);
//        boolean LB2prev = false;
//        slideLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        slideRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
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
//
//
//
//
//
//
//                telemetry.addData("LSlidePose: ", slideLeft.getCurrentPosition());
//                telemetry.addData("RSlidePose: ", slideRight.getCurrentPosition());
//                telemetry.update();
//
//                if(a2){
//                    slideLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//                    slideRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//                }
//                telemetry.addData("LSlidePose: ", slideLeft.getCurrentPosition());
//                telemetry.addData("RSlidePose: ", slideRight.getCurrentPosition());
//                telemetry.update();
//
//
//            }
//        }
//    }
//}
//
