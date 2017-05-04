package Personajes.Zombie;

public class atletaZombie extends Zombie{
	
	atletaZombie() {
		velocity = 9;// 0-10
		hp = 12;// 0-30
		damage = 4;// 0-20
		range = 40;// 30-200
		friendlyFire = false;
		weapons = false;// portar o no armas
		attSpeed = .9;// .5-3
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

	@Override
	public void takeDamage() {
		// TODO Auto-generated method stub
		
	}

}
