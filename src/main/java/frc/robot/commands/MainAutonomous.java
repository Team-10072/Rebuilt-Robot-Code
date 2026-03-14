package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANFuelSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.MAXSwerveModule;

public class MainAutonomous extends SequentialCommandGroup {

    public MainAutonomous(DriveSubsystem m_robotDrive, CANFuelSubsystem fuelSubsystem) {
        addCommands(
            new Launch(fuelSubsystem).withTimeout(10),
            new ForwardDrive(m_robotDrive),
            new Launch(fuelSubsystem).withTimeout(10));


    }

}
