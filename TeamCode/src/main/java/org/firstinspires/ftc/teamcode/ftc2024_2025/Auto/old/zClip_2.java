//package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto;
//
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25Auto.claw;
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25Auto.slideOne;
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25Auto.wrist;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
//@Disabled
//@Autonomous(name = "Clip 2")
//public class Clip_2 extends LinearOpMode {
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        robot24_25Auto.initMotors(this);
//        AutoMovement ad = new AutoMovement(this);
//        slideOne.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        claw.setPosition(0);
//
//        waitForStart();
//        telemetry.addData("Get X: ", ad.odo.getPosition().getX(DistanceUnit.INCH));
//        telemetry.addData("Get Y: ", ad.odo.getPosition().getX(DistanceUnit.INCH));
//        telemetry.update();
//        this.sleep(500);
//
//
//        ad.resetOdo(this);
//        wrist.setPosition(0.085);
//        claw.setPosition(0);
//
//        ad.goToHeading(180);
//        this.sleep(500);
//        wrist.setPosition(0.29);
//        this.sleep(500);
//        slideOne.setTargetPosition(2865);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(1);
//        this.sleep(1000);
//        slideOne.setPower(0.12);
//        this.sleep(1000);
//        // forward
//        ad.forward(9);
//
//        this.sleep(1000);
//        ad.goToHeading(180);
//        //slide
//
//
//
//        this.sleep(1000);
//        slideOne.setTargetPosition(2890);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(0.65);
//        this.sleep(1000);
//
//
//
//        claw.setPosition(0.5);
//
//
//        ad.forward(-0.25);
//        slideOne.setPower(-1);
//        sleep(1500);
//        slideOne.setPower(0);
//
//        this.sleep(1000);
//
//        wrist.setPosition(0.257);
//        ad.goToHeading(90);
//        this.sleep(1000);
//        ad.forward2(28.25);
//        this.sleep(500);
//        ad.goToHeading(90);
//        ad.strafe(6.05);
//        this.sleep(500);
//        ad.goToHeading(90);
//
//
//        this.sleep(1500);
//        claw.setPosition(0);
//        this.sleep(500);
//        ad.forward2(0.2);
//        wrist.setPosition(0.32);
//        this.sleep(500);
//        ad.forward2(-26);
//        this.sleep(500);
//
//        wrist.setPosition(0.29);
//
//        slideOne.setTargetPosition(2860);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(1);
//        this.sleep(1000);
//        slideOne.setPower(0.12);
//        this.sleep(1000);
//
//        ad.goToHeading(180);
//        this.sleep(500);
//        // forward
//        ad.forward(9);
//
//        this.sleep(1000);
//        ad.goToHeading(180);
//        //slide
//
//
//
//        this.sleep(1000);
//        slideOne.setTargetPosition(2890);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(0.65);
//        this.sleep(1000);
//
//
//
//        claw.setPosition(0.5);
//
//
//        ad.forward(-0.25);
//        slideOne.setPower(-1);
//        sleep(1500);
//        slideOne.setPower(0);
//
//
//
//
//        this.sleep(10000);
//    }
//}
