/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agents;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import risk.Territory;
import risk.Map;


/**
 *
 * @author Abd El Rahman
 */
public abstract class Agent {
    
    protected final Color color;
    protected int freeTroops;
    protected final ArrayList<Territory> myTerritories;
    protected final ArrayList<Territory> enemyTerritories;
    
    protected final Map map;
    
    public Agent(Color color) {
        this.color = color;
        this.freeTroops = 20;
        this.myTerritories = new ArrayList<>();
        this.enemyTerritories = new ArrayList<>();
        this.map = Map.getInstance();
    }
    
    public boolean takeTurn(){
        freeTroops = Integer.max(3, myTerritories.size()/3);
        return false;
    }

    protected boolean deployTroops() {
        return false;
    }
    
    protected boolean attack(){
        return false;
    }
    
    // get Attacking Territorries 
    protected ArrayList<Territory> getAttackingTerritories(){
        ArrayList<Territory> canAttack = new ArrayList<>();
        for (Territory t : myTerritories){
            if (t.getTroops() > 1){
                canAttack.add(t);
            }
        }
        return canAttack;
    }
    
    protected Set<Territory> getAttackableTerritories(ArrayList<Territory> canAttack){
        Set<Territory> enemyTerritories = new HashSet<>();
        for (Territory t : canAttack){
           for (Territory e : map.getMap()[t.getId()]){
               if (!this.myTerritories.contains(e))
                   enemyTerritories.add(e);
           }
        }
        return enemyTerritories;
    }
    
    
    
}
