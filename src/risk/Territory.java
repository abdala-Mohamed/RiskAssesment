/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package risk;

import Agents.Agent;

/**
 *
 * @author Abd El Rahman
 */
public class Territory implements Comparable {

    private final int id;
    private int troops;
    private Agent holder;

    public Territory(int id) {
        this.id = id;
        this.troops = 0;
    }

    public int getTroops() {
        return troops;
    }

    public void setTroops(int numOfSoldier) {
        this.troops = numOfSoldier;
    }

    public Agent getHolder() {
        return holder;
    }

    public void setHolder(Agent holder) {
        this.holder = holder;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object me) {
        if (me.getClass() != Territory.class) {
            return false;
        }

        return (this.id == ((Territory) me).id);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public int compareTo(Object o) {
        if (this.troops == ((Territory) o).troops) {
            return 0;
        } else if (this.troops > ((Territory) o).troops) {
            return 1;
        } else {
            return -1;
        }
    }
}
