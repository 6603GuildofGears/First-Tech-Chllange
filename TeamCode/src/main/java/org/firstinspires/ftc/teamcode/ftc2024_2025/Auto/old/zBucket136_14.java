//package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.old;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25Auto.*;
//@Disabled
//
//@Autonomous(name = "Bucket13.5_14")
//public class zBucket136_14 extends LinearOpMode {
//    @Override
//    public void runOpMode() throws InterruptedException {
//        initMotors(this);
//        double gear = 0.5;
//        double geardead = 0;
//
//        waitForStart();
//        while (opModeIsActive()) {
//
//            // forward and back are opsite
//            // claw
//            claw.setPosition(0);
//            //wrist
//            scope.setPosition(0.25);
//
//            wrist.setPosition(0.085);
//            sleep(2000);
//            //foward
//
//            //slide up
//            slideOne.setPower(1);
//            sleep(1900);
//            slideOne.setPower(0.05);
//            sleep(100);
//
//            //wrist
//            wrist.setPosition(0.27);
//            sleep(1000);
//            slideOut.setPosition(0.02);
//            sleep(1000);
//            //claw
//            claw.setPosition(0.27);
//            sleep(1000);
//
//            // slide in
//            slideOut.setPosition(0.35);
//            // wrist
//            wrist.setPosition(0.2);
//            sleep(1500);
//            // slide down
//            slideOne.setPower(-1);
//            sleep(1300);
//            slideOne.setPower(0);
//            // stafe right fl, -bl,-fr,br
//            // stafe Left -fl, bl,fr,-br
//            //strafe right
//
//
//
//            //turn L
//            frontLeft.setPower(-gear);
//            frontRight.setPower(-gear);
//            backLeft.setPower(-gear);
//            backRight.setPower(-gear);
//            sleep(800);
//            frontLeft.setPower(geardead);
//            frontRight.setPower(geardead);
//            backLeft.setPower(geardead);
//            backRight.setPower(geardead);
//            sleep(500);
//
//
//            // forward
//            frontLeft.setPower(-gear);
//            frontRight.setPower(gear);
//            backLeft.setPower(-gear);
//            backRight.setPower(gear);
//            sleep(1400);
//            frontLeft.setPower(geardead);
//            frontRight.setPower(geardead);
//            backLeft.setPower(geardead);
//            backRight.setPower(geardead);
//            sleep(500);
//            // turn L
//            frontLeft.setPower(-gear);
//            frontRight.setPower(-gear);
//            backLeft.setPower(-gear);
//            backRight.setPower(-gear);
//            sleep(600);
//            frontLeft.setPower(geardead);
//            frontRight.setPower(geardead);
//            backLeft.setPower(geardead);
//            backRight.setPower(geardead);
//            sleep(500);
//            // forward
//            frontLeft.setPower(-gear);
//            frontRight.setPower(gear);
//            backLeft.setPower(-gear);
//            backRight.setPower(gear);
//            sleep(200);
//            frontLeft.setPower(geardead);
//            frontRight.setPower(geardead);
//            backLeft.setPower(geardead);
//            backRight.setPower(geardead);
//            sleep(500);
//            // slide up
//            slideOne.setPower(1);
//            sleep(550);
//            slideOne.setPower(0.05);
//            sleep(400);
//
//            //wrist
//            wrist.setPosition(0.3);
//            sleep(2000);
//
//            scope.setPosition(1);
//            sleep(30000);
//
//
//
//
//
//
//        }
//    }
//}
