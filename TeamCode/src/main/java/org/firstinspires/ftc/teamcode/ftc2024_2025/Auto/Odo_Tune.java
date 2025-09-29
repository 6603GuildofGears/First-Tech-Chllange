package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.AutoMovement_V2;

import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.bucket;
import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robotv3_2024_2025Auto.wrist;
@Disabled
@Autonomous(name = "OdoTune")
public class Odo_Tune extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        robotv3_2024_2025Auto.initMotors(this);
        AutoMovement_V2 ad = new AutoMovement_V2(this);

        ad.resetOdo(this);
        this.sleep(500);
        ad.odo.recalibrateIMU();
        wrist.setPosition(0.061);
        bucket.setPosition(1);
        waitForStart();
        telemetry.addData("Get X: " , ad.odo.getPosition().getX(DistanceUnit.INCH));
        telemetry.addData("Get Y: " ,ad.odo.getPosition().getX(DistanceUnit.INCH));
        telemetry.update();
        this.sleep(1000);


//        for(int i = 0; i <= 360; i += 90){
//            ad.goToHeading(180 + i);
//
//            this.sleep(500);
//        }
        ad.odo.update();
        ad.goToHeading(180);
        this.sleep(500);
//        while (opModeIsActive()){
//            ad.odo.update();
//            telemetry.addData("x", ad.odo.getEncoderX());
//            telemetry.addData("Y", ad.odo.getEncoderY());
//         telemetry.addData("x2", ad.getX());
//         telemetry.addData("Y2", ad.getY());
//         telemetry.update();
//        }
//        ad.forward2(-24);
//        this.sleep(1000);
//        ad.goToHeading(180);
//        this.sleep(1000);
        ad.goToHeading(180);
        this.sleep(500);
        ad.strafe(24);
        this.sleep(1000);
        ad.goToHeading(180);
        this.sleep(1000);






    }
}


