
public class Slime extends Mob
	{
		public Slime()
			{
			mobAttackBehavior = (AttackBehavior) new MobStandardAttack();
			setMobName("Slime");
			setMobHP(10);
			setMobAttack(1);
			setMobDef(1);
			setMobSpeed(1);
			}
	}
