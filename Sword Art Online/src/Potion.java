
public class Potion extends Item
	{
	public Potion()
		{
		type = "potion";
		}
	public Potion(String n, int p, int hp, int r)
		{
		name = n;
		type = "potion";
		price = p;
		hpRestore = hp;
		rarity = r;
		}
	public int getHpRestore() {
		return hpRestore;
	}
	public void setHpRestore(int hpRestore) {
		this.hpRestore = hpRestore;
	}
	protected int hpRestore;
	@Override
	public void useItem()
		{
		if(PlayGame.player.getPlayerHP()+hpRestore > PlayGame.player.getPlayerVit()*50)
			{
			PlayGame.player.setPlayerHP(PlayGame.player.getPlayerVit()*50);
			}
		else
			{
			PlayGame.player.setPlayerHP(PlayGame.player.getPlayerHP()+hpRestore);
			}
		}
	@Override
	public void equipItem()
		{
		System.out.println("This item can not be equiped.");
		}
	@Override
	public void unequipItem()
		{
		System.out.println("This item can not be equiped.");
		}
	}
