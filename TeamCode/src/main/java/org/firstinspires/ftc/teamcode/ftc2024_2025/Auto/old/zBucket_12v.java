//package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.old;
//
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25Auto.*;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//
//@Disabled
//
//@Autonomous(name = "Bucket_12")
//public class zBucket_12v extends LinearOpMode {
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
//            wrist.setPosition(0.085);
//            sleep(2000);
//            //foward
//
//            //slide up
//            slideOne.setPower(1);
//            sleep(1900);
//            slideOne.setPower(0.5);
//            sleep(100);
//
//            //wrist
//            wrist.setPosition(0.29);
//            sleep(1000);
//            // slide out
//            slideOut.setPosition(0.15);
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
//            sleep(1000);
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
//            sleep(1800);
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
//            sleep(800);
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
//            sleep(700);
//            // slide up
//            slideOne.setPower(1);
//            sleep(350);
//            slideOne.setPower(0.05);
//            sleep(500);
//
//            //  slide out
//            slideOut.setPosition(0.3);
//            //wrist
//            wrist.setPosition(0.32);
//
//            sleep(1000);
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
