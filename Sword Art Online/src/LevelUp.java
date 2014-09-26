import java.util.Scanner;


public class LevelUp
	{
	private static Player player = PlayGame.player;
	private static int setHPOfPlayer;
	private static int setVitOfPlayer;
	private static int setStrOfPlayer;
	private static int setDxtOfPlayer;
	private static int setIntOfPlayer;
	private static int totalOfStats = 3;
	private static boolean checkStatIn;
	public static void assignStats()
		{
		checkStatIn = true;
		do
			{
			System.out.println("You now have three stat points.");
			System.out.println("How many points do you want in Vit?");
			Scanner setVit = new Scanner(System.in);
			setVitOfPlayer = setVit.nextInt();
			if (setVitOfPlayer <= totalOfStats)
				{
				player.setPlayerVit(player.getPlayerVit() + setVitOfPlayer);
				totalOfStats = totalOfStats-setVitOfPlayer;
				checkStatIn = true;
				}
			else
				{
				System.out.println("Pick a number less than or equal to " + totalOfStats + ".");
				checkStatIn = false;
				}
			}
		while(checkStatIn == false);
		checkStatIn = true;
		do
			{
			System.out.println("How many points do you want in Str?");
			Scanner setStr = new Scanner(System.in);
			setStrOfPlayer = setStr.nextInt();
			if (setStrOfPlayer <= totalOfStats)
				{
				player.setPlayerStr(player.getPlayerStr() + setStrOfPlayer);
				totalOfStats = totalOfStats-setStrOfPlayer;
				checkStatIn = true;
				}
			else
				{
				System.out.println("Pick a number less than or equal to " + totalOfStats + ".");
				checkStatIn = false;
				}
			}
		while(checkStatIn == false);
		checkStatIn = true;
		do
			{
			System.out.println("How many points do you want in Dxt?");
			Scanner setDxt = new Scanner(System.in);
			setDxtOfPlayer = setDxt.nextInt();
			if (setDxtOfPlayer <= totalOfStats)
				{
				player.setPlayerDxt(player.getPlayerDxt() + setDxtOfPlayer);
				totalOfStats = totalOfStats-setDxtOfPlayer;
				checkStatIn = true;
				}
			else
				{
				System.out.println("Pick a number less than or equal to " + totalOfStats + ".");
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
				player.setPlayerInt(player.getPlayerVit() + setIntOfPlayer);
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
		setHPOfPlayer = player.getPlayerVit()*50;
		player.setPlayerHP(setHPOfPlayer);
		}
	}
