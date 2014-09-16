
public class Player
	{
	AttackBehavior heroAttackBehavior;
	private String name;
	private int playerHP;
	private int playerVit;
	private int playerStr;
	private int playerDxt;
	private static int playerInt;
	public Player(AttackBehavior heroAttackBehavior, String name, int playerHP, int playerVit, int playerStr,
			int playerDxt, int playerInt)
		{
		super();
		this.heroAttackBehavior = heroAttackBehavior;
		this.name = name;
		this.playerHP = playerHP;
		this.playerVit = playerVit;
		this.playerStr = playerStr;
		this.playerDxt = playerDxt;
		this.playerInt = playerInt;
		}
	public AttackBehavior getHeroAttackBehavior()
		{
		return heroAttackBehavior;
		}
	public void setHeroAttackBehavior(AttackBehavior heroAttackBehavior)
		{
		this.heroAttackBehavior = heroAttackBehavior;
		}
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public int getPlayerHP()
		{
		return playerHP;
		}
	public void setPlayerHP(int playerHP)
		{
		this.playerHP = playerHP;
		}
	public int getPlayerVit()
		{
		return playerVit;
		}
	public void setPlayerVit(int playerVit)
		{
		this.playerVit = playerVit;
		}
	public int getPlayerStr()
		{
		return playerStr;
		}
	public void setPlayerStr(int playerStr)
		{
		this.playerStr = playerStr;
		}
	public int getPlayerDxt()
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
