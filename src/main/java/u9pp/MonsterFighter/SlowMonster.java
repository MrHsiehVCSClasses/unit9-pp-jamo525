package u9pp.MonsterFighter;

/*
inherits monster and creates a type of monster that attacks every other turn
*/
public class SlowMonster extends Monster
{
  /*
  @param name of monster, monster's health, monster's attack strength, experience gained when monster is killed
  creates slowMonster
  */
  public SlowMonster (String name, int maxHealth, int attack, int expAmount)
  {
    super(name, maxHealth, attack, expAmount);
  }

  /*
  @param the target of the monsters attack
  overrides Monster takeTurn if turn is an odd number
  @override of Monster takeTurn
  */
  public String takeTurn (Combatant target)
  {
    if (getMonsterTurn() % 2 == 1)
      return super.takeTurn(target);
    else
    {
      increaseMonsterTurn();
      return this.getName() + " does not attack.";
    }
  }
}

