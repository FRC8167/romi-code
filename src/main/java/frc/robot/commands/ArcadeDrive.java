// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
	private final Drivetrain drivetrain;
	private final Joystick controller;
	
	public ArcadeDrive(Drivetrain drivetrain, Joystick controller) {
		this.drivetrain = drivetrain;
		this.controller = controller;
	}
	
	// Called when the command is initially scheduled.
	@Override
	public void initialize() {}
	
	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {
		drivetrain.arcadeDrive(-controller.getRawAxis(1), controller.getRawAxis(2));
	}
	
	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {}
	
	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		return false;
	}
}
