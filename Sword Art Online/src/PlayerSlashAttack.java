
public class PlayerSlashAttack implements AttackBehavior
	{
	private int damageValue = 0;
	public int attack()
		{
		int critMult = 1;
		int roll = (int) (Math.random()*5);
		int critChanceRoll = (int) (Math.random()*100)+1;
		if ((critChanceRoll <= Player.getPlayerInt()))
			{
			critMult = 2;
			}
		else
			{
			critMult = 1;
			}
		damageValue = (1*Player.getPlayerStr()*critMult+roll);
		return damageValue;
		}
	}
