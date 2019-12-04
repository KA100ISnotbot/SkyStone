package org.firstinspires.ftc.teamcode;

@Autonomous(name="Test")
public class Test extends LinearOpMode {
private DcMOtor leftDrive, rightDrive;
double power = 0.5;

@Override
publicvoid run OpMode()
{
leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
rightDrive = hardwareMap.get(DcMotor.class, "right_drive");

waitForStart();

leftDrive.setPower(power);
rightDrive.setPower(-power);
sleep(1000);
}
}
