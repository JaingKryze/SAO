import java.util.ArrayList;
public class Weapon
	{
	public String name;
	public String type;
	public int attackPower;
	public int tier;
	public Weapon (String n, String ty, int aP, int t)
		{
		name = n;
		type = ty;
		attackPower = aP;
		tier = t;
		}
	ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
	public ArrayList<Weapon> addWeapons()
		{
		weaponList.add(new Weapon("Begginner's Sword", "Sword", 5, 0));
		return weaponList;
		}
	}
