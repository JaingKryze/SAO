
public class Player
	{
	AttackBehavior playerAttackBehavior;
	private static String name;
	private static int playerHP;
	private static int playerVit;
	private static int playerStr;
	private static int playerDxt;
	private static int playerInt;
	private static int playerXp;
	private static int playerLevel;
	private static int playerXpNeeded;
	public static int getPlayerXp()
		{
		return playerXp;
		}
	public void setPlayerXp(int playerXp)
		{
		this.playerXp = playerXp;
		}
	public static int getPlayerLevel()
		{
		return playerLevel;
		}
	public void setPlayerLevel(int playerLevel)
		{
		this.playerLevel = playerLevel;
		}
	public static int getPlayerXpNeeded()
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
	public static String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public static int getPlayerHP()
		{
		return playerHP;
		}
	public void setPlayerHP(int playerHP)
		{
		this.playerHP = playerHP;
		}
	public static int getPlayerVit()
		{
		return playerVit;
		}
	public void setPlayerVit(int playerVit)
		{
		this.playerVit = playerVit;
		}
	public static int getPlayerStr()
		{
		return playerStr;
		}
	public void setPlayerStr(int playerStr)
		{
		this.playerStr = playerStr;
		}
	public static int getPlayerDxt()
		{
		return playerDxt;
		}
	public void setPlayerDxt(int playerDxt)
		{
		this.playerDxt = playerDxt;
		}
	public static int getPlayerInt()
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
