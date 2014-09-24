import java.util.Scanner;


public class LevelUp
	{
	private static Player player = PlayGame.player;
	private static int setHPOfPlayer;
	private static int setVitOfPlayer = player.getPlayerVit();
	private static int setStrOfPlayer = player.getPlayerStr();
	private static int setDxtOfPlayer = player.getPlayerDxt();
	private static int setIntOfPlayer = player.getPlayerInt();
	private static int totalOfStats = 3;
	private static boolean checkStatIn;
	public static void assignStats()
		{
		checkStatIn = true;
		do
			{
			System.out.println("How many points do you want in Vit?");
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
				player.setPlayerStr(setStrOfPlayer + 1);
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
				player.setPlayerDxt(setDxtOfPlayer + 1);
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
