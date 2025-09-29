//package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.old;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25Auto.*;
//import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
//import org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.AutoMovement;
//
//@Disabled
//
//@Autonomous(name = "Clip_1")
//public class zclip_1 extends LinearOpMode {
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        robot24_25Auto.initMotors(this);
//        AutoMovement ad = new AutoMovement(this);
//        slideOne.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        waitForStart();
//        telemetry.addData("Get X: ", ad.odo.getPosition().getX(DistanceUnit.INCH));
//        telemetry.addData("Get Y: ", ad.odo.getPosition().getX(DistanceUnit.INCH));
//        telemetry.update();
//        this.sleep(1000);
//
//
//        ad.resetOdo(this);
//        wrist.setPosition(0.085);
//        claw.setPosition(0);
//        ad.goToHeading(180);
//        this.sleep(1000);
//        // forward
//        ad.forward(10);
//
//        this.sleep(1000);
//        ad.goToHeading(180);
//        this.sleep(1000);
//        //slide
//        slideOne.setTargetPosition(1050);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(1);
//        this.sleep(1000);
//
//        slideOne.setPower(0.05);
//        //wrist
//        wrist.setPosition(0.28);
//        this.sleep(2000);
//        slideOne.setTargetPosition(800);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(.15);
//        this.sleep(1000);
//
//        ad.forward(4);
//        this.sleep(1000);
//
//        claw.setPosition(0.5);
//
//
///*
//
//        //wrist
//        wrist.setPosition(0.085);
//        this.sleep(1000);
//        //slide
//
//
//
//        //strafe r
//        ad.goToHeading(90);
//        this.sleep(500);
//        ad.forward2(48);
//        ad.goToHeading(180);
//
//        this.sleep(500);
//
//        //back up
//        ad.forward2(-7);
//
//        slideOne.setTargetPosition(0);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(1);
//        this.sleep(1000);
//        wrist.setPosition(0.34);
//
//
//      */
//        this.sleep(10000);
//    }
//}
