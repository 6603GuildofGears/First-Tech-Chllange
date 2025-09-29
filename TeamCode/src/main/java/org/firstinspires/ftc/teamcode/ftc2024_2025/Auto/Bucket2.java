package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto;

import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.bucket;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.extendLeft;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.extendRight;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.intake;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.slideLeft;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.slideRight;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.wrist;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous(name = "Bucket 2")
public class Bucket2 extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        robotv3_2024_2025Auto.initMotors(this);
        AutoMovement_V2 ad = new AutoMovement_V2(this);

        ad.resetOdo(this);
        this.sleep(500);
        ad.odo.recalibrateIMU();
        bucket.setPosition(0.8);
        this.sleep(500);
        wrist.setPosition(0.061);


        slideLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        slideRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        waitForStart();

        telemetry.addData("slidel",slideLeft.getCurrentPosition());
        telemetry.addData("slideR",slideRight.getCurrentPosition());
        telemetry.update();
        this.sleep(1000);


        ad.odo.update();
        ad.goToHeading(180);
        this.sleep(500);
        extendLeft.setPower(-0.1);
        extendRight.setPower(-0.1);
        slideLeft.setTargetPosition(400);
        slideRight.setTargetPosition(400);
        slideLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideLeft.setPower(1);
        slideRight.setPower(1);
        this.sleep(500);
        slideLeft.setPower(0.05);
        slideRight.setPower(0.05);
        bucket.setPosition(0.7);
        this.sleep(500);
        ad.goToHeading(180);
        ad.forward2(-15);
        telemetry.addData("Get X: " , ad.odo.getPosition().getX(DistanceUnit.INCH));
        telemetry.addData("Get Y: " ,ad.odo.getPosition().getX(DistanceUnit.INCH));
        telemetry.update();

        this.sleep(1000);
        ad.goToHeading(320);
        this.sleep(1000);


        slideLeft.setTargetPosition(4250);
        slideRight.setTargetPosition(4250);
        slideLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideLeft.setPower(1);
        slideRight.setPower(1);
        this.sleep(3000);
        slideLeft.setPower(0.05);
        slideRight.setPower(0.05);
        telemetry.addData("SlidePose: " , slideLeft.getCurrentPosition());
        telemetry.addData("SlidePose: " , slideRight.getCurrentPosition());
        telemetry.update();
        ad.forward2(-13);
        this.sleep(2500);
        //down
        bucket.setPosition(1);
        this.sleep(500);
        bucket.setPosition(0.7);
        this.sleep(500);

        //up
        ad.forward2(2);
        slideLeft.setPower(-1);
        slideRight.setPower(-1);
        this.sleep(1700);
         ad.goToHeading(350);
         this.sleep(500);
        wrist.setPosition(0);
        this.sleep(100);
        extendLeft.setPower(0.75);
         extendRight.setPower(0.75);
         sleep(500);
         extendLeft.setPower(0);
         extendRight.setPower(0);
         intake.setPower(-1);
         this.sleep(1000);
         intake.setPower(0);

        extendLeft.setPower(-1);
        extendRight.setPower(-1);
        sleep(400);
        extendLeft.setPower(0);
        extendRight.setPower(0);
        ad.goToHeading(320);
        wrist.setPosition(0.061);
        this.sleep(500);
        intake.setPower(1);
        this.sleep(1000);

        slideLeft.setTargetPosition(4250);
        slideRight.setTargetPosition(4250);
        slideLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideLeft.setPower(1);
        slideRight.setPower(1);
        this.sleep(3000);
        slideLeft.setPower(0.05);
        slideRight.setPower(0.05);
        telemetry.addData("SlidePose: " , slideLeft.getCurrentPosition());
        telemetry.addData("SlidePose: " , slideRight.getCurrentPosition());
        telemetry.update();
        this.sleep(2500);
        ad.forward2(-3);

        //down
        bucket.setPosition(1);
        this.sleep(500);
        bucket.setPosition(0.7);
        this.sleep(500);









    }
}


