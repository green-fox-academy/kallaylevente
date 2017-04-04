public class Aircraft {
  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo;
  private int damageDealt;

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public Aircraft() {
    this.currentAmmo = 0;
  }

  public int  track(){
    return currentAmmo;
  }

  public int fight() {
    this.damageDealt = this.baseDamage * currentAmmo;
    this.currentAmmo = 0;
    return this.damageDealt;
  }

  public int refill(int ammoStack){
    int ammoNeeded = (this.maxAmmo - this.currentAmmo );
    if (ammoStack > ammoNeeded) {
      this.currentAmmo = this.maxAmmo;
      ammoStack = (ammoStack - ammoNeeded);
    }
    this.currentAmmo = this.currentAmmo + ammoStack;
    ammoStack = 0;
    return ammoStack;
  }
}
