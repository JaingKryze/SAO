
public class PlayerSlashAttack implements AttackBehavior
	{
	public int attack ()
		{
		int critMult = 1;
		int roll = (int) (Math.random()*5);
		int critChanceRoll = (int) (Math.random()*100);
		if ((critChanceRoll*Player.getPlayerInt())/100 >= 1)
			{
			critMult = 2;
			}
		else
			{
			critMult = 1;
			}
		damage = damage + (1*Player.getPlayerStr())
		return damage;
		}
	}
