public class Character {
  private String className;
  private int health;
  private double attackPower;
  private boolean isPoisoned;

  public Character() {
    System.out.println("Character created, ready for battle!");
  }

  public void levelUp() {
    this.health = this.health + 10;
  }

  public void levelUp(int experiencePoints) {
    this.health = this.health + experiencePoints;
  }

  public int getHealth() {
    return health;
  }

  public double getAttackPower() {
    return attackPower;
  }

  public String getClassName() {
    return className;
  }

  public boolean getIsPoisoned() {
    return isPoisoned;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public void setAttackPower(double attackPower) {
    this.attackPower = attackPower;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public void setIsPoisoned(boolean isPoisoned) {
    this.isPoisoned = isPoisoned;
  }
}