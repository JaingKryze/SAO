import java.util.*;

public class Locations
	{
	
	Mob currentMob;
	private String floor;
	public Locations (String f)
		{
		floor = f;
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
