package Personajes.Zombie;

public class bombaZombie extends Zombie{
	
	bombaZombie() {
		velocity = 8;// 0-10
		hp = 1;// 0-30
		damage = 10;// 0-20
		range = 80;// 30-200
		friendlyFire = true;
		weapons = false;// portar o no armas
		attSpeed = .8;// .5-3
		pickUp = false;
		drop = true;// zombies
		
	}
	

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doDamage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeDamage() {
		// TODO Auto-generated method stub
		
	}

	
}
