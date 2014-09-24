
public class Mob
	{
	AttackBehavior mobAttackBehavior;
	private  String mobName;
	private  int mobHP;
	private int mobAttack;
	private int mobDef;
	private int mobSpeed;
	private int mobXp;
	public int getMobXp()
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
	public String getMobName()
		{
		return mobName;
		}
	public void setMobName(String mobName)
		{
		this.mobName = mobName;
		}
	public  int getMobHP()
		{
		return mobHP;
		}
	public void setMobHP(int mobHP)
		{
		this.mobHP = mobHP;
		}
	public  int getMobAttack()
		{
		return mobAttack;
		}
	public void setMobAttack(int mobAttack)
		{
		this.mobAttack = mobAttack;
		}
	public  int getMobDef()
		{
		return mobDef;
		}
	public void setMobDef(int mobDef)
		{
		this.mobDef = mobDef;
		}
	public  int getMobSpeed()
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
