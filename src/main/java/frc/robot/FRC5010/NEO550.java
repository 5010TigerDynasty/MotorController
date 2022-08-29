// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.FRC5010;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;



/** Add your docs here. */
public class NEO550 extends CANSparkMax implements MotorController5010{
    public NEO550(int port){
        super(port, MotorType.kBrushless);
        this.setSmartCurrentLimit(MotorConstants.CurrentLimits.Neo);
    }
    public NEO550(int port, int currentLimit){
        super(port, MotorType.kBrushless);
        this.setSmartCurrentLimit(currentLimit);
    }
    @Override
    public MotorController5010 setSlewRate(double rate) {
        // TODO Auto-generated method stub
        this.setOpenLoopRampRate(rate);
        return this;
    }
    @Override
    public MotorController5010 setFollow(MotorController5010 motor) {
        // TODO Auto-generated method stub
        super.follow((CANSparkMax) motor.getMotor());
        return this;
    }
    @Override
    public MotorController5010 invert(boolean inverted) {
        // TODO Auto-generated method stub
        this.setInverted(inverted);
        return this;
    }
    @Override
    public MotorController getMotor() {
        // TODO Auto-generated method stub
        return this;
    }
    
}