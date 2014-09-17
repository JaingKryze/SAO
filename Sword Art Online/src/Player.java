
public class Player
	{
	AttackBehavior heroAttackBehavior;
	private static String name;
	private static int playerHP;
	private static int playerVit;
	private static int playerStr;
	private static int playerDxt;
	private static int playerInt;

	public AttackBehavior getHeroAttackBehavior()
		{
		return heroAttackBehavior;
		}
	public void setHeroAttackBehavior(AttackBehavior heroAttackBehavior)
		{
		this.heroAttackBehavior = heroAttackBehavior;
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
	}
