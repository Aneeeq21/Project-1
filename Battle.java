/*
* Names: Aneeq Altaf
* netID: aaltaf4
* G#: 01496340
* Lecture section: 004
* Lab section: 205
*/
public class Battle {

    public static String fight(Hero h, Monster m) {
        // Loop until either the hero or the monster is defeated
        while (h.hasHPRemaining() && !m.isDefeated()) {
            // Hero attacks the monster
            m.receiveAttack(h.attackRating);
            
            // Monster attacks the hero
            h.receiveAttack(m.attackRating);
            
            // If the hero has no HP remaining, use a healing potion if available
            if (!h.hasHPRemaining()&& h.healingPotions>0) {
                h.useHealingPotion();
            }
        }

        // After the loop, check if the monster was defeated
        if (h.hasHPRemaining() && m.isDefeated()) {
            // Hero wins, process XP and gold
            h.receiveXP(m.xpValue);
            h.healingPotions += m.goldValue / 3;
            return h.name + " has defeated the " + m.type + 
                " earning " + m.goldValue + " gold and " + m.xpValue + " XP leveling up " + 
                (h.currentLevel - 1) + " times.";
        } 
        
        else {
            // Monster wins
            return "The " + m.type + " has defeated " + h.name + ". Game over.";
        }
    }
}