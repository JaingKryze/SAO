
public class MobStandardAttack implements AttackBehavior
	{
	
	public int damageValue;
	public int attack()
		{
		int roll = (int) (Math.random()*5);
		damageValue = (PlayGame.currentFloor.getCurrentMob().getMobAttack()+roll);
		return damageValue;
		}
	}
