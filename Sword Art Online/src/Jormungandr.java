
public class Jormungandr extends Mob
	{
	public Jormungandr()
		{
		setMobXp(200);
		mobAttackBehavior = (AttackBehavior) new MobStandardAttack();
		setMobName("Skeleton");
		setMobHP(300);
		setMobAttack(70);
		setMobDef(20);
		setMobSpeed(10);
		}
	}
