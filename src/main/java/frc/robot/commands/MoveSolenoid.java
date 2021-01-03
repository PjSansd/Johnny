package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.RobotContainer;

public class MoveSolenoid extends InstantCommand{
    @Override
    public void execute(){
        RobotContainer.getHatch().moveHatch();
    }

    @Override
    public void end(boolean interrupted){
        RobotContainer.getHatch().stopHatch();
    }
}