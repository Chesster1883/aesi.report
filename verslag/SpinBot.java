package sample;


import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;

import java.awt.*;


public class SpinBot extends AdvancedRobot {

	public void run() {
		// Set colors
		setBodyColor(Color.blue);
		setGunColor(Color.blue);
		setRadarColor(Color.black);
		setScanColor(Color.yellow);

		// Loop forever
		while (true) {
			setTurnRight(10000);
			setMaxVelocity(5);
			ahead(10000);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(3);
	}

	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
		}
		if (e.isMyFault()) {
			turnRight(10);
		}
	}
}
