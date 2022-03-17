package u9pp.MonsterFighter;
/*
inherits monster and creates a type of monster that heals every turn
*/
public class HealingMonster extends Monster
{
  private int healFactor = 0;
  /*
  @param name of monster, monster's health, monster's attack strength, experience gained when monster is killed, monster's rate of healing
  creates healingMonster
  */
  public HealingMonster (String name, int maxHealth, int attack, int expAmount, int heal)
  {
    super(name, maxHealth, attack, expAmount);
    healFactor = heal; 
  }

  /*
  @param the target of the monsters attack
  overrides Monster takeTurn and runs heal for monster with healFactor as the parameter
  @override of Monster takeTurn, and how much health was increased
  */
  public String takeTurn (Combatant target)
  {
    this.heal(healFactor); 
    return super.takeTurn(target) + " and healed up to " + healFactor + " life."; 
  }

  /*
  @return healFactor
  */
  public int getHealingPerTurn()
  {
    return healFactor;
  }
}

