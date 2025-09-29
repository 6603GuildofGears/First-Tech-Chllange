//package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.old;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25Auto.*;
//@Disabled
//@Autonomous(name = "slide test")
//public class slide_encoders extends LinearOpMode{
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        initMotors(this);
//
//    // this  down
//        slideOne.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        waitForStart();
//        wrist.setPosition(0.1);
//        sleep(1000);
//
//        sleep(1000);
//        slideOne.setTargetPosition(-4000);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(1);
//        sleep(1000);
//        telemetry.addData("SlidePose: " , slideOne.getCurrentPosition());
//        telemetry.update();
//
//        wrist.setPosition(0.2);
//
//        sleep(300000);
//
//
//
//        // forward
//        }
//    }
//
//
//
//
