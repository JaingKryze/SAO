
public class Slime extends Mob
	{
	public Slime()
		{
		setMobXp(10);
		mobAttackBehavior = (AttackBehavior) new MobStandardAttack();
		setMobName("Slime");
		setMobHP(30);
		setMobAttack(10);
		setMobDef(1);
		setMobSpeed(1);
		}
	}
