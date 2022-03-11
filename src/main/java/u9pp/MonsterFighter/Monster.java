package u9pp.MonsterFighter;

/*
creates basic concept for monster as an inheritence of combatent
*/
public class Monster extends Combatant
{
  private int monsterTurn = 0;
  private int exp = 0;
  /*
  @param name of monster, monster's health, monster's attack strength, and experience gained when monster is killed.  
  constructs new Monster
  */
  public Monster (String name, int maxHealth, int attack, int expAmount)
  {
    super(name, maxHealth, attack);
    this.exp = expAmount;
  }

  /*
  @return experience gained when monster is killed
  */
  public int getExpGiven()
  {
    return exp;
  }
  /*
  @return number of turns taken by monsters
  */
  public int getMonsterTurn()
  {
    return monsterTurn;
  }

  /*
  increases monsterTurn by 1
  */
  public void increaseMonsterTurn()
  {
    monsterTurn++;
  }

  /*
  @param the target of the monsters attack
  target is attacked, taking damage based on monster's attack power
  @return the action dealt by the monster in String format
  */
  public String takeTurn(Combatant target)
  {
    target.getAttacked(this.getAttackPower());
    increaseMonsterTurn();
    return this.getName() + " attacks " + target.getName() + " with an attack power of " + this.getAttackPower();
  }
}
