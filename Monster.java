/*
* Names: Aneeq Altaf
* netID: aaltaf4
* G#: 01496340
* Lecture section: 004
* Lab section: 205
*/

public class Monster {
        public String type;
        public int hitPoints;
        public int attackRating;
        public int xpValue;
        public int goldValue;
        public Monster(String atype, int hp, int attackR, int xp, int gold) {
            type=atype;
            hitPoints=hp;
            attackRating=attackR;
            xpValue=xp;
            goldValue=gold;
        }
        public Monster() {
            type="goblin";
            hitPoints=10;
            attackRating=1;
            xpValue=1;
            goldValue=1;

        }
        public boolean isDefeated() {
            if (hitPoints==0) {
                return true;
            }
            else {
                return false;
            }

        }
        public void receiveAttack(int incAttack) {

            hitPoints=hitPoints-incAttack;
        }

}