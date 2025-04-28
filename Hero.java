/*
* Names: Aneeq Altaf
* netID: aaltaf4
* G#: 01496340
* Lecture section: 004
* Lab section: 205
*/
public class Hero {
    public String name;
    public int hitPointsRemaining;
    public int hitPointsMax;
    public int attackRating;
    public int defenseRating;
    public int currentXP;
    public int currentLevel;
    public int healingPotions;
    public Hero(String aname, int hpMax, int ar, int dr, int potions) {
        currentXP=0;
        currentLevel=1;
        name=aname;
        hitPointsMax=hpMax;
        attackRating=ar;
        defenseRating=dr;
        healingPotions=potions;
        hitPointsRemaining=hitPointsMax;
    }
    public boolean hasHPRemaining() {
        if (hitPointsRemaining>0) {
            return true;
        }
        else {
            return false;
        }
    }
    public void receiveAttack(int incAttack) {
        if (incAttack<defenseRating) {
            hitPointsRemaining=hitPointsRemaining;
        }
        else {
            hitPointsRemaining=hitPointsRemaining- (incAttack-defenseRating);
        }
    }
    public void receiveXP(int xpReceived) {
        currentXP= currentXP+xpReceived;
        while ((currentXP%10)==0) {
            currentLevel++;
            hitPointsMax+=5;
            hitPointsRemaining=hitPointsMax;
        
        }
    }
    public void useHealingPotion() {
        if (healingPotions>0) {
            hitPointsRemaining=hitPointsMax;
            --healingPotions;
        }
    }
}