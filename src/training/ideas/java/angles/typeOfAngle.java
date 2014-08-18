package training.ideas.java.angles;

/**
 * Created by idnmao on 8/18/2014.
 */
public class typeOfAngle {
    public String findTypeOfAngle(int angle1, int angle2, int angle3) {
        String thisTriangleIs="";
        int sumofangle=angle1+angle2 +angle3;
        if (sumofangle!=180){
            thisTriangleIs="NotATriangle";
        }else if (angle1==90 || angle2==90 || angle3==90){
            thisTriangleIs="RightAngledTriangle";
        }else if (angle1==angle2 && angle2==angle3){
            thisTriangleIs="EquilateralTriangle";
        }else if (angle1==angle2 || angle2==angle3 || angle1==angle3){
            thisTriangleIs="IsoscelesTriangle";
        }else if ((angle1+angle2 +angle3)==180){
            thisTriangleIs="NormalTriangle";
        }
        return thisTriangleIs;
    }
}
