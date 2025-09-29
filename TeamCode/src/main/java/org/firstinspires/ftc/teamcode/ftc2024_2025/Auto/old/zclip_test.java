//package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto;
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.AutoMovement.*;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25Auto.*;
//
//import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
//@Disabled
//@Autonomous(name = "Cliptest")
//public class clip_test extends LinearOpMode {
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
//        ad.forward(10.75);
//
//        this.sleep(1000);
//        ad.goToHeading(180);
//        this.sleep(1000);
//        //slide
//        slideOne.setTargetPosition(1000);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(1);
//        this.sleep(1000);
//
//        slideOne.setPower(0.05);
//        //wrist
//        wrist.setPosition(0.32);
//        this.sleep(2000);
//
//        ad.forward(10);
//        this.sleep(1000);
//    }
//}