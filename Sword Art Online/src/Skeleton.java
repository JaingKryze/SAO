
public class Skeleton extends Mob
	{
	public Skeleton()
		{
		setMobXp(20);
		mobAttackBehavior = (AttackBehavior) new MobStandardAttack();
		setMobName("Slime");
		setMobHP(10);
		setMobAttack(1);
		setMobDef(1);
		setMobSpeed(1);
		}
	}
