public class Aircraft {
  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo;
  private int damageDealt;
  private String typeof;

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
    int ammoNeededInTrack;
    ammoNeededInTrack = this.maxAmmo - this.currentAmmo;
    return ammoNeededInTrack;
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
      return ammoStack;
    }
    this.currentAmmo = this.currentAmmo + ammoStack;
    ammoStack = 0;
    return ammoStack;
  }

  public String get_type(){
    typeof = "Aircraft";
    return typeof;
  }

  public String get_status() {
    String statusString = new String();
    statusString = "Type " + typeof + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage:" + (currentAmmo*baseDamage);
    return statusString;
  }
}
