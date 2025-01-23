// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final int kDriverControllerPort = 0;

    public static final int coralMotorPort = 5;

    public static class tankDriveConstants {
        public static final int tLeftMotorPort = 1;
        public static final int bLeftMotorPort = 2;
        public static final int tRightMotorPort = 3;
        public static final int bRightMotorPort = 4;

        public static double kTankP = 1;
        public static double kTankI = 0;
        public static double kTankD = 0;
    }

    public static class elevatorConstants{
        public static final int elevatorPort = 6;
        public static final double maxHeight = 10;
        public static final double minHeight= 2;
        public static final double maxElevatorSpeed = 0.5;
        public static final double maxReverseElevatorSpeed = -0.5 ;

        public static final double kElevatorP = 1.0;
        public static final double kElevatorI = 0.0;
        public static final double kElevatorD = 0.0;
        public static final double kElevatorG = 0.3; //motor output required to hold elevator at constant height, fights gravity
        
    }

}

