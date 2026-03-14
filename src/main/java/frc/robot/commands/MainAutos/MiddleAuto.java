package frc.robot.commands.MainAutos;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.Launch;
import frc.robot.commands.moving.ForwardDrive;
import frc.robot.subsystems.CANFuelSubsystem;
import frc.robot.subsystems.DriveSubsystem;
//import frc.robot.subsystems.MAXSwerveModule;

public class MiddleAuto extends SequentialCommandGroup {

    public MiddleAuto(DriveSubsystem m_robotDrive, CANFuelSubsystem fuelSubsystem) {
        addCommands(
            new Launch(fuelSubsystem).withTimeout(10),
            new ForwardDrive(m_robotDrive),
            new Launch(fuelSubsystem).withTimeout(10));


    }

}
