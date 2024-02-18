// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private static CANSparkFlex intakeTopMotor;
  private static CANSparkFlex intakeBottomMotor;


  public IntakeSubsystem() {
    intakeTopMotor = new CANSparkFlex(IntakeConstants.kIntakeTopMotorID, MotorType.kBrushless);
    intakeBottomMotor = new CANSparkFlex(IntakeConstants.kIntakeBottomMotorID, MotorType.kBrushless);

    intakeBottomMotor.follow(intakeTopMotor, true);
  }

  public void runIntake(double speed) {
    intakeTopMotor.set(speed);
  }
  

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}