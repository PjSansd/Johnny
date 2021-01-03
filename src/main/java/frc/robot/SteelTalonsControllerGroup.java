package frc.robot;

import java.security.DrbgParameters.Reseed;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class SteelTalonsControllerGroup extends SpeedControllerGroup {


    private double offset;
    private boolean reverse;

    public SteelTalonsControllerGroup(double offset, boolean reverse, SpeedController SpeedController,
            SpeedController[] speedControllers) {
        super(SpeedController, speedControllers);
        this.offset = offset;
        this.reverse = reverse;
    }

    public void set(double speed, boolean reverse){
        if(reverse)
            setInverted(!this.reverse);
        else   
            setInverted(this.reverse);
        super.set(speed + offset);
    }

    
}