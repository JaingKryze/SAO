import java.util.Scanner;
public class Player
	{
	private Item[] inventory = new Item[30];
	private Weapon playerWeapon;
	private Armor playerArmor;
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
	public void displayInventory()
		{
		//need to add a item display method to the Items classes
		}
	public void addItem(Item item)
		{
		for(int i = 0; i < 29; i++)
			{
			if (inventory[i] == (null))
				{
				inventory[i] = item;
				return;
				}
			}
		System.out.println("Invetory is full please pick an item to delete");
		displayInventory();
		Scanner SelectItem = new Scanner(System.in);
		int itemNumber = SelectItem.nextInt();
		deleteItem(itemNumber);
		addItem(item);
		}
	public void deleteItem(int location)
		{
		inventory[location-1] = null;
		}
	
	
	
	public Weapon getPlayerWeapon()
		{
		return playerWeapon;
		}
	public void setPlayerWeapon(Weapon playerWeapon)
		{
		this.playerWeapon = playerWeapon;
		}
	public Armor getPlayerArmor()
		{
		return playerArmor;
		}
	public void setPlayerArmor(Armor playerArmor)
		{
		this.playerArmor = playerArmor;
		}
	public Item[] getInventory()
		{
		return inventory;
		}
	public void setInventory(Item[] inventory)
		{
		this.inventory = inventory;
		}
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
