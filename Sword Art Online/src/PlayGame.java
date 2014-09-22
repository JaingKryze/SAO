import java.util.Scanner;
public class PlayGame
	{
	private static Player player;
	static Locations[] map;
	static Locations currentFloor;
	public static void main(String[] args)
		{
		CreatePlayer.createPlayer();
		generateRooms();
		spawnMobs();
		player = CreatePlayer.createPlayer();
		while(true)
			{
			for (int i = 0; i<5; i++)
				{
				System.out.println("You are on " + currentFloor.getFloor());
				System.out.println("You see a " + currentFloor.getCurrentMob());
				battle(player, currentFloor.getCurrentMob());
				}
			}
		}
	public static void generateRooms()
		{
		map = new Locations[4];
		map [0] = new Locations("Floor 1");
		map [1] = new Locations("Floor 2");
		map [2] = new Locations("Floor 3");
		map [3] = new Locations("Floor 4");
		
		currentFloor = map[0];
		}
	public static void spawnMobs()
		{
		map [0].currentMob = new Slime();
		map [1].currentMob = new Slime();
		map [2].currentMob = new Slime();
		map [3].currentMob = new Slime();
		}
	// hos short for hostile
	public static void battle(Player hero, Mob hosMob)
		{
		int skill = 0;
		while (hosMob.getMobHP()>0)
			{
			System.out.println("The " + hosMob.getMobName() + "'s HP is " + hosMob.getMobHP());
			System.out.println(hero.getName() + "'s HP is " + hero.getPlayerHP());
			do
				{
				System.out.println("What skill would you like to use (enter the number) (1) slash");
				Scanner askSkill = new Scanner(System.in);
				skill = askSkill.nextInt();
				if (skill != 1)
					{
					System.out.println("Please select a valid skill");
					}
				}
			while(skill != 1);
			switch (skill)
				{
				case 1:
					{
					hero.setPlayerAttackBehavior((AttackBehavior) new PlayerSlashAttack());
					break;
					}
				}
			hosMob.setMobHP(hosMob.getMobHP() - hero.performAttack());
			hero.setPlayerHP(hero.getPlayerHP() - hosMob.performAttack());
			System.out.println("The " + hosMob.getMobName() + "'s HP is " + hosMob.getMobHP());
			System.out.println(hero.getName() + "'s HP is " + hero.getPlayerHP());
			if (hosMob.getMobHP() <= 0)
				{
				System.out.println("The " + hosMob.getMobName() + " dies.");
				}
			if (hero.getPlayerHP() <= 0)
					{
					System.out.println(hero.getName() + " has died.");
					System.exit(0);
					}
			}
		}
	}
