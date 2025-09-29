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
//@Disabled
//@Autonomous(name = "Bucket2")
//public class Bucket2_Auto extends LinearOpMode {
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        robot24_25Auto.initMotors(this);
//        AutoMovement ad = new AutoMovement(this);
//        slideOne.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        waitForStart();
//
//
//        ad.resetOdo(this);
//        wrist.setPosition(0.085);
//        claw.setPosition(0);
//        ad.goToHeading(180);
//        this.sleep(1000);
//
//        //forward
//        ad.forward2(0.5);
//        this.sleep(1000);
//        ad.goToHeading(180);
//
//        //slide
//        slideOne.setTargetPosition(4000);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(1);
//        this.sleep(3000);
//        slideOne.setPower(0.05);
//        telemetry.addData("SlidePose: " , slideOne.getCurrentPosition());
//        telemetry.update();
//        //wrist
//        wrist.setPosition(0.27);
//        this.sleep(2000);
//
//        //claw
//        claw.setPosition(0.3);
//        this.sleep(500);
//        // slide in
//
//        //wirst
//        wrist.setPosition(0.085);
//        this.sleep(500);
//        // slide down
//        slideOne.setTargetPosition(0);
//        slideOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        slideOne.setPower(1);
//        this.sleep(1000);
//        slideOne.setPower(0);
//        this.sleep(500);
//        ad.forward2(-0.2325);
//        this.sleep(1000);
//
//        ad.goToHeading(180);
//        // turn
//        ad.goToHeading(90);
//        this.sleep(500);
//
//        // forward
//        ad.forward2(48);
//        ad.goToHeading(0);
//        this.sleep(1000);
//        //forward
//       ad.forward2(5);
//        this.sleep(500);
//        // arm
//
//        this.sleep(1000);
//        wrist.setPosition(0.16);
//        this.sleep(30000);
//
//
//
//
//
//
//
//    }
//}
