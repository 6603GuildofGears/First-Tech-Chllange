//package org.firstinspires.ftc.teamcode.ftc2024_2025.Auto;
//
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//
//import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
//import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
//import org.firstinspires.ftc.robotcore.external.navigation.Pose2D;
//import org.firstinspires.ftc.teamcode.GoBildaPinpointDriver;
//import static org.firstinspires.ftc.teamcode.ftc2024_2025.Auto.robot24_25Auto.*;
//
//@Disabled
//public class AutoMovement{
//
//    public double errorTolerance = 0.1;
//
//    public GoBildaPinpointDriver odo;
//
//    private LinearOpMode opMode;
//
//
//    public AutoMovement(LinearOpMode opMode){
//        this.opMode = opMode;
//        odo = opMode.hardwareMap.get(GoBildaPinpointDriver.class,"odo");
//        odo.setOffsets(-155.575, 88.9); // cneter of pod to center of robot
//        odo.setEncoderResolution(GoBildaPinpointDriver.GoBildaOdometryPods.goBILDA_SWINGARM_POD);
//        odo.setEncoderDirections(GoBildaPinpointDriver.EncoderDirection.FORWARD, GoBildaPinpointDriver.EncoderDirection.FORWARD);
//
//        resetOdo((LinearOpMode)opMode);
//        ((LinearOpMode)opMode).sleep(250);
//    }
//
//    public void resetOdo(LinearOpMode opMode){
//        odo.resetPosAndIMU();
//        odo.setPosition(new Pose2D(DistanceUnit.INCH, 0, 0, AngleUnit.DEGREES, 180));
//        this.opMode.sleep(350);
//    }
//
//    public double getY(){
//        return odo.getPosition().getY(DistanceUnit.INCH);
//    }
//
//    public double getX(){
//        return odo.getPosition().getX(DistanceUnit.INCH);
//    }
//
//    public void forward(double dist){
//        odo.update();
//
//        double startpos = getX();
//        double distanceToGo = dist;
//        while (Math.abs(distanceToGo) > (this.errorTolerance + 0.13) && opMode.opModeIsActive()) {
//            odo.update();
//
//            distanceToGo = dist - (getX() - startpos);
//            double power = powerCurving(distanceToGo);
//            robot24_25Auto.SetPower(power, power, power, power);
//
//
//
//        }
//    }
//
//
//    public void forward2(double dist){
//        odo.update();
//
//        double startpos = convertTicksToInch(odo.getEncoderX());
//        double distanceToGo = dist;
//        while (Math.abs(distanceToGo) > (this.errorTolerance + 0.13) && opMode.opModeIsActive()) {
//            odo.update();
//
//            distanceToGo = dist - (convertTicksToInch(odo.getEncoderX()) - startpos);
//            double power = powerCurving(distanceToGo);
//            robot24_25Auto.SetPower(power, power, power, power);
//            opMode.telemetry.addData("Pos,", distanceToGo);
//            opMode.telemetry.update();
//
//        }
//    }
//
//    public double convertTicksToInch(double ticks){
//        return (ticks / 2048) * (157/25.4);
//    }
//
//    public void strafe(double dist){
//        odo.update();
//        double startpos = convertTicksToInch(odo.getEncoderY());
//        double distanceToGo = dist;
//        while (Math.abs(distanceToGo) > (this.errorTolerance + 0.13) && opMode.opModeIsActive()) {
//            odo.update();
//
//            distanceToGo = dist - (convertTicksToInch(odo.getEncoderY()) - startpos);
//            double power = powerCurvingstrafe(distanceToGo);
//            robot24_25Auto.SetPower(power, -power, -power, power);
//
//        }
//    }
//    // stafe right fl, -bl,-fr,br
//    // stafe Left -fl, bl,fr,-br
//    public void goToHeading(double degrees){
//        odo.update();
//
//        if(degrees < 0) {
//            degrees = (360 + (degrees % -360));
//        }else{
//            degrees = degrees % 360;
//        }
//        double currentHeading = getHeading();
//        double angleTogo = degrees - currentHeading;
//        while(opMode.opModeIsActive() && Math.abs(angleTogo) > .15){
//            odo.update();
//            currentHeading =  getHeading();
//
//            angleTogo = degrees - currentHeading;
//
//            if(Math.abs(angleTogo) > 180){
//                if(currentHeading < 180){
//                    angleTogo = -((currentHeading) + (360 - degrees));
//                }else{
//                    angleTogo = (degrees + (360 - currentHeading));
//                }
//            }
//
//            double power =  powerCurvingTurn(angleTogo);
//
//            robot24_25Auto.SetPower(-power, -power, power, power);
//
//
//
//            opMode.telemetry.addData("Current Heading", currentHeading);
//            opMode.telemetry.addData("Angle To go", angleTogo);
//            opMode.telemetry.update();
//
//        }
//        robot24_25Auto.SetPower(0, 0, 0, 0);
//        opMode.sleep(150);
//    }
//
//    public double getHeading(){
//        odo.update();
//        //used to be 180 degrees
//        return odo.getPosition().getHeading(AngleUnit.DEGREES) + 180;
//    }
//
//
//    public static double powerCurvingTurn(double angleToGo){
//        double slope = 90;
//        double max = 1;
//        double min = .2;
//        if(angleToGo > 0) {
//            return (angleToGo / slope < min) ? min : Math.min(angleToGo / slope, max);
//        }else{
//            return (angleToGo / slope > -min) ? -min : Math.min(angleToGo / slope, max);
//        }
//    }
//
//
//
//
//    public double powerCurvingstrafe(double error) {
//        double slope = 48; // "speed" devide
//        double max = .75;
//        double min = .25;
//        if (error > 0) {
//            return Math.max(Math.min(error / slope, max), min);
//        } else {
//            return Math.min(Math.max(error / slope, -max), -min);
//        }
//    }
//
//    public double powerCurving(double error) {
//        double slope = 36; // "speed" devide
//        double max = .5;
//        double min = .2;
//        if (error > 0) {
//            return Math.max(Math.min(error / slope, max), min);
//        } else {
//            return Math.min(Math.max(error / slope, -max), -min);
//        }
//    }
//
//    public double powerCurvingOmni(double error) {
//        double slope = 24; // "speed" devide
//        double max = 1;
//        double min = .08;
//        if (error > 0) {
//            return Math.max(Math.min(error / slope, max), min);
//        } else {
//            return Math.min(Math.max(error / slope, -max), -min);
//        }
//    }
//
//
//
//    /*public void goToPoint(double targetX, double targetY, double degrees) {
//        // try switching from atan2 to atan
//        //Get X and Y Distance and Total Distance
//        odo.update();
//
//        double rotation = getHeading();
//        double targetXDist = targetX - getX();
//        double targetYDist= targetY - getY();
//        double newY = -targetYDist * Math.cos(rotation) - -targetXDist * Math.sin(rotation); //Angle Difference Identity
//        double newX = targetXDist * Math.cos(rotation) - -targetYDist * Math.sin(rotation); //Trigonometry
//
//        //Get Heading
//        degrees = (degrees >= 0) ? degrees % 360: (360 + (degrees % -360));
//        double currentHeading = getHeading();
//        double totalangleTogo = degrees - currentHeading;
//        double startheading = getHeading();
//        double angleTogo = totalangleTogo;
//        currentHeading =  getHeading();
//        angleTogo = degrees - currentHeading;
//        if(Math.abs(angleTogo) > 180){
//            if(currentHeading < 180){
//                angleTogo = ((180-currentHeading) + degrees);
//            }else{
//                angleTogo = (degrees + (360 - currentHeading));
//            }
//        }
//        double angleslope = angleTogo /Math.hypot(targetYDist,targetXDist);
//        double powerTurn = powerCurvingTurn(angleTogo);
//
//        double newdegree;
//
//
//
//
//        double totalDistance = Math.hypot(newX, newY);
//        double robotAngle = Math.atan2(targetYDist, targetXDist) + Math.PI/4 + Math.toRadians(angleTogo);
//        double rightX = powerCurvingTurn(angleTogo);
//        double power = powerCurvingOmni(totalDistance);
//
//        double v1 = power * Math.cos(robotAngle) + rightX; //lf
//        double v2 = power * Math.sin(robotAngle) - rightX; //rf
//        double v3 = power * Math.sin(robotAngle) + rightX; //lb
//        double v4 = power * Math.cos(robotAngle) - rightX; //rb
//
//        Robot.drive(v2,v4,v3,v1);
//
//        double angleToGo2 = angleTogo;
//        while ((Math.abs(angleToGo2) > 5 || Math.abs(targetYDist) > this.errorTolerance + .025 || Math.abs(targetXDist) > this.errorTolerance + .025 ) && opMode.opModeIsActive()) {
//            odo.update();
//
//            rotation = getHeading();
//            targetXDist = targetX - getX();
//            targetYDist= targetY - getY();
//            newY = -targetYDist * Math.cos(rotation) - -targetXDist * Math.sin(rotation); //Angle Difference Identity
//            newX = targetXDist * Math.cos(rotation) - -targetYDist * Math.sin(rotation); //Trigonometry
//
//            //Get Heading
//            angleToGo2 = degrees - currentHeading;
//            if (Math.abs(angleToGo2) > 180) {
//                if (currentHeading < 180) {
//                    angleToGo2 = ((180 - currentHeading) + degrees);
//                } else {
//                    angleToGo2 = (degrees + (360 - currentHeading));
//                }
//            }
//
//
//            newdegree = startheading + (angleslope * totalDistance);
//            angleTogo = newdegree - currentHeading;
//
//            if (Math.abs(angleTogo) > 180) {
//                if (currentHeading < 180) {
//                    angleTogo = ((180 - currentHeading) + newdegree);
//                } else {
//                    angleTogo = (newdegree + (360 - currentHeading));
//                }
//            }
//
//            totalDistance = Math.hypot(newX, newY);
//            robotAngle = Math.atan2(targetYDist, targetXDist) + Math.PI/4 + Math.toRadians(angleTogo);
//            rightX = powerCurvingTurn(angleTogo);
//            power = powerCurvingOmni(totalDistance);
//
//            v1 = power * Math.cos(robotAngle) + rightX; //lf
//            v2 = power * Math.sin(robotAngle) - rightX; //rf
//            v3 = power * Math.sin(robotAngle) + rightX; //lb
//            v4 = power * Math.cos(robotAngle) - rightX; //rb
//
//            Robot.drive(v2,v4,v3,v1);
//
//
//
//            opMode.telemetry.addData("get x", getX());
//            opMode.telemetry.addData("get y", getY());
//
//            opMode.telemetry.addData("LF", v1);
//            opMode.telemetry.addData("RF", v2);
//            opMode.telemetry.addData("LB", v3);
//            opMode.telemetry.addData("RB", v4);
//            opMode.telemetry.update();
//        }
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
//
//
//
//
//        Robot.drive(0,0,0,0);
//
//        opMode.sleep(350);
//    }
//
//     */
//
//    public void goToPointConstantHeading(double targetX, double targetY){
//        // try switching from atan2 to atan
//        //Get X and Y Distance and Total Distance
//        odo.update();
//        double targetYDistance = targetY - getY();
//        double targetXDistance = targetX - getX();
//        double totalDistance = Math.hypot(targetYDistance, targetXDistance);
//        double angle = Math.atan2(targetYDistance, targetXDistance);
//
//        //Get Heading
//        double power;
//
//        opMode.telemetry.addData("Get X: " , targetXDistance);
//        opMode.telemetry.addData("Get Y: " , targetYDistance);
//        opMode.telemetry.update();
//
//        opMode.sleep(250);
//
//        double v1; //lf // was cos
//        double v2; //rf // was sin
//        double v3; //lb // was sin
//        double v4; //rb // was
//
//        while((Math.abs(targetXDistance) > this.errorTolerance || Math.abs(targetYDistance) > this.errorTolerance) && opMode.opModeIsActive()){
//            odo.update();
//
//
//            targetYDistance = (targetY - odo.getPosition().getY(DistanceUnit.INCH));
//            targetXDistance = (targetX - odo.getPosition().getX(DistanceUnit.INCH));
//            totalDistance = Math.hypot(targetYDistance, targetXDistance);
//            angle = Math.atan2(targetYDistance, targetXDistance) + Math.PI/4  + Math.toRadians(getHeading());
//
//
//            power = powerCurvingOmni(-totalDistance);
//
//
//            v1 = power * Math.sin(angle); //lf // was cos
//            v2 = power * Math.cos(angle); //rf // was sin
//            v3 = power * Math.cos(angle); //lb // was sin
//            v4 = power * Math.sin(angle); //rb // was
//
//
//            if(Math.abs(v1) > .01 && Math.abs(v1) < .15) v1 = Math.abs(v1)/v1 * .2;
//            if(Math.abs(v2) > .01 && Math.abs(v2) < .15) v2 = Math.abs(v1)/v1 * .2;
//            if(Math.abs(v3) > .01 && Math.abs(v3) < .15) v3 = Math.abs(v1)/v1 * .2;
//            if(Math.abs(v4) > .01 && Math.abs(v4) < .15) v4 = Math.abs(v1)/v1 * .2;
//
//            if (v1 > 0 && v4 > 0 && v2 < 0 && v3 < 0){
//                v1 += .15;
//                v4 += .15;
//            } else if (v1 < 0 && v4 < 0 && v2 > 0 && v3 > 0){
//                v2 += .15;
//                v3 += .15;
//            }
//            opMode.telemetry.addData("Get X: " , targetXDistance);
//            opMode.telemetry.addData("Get Y: " , targetYDistance);
//            opMode.telemetry.update();
//
//            robot24_25Auto.SetPower(v1,v3,v2,v4);
//
//
//
//        }
//
//
//
//
//        robot24_25Auto.SetPower(0,0,0,0);
//
//        opMode.sleep(150);
//
//
//
//    }
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
//
//    }
//
