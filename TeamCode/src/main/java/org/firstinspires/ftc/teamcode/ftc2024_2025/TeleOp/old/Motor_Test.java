/*package org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.ftc2024_2025.TeleOp.robot24_25.*;
@Disabled
@TeleOp(name = "Motor test")
public class Motor_Test extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        initMotors(this);
        boolean RB2prev = false;
        int clawstate = 0;
        int wriststate = 0;
        int poswrist = 0;
        boolean LB2prev = false;
        double gear = 0.5;
        double gear2 = 0.25;

        robot24_25.initMotors(this);
        waitForStart();
        while (opModeIsActive()) {
            boolean a1 = gamepad1.a;
            boolean b1 = gamepad1.b;
            boolean x1 = gamepad1.x;
            boolean y1 = gamepad1.y;


            double lfPower = (a1) ? 0.5:0;
            double rfPower = (b1) ? 0.5:0;
            double lbPower = (x1) ? 0.5:0;
            double rbPower = (y1) ? 0.5:0;
            robot24_25.SetPower(lfPower,rfPower,lbPower,rbPower);


        }
    }
}


 */