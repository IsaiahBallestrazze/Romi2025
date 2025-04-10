package frc.robot.subsystems;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;

public class Camera {

    public void init(){
        UsbCamera camera = CameraServer.startAutomaticCapture();
        camera.setFPS(30);
        return;

    } // end of init 
}