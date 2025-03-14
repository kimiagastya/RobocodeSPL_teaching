package jab.module;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import robocode.util.Utils;

/**
 * Targeting
 * 
 * @author jabier.martinez
 */
public class Targeting extends Part {

	public Module bot;

	public Targeting(Module bot) {
		this.bot = bot;
	}

	public void target() {
		if (bot.enemy != null) {
			double absoluteBearing = bot.getHeadingRadians() + bot.enemy.bearingRadians;
			//System.out.println("HT Bearing: " +bot.enemy.bearingRadians + "   AbsoluteBearing: "+absoluteBearing);
			bot.setTurnGunRightRadians(Utils.normalRelativeAngle(absoluteBearing - bot.getGunHeadingRadians()));
		}
	}

}
