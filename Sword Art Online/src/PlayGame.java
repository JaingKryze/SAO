import java.util.Scanner;
public class PlayGame
	{
	private static int yesNo;
	private static boolean reset;
	public static Player player;
	private static Locations[] map;
	private static Locations currentFloor;
	public static void main(String[] args)
		{
		generateRooms();
		spawnMobs();
		player = CreatePlayer.createPlayer();
		run();
		}
	public static void run()
		{
		while(true)
			{
			for (int i = 0; i<5; i++)
				{
				spawnMobs();
				System.out.println();
				System.out.println("You are in room " + (i+1) + " on " + currentFloor.getFloor() + " in the " + currentFloor.getDungeon());
				System.out.println("You see a " + currentFloor.getCurrentMob().getMobName());
				System.out.println();
				battle(player, currentFloor.getCurrentMob());
				}
			System.out.println("You have succesfully cleared the floor.");
			resetDungeon();
			if(reset == false)
				{
				currentFloor = map[1];
				for (int i = 0; i<5; i++)
					{
					spawnMobs();
					System.out.println();
					System.out.println("You are in room " + (i+1) + " on " + currentFloor.getFloor() + " in the " + currentFloor.getDungeon());
					System.out.println("You see a " + currentFloor.getCurrentMob().getMobName());
					System.out.println();
					battle(player, currentFloor.getCurrentMob());
					}
				System.out.println("You have succesfully cleared the floor.");
				resetDungeon();
				}
			if(reset == false)
				{
				currentFloor = map[2];
				for (int i = 0; i<5; i++)
					{
					spawnMobs();
					System.out.println();
					System.out.println("You are in room " + (i+1) + " on " + currentFloor.getFloor() + " in the " + currentFloor.getDungeon());
					System.out.println("You see a " + currentFloor.getCurrentMob().getMobName());
					System.out.println();
					battle(player, currentFloor.getCurrentMob());
					}
				System.out.println("You have succesfully cleared the floor.");
				resetDungeon();
				}
			}
		}
	public static boolean resetDungeon()
		{
		System.out.println("Would you like to return to the entrance of the " + currentFloor.getDungeon() + " (1) yes (2) no.");
		Scanner yesOrNo = new Scanner(System.in);
		yesNo =  yesOrNo.nextInt();
		if (yesNo == 1)
			{
			reset = true;
			player.setPlayerHP(Player.getPlayerVit()*50);
			}
		else
			{
			reset = false;
			}
		return reset;
		}
	public static void generateRooms()
		{
		map = new Locations[4];
		map [0] = new Locations("Floor 1", "Dark Cave");
		map [1] = new Locations("Floor 2", "Dark Cave");
		map [2] = new Locations("Floor 3", "Dark Cave");
		map [3] = new Locations("Floor 4", "Dark Cave");
		
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
		System.out.println("The " + Mob.getMobName() + "'s HP is " + Mob.getMobHP());
		System.out.println(Player.getName() + "'s HP is " + Player.getPlayerHP());
		while (Mob.getMobHP()>0)
			{
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
			hosMob.setMobHP(Mob.getMobHP() - hero.performAttack());
			System.out.println("The " + Mob.getMobName() + "'s HP is " + Mob.getMobHP());
			if((Player.getPlayerDxt()/2)>=Mob.getMobSpeed())
				{
				System.out.println("Your speed is greater than double the speed of " + Mob.getMobName() + ". You get an extra attack!");
				hosMob.setMobHP(Mob.getMobHP() - hero.performAttack());
				System.out.println("The " + Mob.getMobName() + "'s HP is " + Mob.getMobHP());
				}
			hero.setPlayerHP(Player.getPlayerHP() - hosMob.performAttack());
			System.out.println(Player.getName() + "'s HP is " + Player.getPlayerHP());
			if((Mob.getMobSpeed()/2)>=Player.getPlayerDxt())
				{
				System.out.println(Mob.getMobName() + "'s speed is greater than double " + Player.getName() + ". " + Mob.getMobName() + " gets an extra attack!");
				hero.setPlayerHP(Player.getPlayerHP() - hosMob.performAttack());
				System.out.println(Player.getName() + "'s HP is " + Player.getPlayerHP());
				}
			if (Mob.getMobHP() <= 0)
				{
				drops();
				System.out.println("The " + Mob.getMobName() + " dies.");
				}
			if (Player.getPlayerHP() <= 0)
					{
					System.out.println(Player.getName() + " has died.");
					System.exit(0);
					}
			}
		}
	public static void drops()
		{
		player.setPlayerXp(Player.getPlayerXp() + currentFloor.getCurrentMob().getMobXp());
		if (Player.getPlayerXp() >= Player.getPlayerXpNeeded())
			{
			player.setPlayerXp(0);
			player.setPlayerLevel(Player.getPlayerLevel() + 1);
			player.setPlayerXpNeeded((int)(Player.getPlayerLevel()*1.5)*100);
			System.out.println("Level up!");
			System.out.println("You are now level " + Player.getPlayerLevel());
			LevelUp.assignStats();
			}
		System.out.println("Your exp is " + Player.getPlayerXp() + " / " + Player.getPlayerXpNeeded());
		}
	}
