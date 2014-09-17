import java.util.*;
public class CreatePlayer
	{
	static String setName;
	static int setHPOfPlayer;
	static int setVitOfPlayer = 1;
	static int setStrOfPlayer = 1;
	static int setDxtOfPlayer = 1;
	static int setIntOfPlayer = 1;
	static int totalOfStats = 8;
	static boolean checkStatIn;
	public static Player createPlayer()
		{
		Player player = new Player();
		setStats(player);
		return player;
		}
	public static void setStats(Player player)
		{
		System.out.println("Name your character");
		Scanner name = new Scanner(System.in);
		setName = name.nextLine();
		player.setName(setName);
		System.out.println("You start with 8 stat points. You can put them into Vit (health), Str(attack power), Dxt(speed), and Int(crit. hit chance).");
		checkStatIn = true;
		do
			{
			System.out.println("How many points do you want in Vit");
			Scanner setVit = new Scanner(System.in);
			setVitOfPlayer = setVit.nextInt();
			if (setVitOfPlayer <= totalOfStats)
				{
				player.setPlayerVit(setVitOfPlayer + 1);
				totalOfStats = totalOfStats-setVitOfPlayer;
				checkStatIn = true;
				}
			else
				{
				System.out.println("Pick a number less than " + totalOfStats);
				checkStatIn = false;
				}
			}
		while(checkStatIn == false);
		checkStatIn = true;
		do
			{
			System.out.println("How many points do you want in Str");
			Scanner setStr = new Scanner(System.in);
			setStrOfPlayer = setStr.nextInt();
			if (setStrOfPlayer <= totalOfStats)
				{
				player.setPlayerStr(setStrOfPlayer + 1);
				totalOfStats = totalOfStats-setStrOfPlayer;
				checkStatIn = true;
				}
			else
				{
				System.out.println("Pick a number less than " + totalOfStats);
				checkStatIn = false;
				}
			}
		while(checkStatIn == false);
		checkStatIn = true;
		do
			{
			System.out.println("How many points do you want in Dxt");
			Scanner setDxt = new Scanner(System.in);
			setDxtOfPlayer = setDxt.nextInt();
			if (setDxtOfPlayer <= totalOfStats)
				{
				player.setPlayerDxt(setDxtOfPlayer + 1);
				totalOfStats = totalOfStats-setDxtOfPlayer;
				checkStatIn = true;
				}
			else
				{
				System.out.println("Pick a number less than " + totalOfStats);
				checkStatIn = false;
				}
			}
		while(checkStatIn == false);
		checkStatIn = true;
		do
			{
			System.out.println("How many points do you want in Int");
			Scanner setInt = new Scanner(System.in);
			setIntOfPlayer = setInt.nextInt();
			if (setIntOfPlayer <= totalOfStats)
				{
				player.setPlayerInt(setIntOfPlayer + 1);
				totalOfStats = totalOfStats-setIntOfPlayer;
				checkStatIn = true;
				}
			else
				{
				System.out.println("Pick a number less than " + totalOfStats);
				checkStatIn = false;
				}
			}
		while(checkStatIn == false);
		setHPOfPlayer = setVitOfPlayer*50;
		player.setPlayerHP(setHPOfPlayer);
		}
	}
