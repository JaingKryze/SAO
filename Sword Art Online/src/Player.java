
public class Player
	{
	AttackBehavior playerAttackBehavior;
	private  String name;
	private  int playerHP;
	private  int playerVit;
	private  int playerStr;
	private  int playerDxt;
	private  int playerInt;
	private  int playerXp;
	private  int playerLevel;
	private  int playerXpNeeded;
	public  int getPlayerXp()
		{
		return playerXp;
		}
	public void setPlayerXp(int playerXp)
		{
		this.playerXp = playerXp;
		}
	public  int getPlayerLevel()
		{
		return playerLevel;
		}
	public void setPlayerLevel(int playerLevel)
		{
		this.playerLevel = playerLevel;
		}
	public  int getPlayerXpNeeded()
		{
		return playerXpNeeded;
		}
	public void setPlayerXpNeeded(int playerXpNeeded)
		{
		this.playerXpNeeded = playerXpNeeded;
		}
	public AttackBehavior getPlayerAttackBehavior()
		{
		return playerAttackBehavior;
		}
	public void setPlayerAttackBehavior(AttackBehavior playerAttackBehavior)
		{
		this.playerAttackBehavior = playerAttackBehavior;
		}
	public  String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public  int getPlayerHP()
		{
		return playerHP;
		}
	public void setPlayerHP(int playerHP)
		{
		this.playerHP = playerHP;
		}
	public  int getPlayerVit()
		{
		return playerVit;
		}
	public void setPlayerVit(int playerVit)
		{
		this.playerVit = playerVit;
		}
	public  int getPlayerStr()
		{
		return playerStr;
		}
	public void setPlayerStr(int playerStr)
		{
		this.playerStr = playerStr;
		}
	public  int getPlayerDxt()
		{
		return playerDxt;
		}
	public void setPlayerDxt(int playerDxt)
		{
		this.playerDxt = playerDxt;
		}
	public  int getPlayerInt()
		{
		return playerInt;
		}
	public void setPlayerInt(int playerInt)
		{
		this.playerInt = playerInt;
		}
	public int performAttack()
		{
		return playerAttackBehavior.attack();
		}
	}
