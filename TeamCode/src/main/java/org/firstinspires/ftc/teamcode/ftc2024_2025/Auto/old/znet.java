//package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto;
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.AutoMovement.*;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25Auto.*;
//@Disabled
//
//@Autonomous(name = "net")
//public class net extends LinearOpMode {
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        robot24_25Auto.initMotors(this);
//        AutoMovement ad = new AutoMovement(this);
//        slideOne.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        waitForStart();
//            ad.resetOdo(this);
//
//            wrist.setPosition(0.085);
//            claw.setPosition(0);
//
//            sleep(2000);
//
//            wrist.setPosition(0.34);
//            sleep(1000);
//
//            //claw
//            claw.setPosition(0.27);
//            this.sleep(1000);
//            //turn
//            ad.goToHeading(90);
//            this.sleep(1000);
//            // forward
//
//            ad.forward2(48);
//            sleep(1000);
//
//            //turn
//            ad.goToHeading(0);
//            this.sleep(1000);
//
//
//            //slide
//
//        slideOne.setTargetPosition(-500);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(1);
//        this.sleep(1000);
//
//        slideOne.setPower(0.05);
//
//        //wrist
//        wrist.setPosition(.3);
//
//        this.sleep(10000);
//
//        }
//    }
//
