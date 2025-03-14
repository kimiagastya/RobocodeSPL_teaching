package jab;

import jab.module.*;
import jab.module.Module;
import java.awt.Color;

public class ModuleBot extends Module {
	protected void initialize() {
		setBodyColor(new java.awt.Color(0, 0, 139)); // Dark blue
		setGunColor(new java.awt.Color(135, 206, 235)); // Sky blue
		setRadarColor(new java.awt.Color(0, 191, 255)); // Deep sky blue
		setScanColor(new java.awt.Color(173, 216, 230)); // Light blue
		setBulletColor(new java.awt.Color(30, 144, 255));
	}

	protected void selectBehavior() {
		radar = getSelectedRadar();
		movement = getSelectedMovement();
		targeting = getSelectedTargeting();
		selectEnemy = getSelectedSelectEnemy();
		gun = getSelectedGun();
	}

	protected Radar getSelectedRadar() {
		return new Radar(this);
	}

	protected Targeting getSelectedTargeting() {
		return new Targeting(this);
	}

	protected Movement getSelectedMovement() {
		return new Movement(this);
	}

	protected SelectEnemy getSelectedSelectEnemy() {
		return new SelectEnemy(this);
	}

	protected Gun getSelectedGun() {
		return new Gun(this);
	}

}
