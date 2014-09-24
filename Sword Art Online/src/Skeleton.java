
public class Skeleton extends Mob
	{
	public Skeleton()
		{
		setMobXp(20);
		mobAttackBehavior = (AttackBehavior) new MobStandardAttack();
		setMobName("Skeleton");
		setMobHP(50);
		setMobAttack(23);
		setMobDef(1);
		setMobSpeed(3);
		}
	}
