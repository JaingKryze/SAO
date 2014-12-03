
public abstract class Item
	{
	protected String type;
	protected String name;
	protected int price;
	protected double rarity;
	protected AbilityBehavior itemAbilityBehavior = new noAbility();
	public int sellItem()
		{
		//remove item from inventory
		//add price to wallet
		return price;
		}
	public void useItem()
		{
		System.out.println("This item cant be used.");
		}
	public abstract void equipItem();
	public abstract void unequipItem();
	
	
	public String getType()
		{
		return type;
		}
	public void setType(String type)
		{
		this.type = type;
		}
	public String getName()
		{
		return name;
		}
	public void setName(String n)
		{
		name = n;
		}
	public int getPrice()
		{
		return price;
		}
	public void setPrice(int price)
		{
		this.price = price;
		}
	public double getRarity()
		{
		return rarity;
		}
	public void setRarity(double rarity)
		{
		this.rarity = rarity;
		}
	public AbilityBehavior getItemAbilityBehavior()
		{
		return itemAbilityBehavior;
		}
	public void setItemAbilityBehavior(AbilityBehavior itemAbilityBehavior)
		{
		this.itemAbilityBehavior = itemAbilityBehavior;
		}
	}
