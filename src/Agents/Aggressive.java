/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agents;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import risk.Territory;

/**
 *
 * @author Abd El Rahman
 */
public class Aggressive extends Agent {

    public Aggressive(Color color) {
        super(color);
    }

    @Override
    public boolean takeTurn() {
        super.takeTurn();
        return (this.deployTroops() && this.attack());
    }

    @Override
    protected boolean deployTroops() {
        Territory maxTerritory = super.myTerritories.get(0);
        int max = maxTerritory.getTroops();

        for (Territory t : myTerritories) {
            if (t.getTroops() > max) {
                max = t.getTroops();
                maxTerritory = t;
            }
        }
        maxTerritory.setTroops(maxTerritory.getTroops() + freeTroops);

        return true;
    }

    @Override
    protected boolean attack() {
        Territory[] toArray = (Territory[]) enemyTerritories.toArray();
        Arrays.sort(toArray, Collections.reverseOrder());

        for (Territory t : toArray) {
            for (Territory x : map.getMap()[t.getId()]) {
                if (/* this is attackable*/true) {
                    //Attack
                    return true;
                }
            }
        }

        return false;

    }

}
