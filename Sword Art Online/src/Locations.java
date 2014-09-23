import java.util.*;

public class Locations
	{
	private String dungeon;
	Mob currentMob;
	private String floor;
	public Locations (String f, String d)
		{
		floor = f;
		dungeon = d;
		}
	public String getDungeon()
		{
		return dungeon;
		}
	public Mob getCurrentMob()
		{
		return currentMob;
		}
	public String getFloor()
		{
		return floor;
		}
	}
