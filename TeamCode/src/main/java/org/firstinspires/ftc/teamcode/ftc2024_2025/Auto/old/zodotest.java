//package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.old;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//
//import org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.AutoMovement;
//
//@Disabled
//@Autonomous(name = "odotest")
//public class zodotest extends LinearOpMode {
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        robot24_25Auto.initMotors(this);
//        AutoMovement ad = new AutoMovement(this);
//
//        ad.resetOdo(this);
//
//        waitForStart();
//
//        ad.goToHeading(180);
//        this.sleep(1000);
//        ad.forward(12);
//        this.sleep(1500);
//        ad.goToHeading(0);
//        this.sleep(1000);
//        ad.goToHeading(180);
//        ad.forward(-12);
//
//
//    }
//}
