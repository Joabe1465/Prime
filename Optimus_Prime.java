package Robot;
import robocode.*;
import java.awt.Color;
public class Optimus_Prime extends AdvancedRobot
{
	public void run() {
		
		setColors(Color.black,Color.blue,Color.red);

		
		while(true) {
		
			for(int i=0; i<3;i++){
		
			setAhead(50);
			setTurnGunLeft(10);
			setTurnRight(30);
			execute();
			}

		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(4);
	}
	public void onHitByBullet(HitByBulletEvent e) {
		ahead(40);
		setTurnLeft(120);
		
	}

	public void onHitWall(HitWallEvent e) {
			back(40);
		}
	public void onHitRobot(HitRobotEvent e) {
			fire(1);
		}
	}
	

