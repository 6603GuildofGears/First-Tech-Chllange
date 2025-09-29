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
//
//@Autonomous(name = "Clip 1")
//public class clip_1 extends LinearOpMode {
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
//        slideOne.setTargetPosition(2860);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(1);
//        this.sleep(1000);
//        slideOne.setPower(0.12);
//
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
//        slideOne.setTargetPosition(2855);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(0.75);
//        this.sleep(1500);
//
//
//
//        claw.setPosition(0.5);
//
//        ad.forward2(-1);
//        this.sleep(1000);
//        slideOne.setPower(-1);
//        sleep(1550);
//        slideOne.setPower(0);
//        wrist.setPosition(0.085);
//
//
//
//
//
//
//
//
//
//
//        //strafe r
//        ad.goToHeading(90);
//        this.sleep(500);
//        ad.forward2(19);
//        ad.goToHeading(180);
//
//        this.sleep(500);
//
//        ad.forward2(37);
//        this.sleep(500);
//        ad.goToHeading(90);
//        this.sleep(1000);
//        ad.forward2(0.25);
//        this.sleep(1000);
//        ad.goToHeading(180);
//        this.sleep(500);
//        ad.forward2(-48);
//
//
//
//
//
//        this.sleep(10000);
//    }
//}
