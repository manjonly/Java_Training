package training.ideas.java.angles;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 8/18/2014.
 */
public class typeOfAngleTest {
    @Test
    public void givenRightAngleTriangleTest(){
        typeOfAngle myAngleClass = new typeOfAngle();
        int angle1=40;
        int angle2=90;
        int angle3=50;
        String triangleType="RightAngledTriangle";
        Assert.assertEquals(triangleType, myAngleClass.findTypeOfAngle(angle1, angle2, angle3));
    }

    @Test
    public void givenRightAngleTriangleTest2(){
        typeOfAngle myAngleClass = new typeOfAngle();
        int angle1=63;
        int angle2=90;
        int angle3=11;
        String triangleType="NotATriangle";
        Assert.assertEquals(triangleType, myAngleClass.findTypeOfAngle(angle1, angle2, angle3));
    }

    @Test
    public void givenRightAngleTriangleTest3(){
        typeOfAngle myAngleClass = new typeOfAngle();
        int angle1=56;
        int angle2=35;
        int angle3=45;
        String triangleType="NotATriangle";
        Assert.assertEquals(triangleType, myAngleClass.findTypeOfAngle(angle1, angle2, angle3));
    }

    @Test
    public void givenEquilateralTriangleTest3(){
        typeOfAngle myAngleClass = new typeOfAngle();
        int angle1=60;
        int angle2=60;
        int angle3=60;
        String triangleType="EquilateralTriangle";
        Assert.assertEquals(triangleType, myAngleClass.findTypeOfAngle(angle1, angle2, angle3));
    }

    @Test
    public void givenIsoscelesTriangleTest3(){
        typeOfAngle myAngleClass = new typeOfAngle();
        int angle1=10;
        int angle2=10;
        int angle3=160;
        String triangleType="IsoscelesTriangle";
        Assert.assertEquals(triangleType, myAngleClass.findTypeOfAngle(angle1, angle2, angle3));
    }

    @Test
    public void givenNormalTriangleTest3(){
        typeOfAngle myAngleClass = new typeOfAngle();
        int angle1=30;
        int angle2=40;
        int angle3=110;
        String triangleType="NormalTriangle";
        Assert.assertEquals(triangleType, myAngleClass.findTypeOfAngle(angle1, angle2, angle3));
    }
}
