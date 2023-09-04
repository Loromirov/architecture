package ModelElements;

import java.awt.*;

public class Camera {
    public Point3D location;
    public Angle3D angle;
    
    public void position(Angle3D angle){
        this.angle = angle;
    }
    public void move(Point3D point){
        this.location = point;
    }
}
