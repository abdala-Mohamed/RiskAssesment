/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agents;

import java.awt.Color;
import java.util.ArrayList;
import risk.Territory;

/**
 *
 * @author Abd El Rahman
 */
public class Passive extends Agent{

    public Passive(Color color) {
        super(color);
    }
    
    @Override
    public boolean takeTurn(){
        super.takeTurn();
        return (this.deployTroops() && this.attack());
    }

    @Override
    protected boolean deployTroops() {
        Territory minTerritory = super.myTerritories.get(0);
        int min = minTerritory.getTroops();

        for (Territory t : myTerritories) {
            if (t.getTroops() < min) {
                min = t.getTroops();
                minTerritory = t;
            }
        }
        minTerritory.setTroops(minTerritory.getTroops() + freeTroops);

        return true;
    }
    
    @Override
    protected boolean attack(){
        return true;
    }

}
