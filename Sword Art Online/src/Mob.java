
public class Mob
	{
	AttackBehavior mobAttackBehavior;
	private static String mobName;
	private static int mobHP;
	private static int mobAttack;
	private static int mobDef;
	private static int mobSpeed;
	private static int mobXp;
	public static int getMobXp()
		{
		return mobXp;
		}
	public void setMobXp(int mobXp)
		{
		this.mobXp = mobXp;
		}
	public AttackBehavior getMobAttackBehavior()
		{
		return mobAttackBehavior;
		}
	public void setMobAttackBehavior(AttackBehavior mobAttackBehavior)
		{
		this.mobAttackBehavior = mobAttackBehavior;
		}
	public static String getMobName()
		{
		return mobName;
		}
	public void setMobName(String mobName)
		{
		this.mobName = mobName;
		}
	public static int getMobHP()
		{
		return mobHP;
		}
	public void setMobHP(int mobHP)
		{
		this.mobHP = mobHP;
		}
	public static int getMobAttack()
		{
		return mobAttack;
		}
	public void setMobAttack(int mobAttack)
		{
		this.mobAttack = mobAttack;
		}
	public static int getMobDef()
		{
		return mobDef;
		}
	public void setMobDef(int mobDef)
		{
		this.mobDef = mobDef;
		}
	public static int getMobSpeed()
		{
		return mobSpeed;
		}
	public void setMobSpeed(int mobSpeed)
		{
		this.mobSpeed = mobSpeed;
		}
	public int performAttack()
		{
		return mobAttackBehavior.attack();
		}
	}
