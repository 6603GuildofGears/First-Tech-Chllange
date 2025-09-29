package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.AutoMovement_V2;

import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.bucket;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.claw;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.extendLeft;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.extendRight;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.intake;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.slideLeft;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.slideRight;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.wrist;

//@Disabled
@Autonomous(name = "Clip 1")
public class clip1 extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        robotv3_2024_2025Auto.initMotors(this);
        AutoMovement_V2 ad = new AutoMovement_V2(this);

        ad.resetOdo(this);
        this.sleep(500);
        ad.odo.recalibrateIMU();
        wrist.setPosition(0.05);

        bucket.setPosition(0.7);
        claw.setPosition(0.22);
        slideLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        slideRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        waitForStart();
        extendLeft.setPower(-0.05);
        extendRight.setPower(-0.05);
        telemetry.addData("Get X: " , ad.odo.getPosition().getX(DistanceUnit.INCH));
        telemetry.addData("Get Y: " ,ad.odo.getPosition().getX(DistanceUnit.INCH));
        telemetry.update();
        this.sleep(1000);


        ad.odo.update();
        ad.goToHeading(180);
        this.sleep(500);
        this.sleep(1000);
        claw.setPosition(0.22);
        slideLeft.setTargetPosition(4000);
        slideRight.setTargetPosition(4000);
        slideLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideLeft.setPower(1);
        slideRight.setPower(1);
        telemetry.addData("SlidePose: " , slideLeft.getCurrentPosition());
        telemetry.addData("SlidePose: " , slideRight.getCurrentPosition());
        telemetry.update();
        this.sleep(1500);
        slideLeft.setPower(0.05);
        slideRight.setPower(0.05);

        //down
        ad.forward2(-22);
        this.sleep(1000);
        ad.goToHeading(180);

        this.sleep(1000);
        slideLeft.setTargetPosition(3500);
        slideRight.setTargetPosition(3500);
        slideLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideLeft.setPower(-1);
        slideRight.setPower(-1);
        this.sleep(500);
        slideLeft.setPower(0);
        slideRight.setPower(0);
        //up
        this.sleep(750);
        claw.setPosition(0);
        this.sleep(1000);
        ad.forward2(8);
        this.sleep(500);

        ad.goToHeading(90);
        this.sleep(500);
        ad.forward2(-36);

        this.sleep(10000);






    }
}


