package Personajes.Zombie;

public class dumbZombieRunner extends Zombie {

	
	dumbZombieRunner() {
		velocity = 10;// 0-10
		hp = 30;// 0-30
		damage = 1;// 0-20
		range = 20;// 30-200
		friendlyFire = false;
		weapons = false;// portar o no armas
		attSpeed = 3 ;// .5-3
		pickUp = false;
		drop = true;// zombies drop chido
		
	}
	
	public void move() {

		//No te persigue solo corre en circulos
		
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
