//package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.zrobot24_25Auto.*;
//
//@Disabled
//
//@Autonomous(name = "park")
//public class park extends LinearOpMode {
//    @Override
//    public void runOpMode() throws InterruptedException {
//        initMotors(this);
//        AutoMovement ad = new AutoMovement(this);
//        waitForStart();
//        while (opModeIsActive()) {
//            //claw
//            ad.resetOdo(this);
//
//            claw.setPosition(0);
//            wrist.setPosition(0.085);
//            sleep(500);
//            ad.goToHeading(180);
//            //forward
//            this.sleep(1000);
//            ad.goToPointConstantHeading(24,0);
//            this.sleep(1000);
//
//            //wrist
//            wrist.setPosition(0.34);
//            sleep(30000);
//
//
//        }
//    }
//}
