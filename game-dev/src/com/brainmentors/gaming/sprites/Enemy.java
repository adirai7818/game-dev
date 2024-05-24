package com.brainmentors.gaming.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy extends Sprite {
	
	public Enemy(int x, int speed) {
		w=200;
		h=200;
		this.x =x;
		this.speed = speed;
		y=100;
		image = new ImageIcon(Enemy.class.getResource("enemy-vulture.gif"));
}
	public void move() {
		if(y>900) {
			y =0;
		}
		y = y+ speed;
	}
	}
