package Personajes.Zombie;

public class titanZombie extends Zombie {
	
	titanZombie() {
		velocity = 4;// 0-10
		hp = 20;// 0-30
		damage = 8;// 0-20
		range = 60;// 30-200
		friendlyFire = true;
		weapons = false;// portar o no armas
		attSpeed = .5;// .5-3
		pickUp = false;
		drop = true;// zombies
	}

// probabilidad de spawn 5% y se va sumando	
	public void move() {
		
		
	}

	
	public void doDamage() {
		
		
	}

	
	public void die() {
	
		
	}

	
	public void atack() {
	
		
	}

	@Override
	public void takeDamage() {
		// TODO Auto-generated method stub
		
	}
	

}
