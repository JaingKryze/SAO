
public class PlayerSlashAttack implements AttackBehavior
	{
	private  Player player = PlayGame.player;
	private int damageValue = 0;
	public int attack()
		{
		int critMult = 1;
		int roll = (int) (Math.random()*5);
		int critChanceRoll = (int) (Math.random()*100)+1;
		if ((critChanceRoll <= player.getPlayerInt()))
			{
			critMult = 2;
			System.out.println("Critical hit! Double damage.");
			}
		else
			{
			critMult = 1;
			}
		damageValue = (1*player.getPlayerStr()*critMult+roll);
		return damageValue;
		}
	}
