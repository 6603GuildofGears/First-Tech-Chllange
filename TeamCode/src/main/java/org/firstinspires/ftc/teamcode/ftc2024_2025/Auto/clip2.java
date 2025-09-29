package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.AutoMovement_V2;

import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.bucket;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.claw;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.intake;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.slideLeft;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.slideRight;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.wrist;

//@Disabled
@Autonomous(name = "Clip 2")
public class clip2 extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        robotv3_2024_2025Auto.initMotors(this);
        AutoMovement_V2 ad = new AutoMovement_V2(this);

        ad.resetOdo(this);
        this.sleep(500);
        ad.odo.recalibrateIMU();
        wrist.setPosition(0.61);

        bucket.setPosition(0.7);
        claw.setPosition(0.22);
        slideLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        slideRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        waitForStart();
        telemetry.addData("Get X: ", ad.odo.getPosition().getX(DistanceUnit.INCH));
        telemetry.addData("Get Y: ", ad.odo.getPosition().getX(DistanceUnit.INCH));
        telemetry.update();
        this.sleep(1000);


        ad.odo.update();
        ad.goToHeading(180);
        this.sleep(500);

        slideLeft.setTargetPosition(2000);
        slideRight.setTargetPosition(2000);
        slideLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideLeft.setPower(1);
        slideRight.setPower(1);
        this.sleep(500);
        slideLeft.setPower(0.5);
        slideRight.setPower(0.5);
        ad.forward2(-9);
        ad.goToHeading(180);

        this.sleep(1000);
        slideLeft.setPower(0.05);
        slideRight.setPower(0.05);
        telemetry.addData("SlidePose: " , slideLeft.getCurrentPosition());
        telemetry.addData("SlidePose: " , slideRight.getCurrentPosition());
        telemetry.update();
        //down

        this.sleep(1000);
        slideLeft.setTargetPosition(1500);
        slideRight.setTargetPosition(1500);
        slideLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideLeft.setPower(0.5);
        slideRight.setPower(0.5);
        //up
        this.sleep(500);
        claw.setPosition(0);
        this.sleep(100);
        this.sleep(1000);
        slideLeft.setTargetPosition(0);
        slideRight.setTargetPosition(0);
        slideLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideLeft.setPower(0.5);
        slideRight.setPower(0.5);
        this.sleep(500);
        ad.forward2(5);
        this.sleep(500);
        ad.goToHeading(90);
        this.sleep(500);

    }
}
