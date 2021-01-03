package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Hatch
 */
public class Hatch extends SubsystemBase {
    private Solenoid hatch;

    public Hatch(Solenoid hatch){
        this.hatch = hatch; 
    }

    public void moveHatch(){
        hatch.set(true);
    }

    public void stopHatch(){
        
    }
    
}