package org.firstinspires.ftc.teamcode.ftc2025_2026;
import com.qualcomm.hardware.dfrobot.HuskyLens;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class HuskyLens_Pipe {

    //name cam
    public HuskyLens cam1;

    LinearOpMode opMode;

    //set it as a the Husky Lens
    public HuskyLens_Pipe(LinearOpMode opMode) {
        this.opMode = opMode;

        cam1 = opMode.hardwareMap.get(HuskyLens.class, "cam1");


    }

    // gets blocks from husky lens
    public HuskyLens.Block[] getBlocks() {
        return cam1.blocks();


    }

    //get pos
    public int[][] getPoses(){
        HuskyLens.Block[] blocks = getBlocks();
        if(blocks.length>0){
            int[][] poses =new int[blocks.length][3];
            for (int i =0; i< blocks.length; i++){
                poses[i][0]= blocks[i].x;
                poses[i][1]= blocks[i].y;
                poses[i][2] =blocks[i].id;

            }
            return poses;
        }
        else {
            return new int[1][1];
        }

    }

    //key word call
    public Enum APRILTAG, COLOR, OBJECTTRACK;

    // change mode
    public void changeALgo(Enum algo){
        if(algo == APRILTAG){
            cam1.selectAlgorithm(HuskyLens.Algorithm.TAG_RECOGNITION);
        }
       else if(algo == COLOR){
            cam1.selectAlgorithm(HuskyLens.Algorithm.COLOR_RECOGNITION);
        }
        else if(algo == OBJECTTRACK){
            cam1.selectAlgorithm(HuskyLens.Algorithm.OBJECT_TRACKING);
        }

    }





}