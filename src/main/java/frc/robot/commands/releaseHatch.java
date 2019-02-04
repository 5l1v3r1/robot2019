package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


public class releaseHatch extends Command {
    
    public releaseHatch() {

        requires(Robot.m_hatch);

    }

    @Override

    protected void initialize() {

    }


    @Override

    protected void execute() {

        Robot.m_hatch.openCylinder();
        // System.out.println("I am opening the cylinders");
        
    }

    @Override

    protected boolean isFinished() {

        return false;

    }

    @Override

    protected void end() {

        Robot.m_hatch.turnOffCylinder();

    }

    @Override

    protected void interrupted() {

        end();

    }

}