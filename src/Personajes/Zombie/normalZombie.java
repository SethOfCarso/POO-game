package Personajes.Zombie;

public class normalZombie extends Zombie {

	normalZombie() {
		velocity = 6;// 0-10
		hp = 6;// 0-30
		damage = 3;// 0-20
		range = 40;// 30-200
		friendlyFire = false;
		weapons = false;// portar o no armas
		attSpeed = .5;// .5-3
		pickUp = false;
		drop = true;// zombies

	}

	//aparecera en todas las rondas
	public void move() {
		// implementar movimiento hacia personaje +1
	}

	public void doDamage() {

	}

	public void die() {

	}

	public void atack() {

	}

	public void takeDamage() {

	}

}
