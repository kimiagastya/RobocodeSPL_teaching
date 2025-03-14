package jab;

import jab.module.*;
import jab.module.Module;
import java.awt.Color;

public class ModuleBot extends Module {
	protected void initialize() {
		setBodyColor(new java.awt.Color(139, 0, 0));
		setGunColor(new java.awt.Color(255, 69, 0));
		setRadarColor(new java.awt.Color(255, 0, 0));
		setScanColor(new java.awt.Color(255, 192, 203));
		setBulletColor(new java.awt.Color(220, 20, 60));
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
