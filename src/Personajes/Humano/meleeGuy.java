package Personajes.Humano;

public class meleeGuy extends Humano {

	meleeGuy() {
		velocity = 5;// 0-10
		hp = 30;// 0-30
		damage = 8;// 0-20
		range = 50;// 30-200
		friendlyFire = false;
		weapons = true;// portar o no armas
		attSpeed = 1;// .5-3
		pickUp = true;
		drop = false;// zombies
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
