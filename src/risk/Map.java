/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package risk;

import java.util.LinkedList;

/**
 *
 * @author Abd El Rahman
 */
public class Map {

    private LinkedList<Territory>[] unitedStates;
    private LinkedList<Territory>[] egypt;
    
    
    private LinkedList<Territory>[] map;
    
    
    private static Map INSTANCE = null;

    private Map() {
        buildStates();
        buildEgypt();
    }

    public static Map getInstance() {
        if (INSTANCE == null) {
                INSTANCE = new Map();
        }

        return INSTANCE;
    }

    private void buildStates() {

        Territory[] states = new Territory[51];

        for (int i = 1; i <= 50; i++) {
            states[i] = new Territory(i);
        }

        unitedStates[1].add(states[2]);
        unitedStates[1].add(states[5]);

        unitedStates[2].add(states[1]);
        unitedStates[2].add(states[3]);
        unitedStates[2].add(states[4]);
        unitedStates[2].add(states[5]);

        unitedStates[3].add(states[2]);
        unitedStates[3].add(states[4]);
        unitedStates[3].add(states[9]);

        unitedStates[4].add(states[2]);
        unitedStates[4].add(states[3]);
        unitedStates[4].add(states[5]);
        unitedStates[4].add(states[8]);
        unitedStates[4].add(states[9]);

        unitedStates[5].add(states[1]);
        unitedStates[5].add(states[2]);
        unitedStates[5].add(states[4]);
        unitedStates[5].add(states[6]);
        unitedStates[5].add(states[7]);
        unitedStates[5].add(states[8]);

        unitedStates[6].add(states[5]);
        unitedStates[6].add(states[7]);
        unitedStates[6].add(states[16]);
        unitedStates[6].add(states[17]);

        unitedStates[7].add(states[5]);
        unitedStates[7].add(states[6]);
        unitedStates[7].add(states[8]);
        unitedStates[7].add(states[10]);
        unitedStates[7].add(states[15]);
        unitedStates[7].add(states[16]);

        unitedStates[8].add(states[4]);
        unitedStates[8].add(states[5]);
        unitedStates[8].add(states[7]);
        unitedStates[8].add(states[9]);
        unitedStates[8].add(states[10]);

        unitedStates[9].add(states[3]);
        unitedStates[9].add(states[4]);
        unitedStates[9].add(states[8]);
        unitedStates[9].add(states[11]);

        unitedStates[10].add(states[7]);
        unitedStates[10].add(states[8]);
        unitedStates[10].add(states[11]);
        unitedStates[10].add(states[13]);
        unitedStates[10].add(states[14]);
        unitedStates[10].add(states[15]);

        unitedStates[11].add(states[9]);
        unitedStates[11].add(states[10]);
        unitedStates[11].add(states[12]);
        unitedStates[11].add(states[13]);

        unitedStates[12].add(states[11]);
        unitedStates[12].add(states[13]);
        unitedStates[12].add(states[21]);
        unitedStates[12].add(states[22]);

        unitedStates[13].add(states[10]);
        unitedStates[13].add(states[11]);
        unitedStates[13].add(states[12]);
        unitedStates[13].add(states[14]);
        unitedStates[13].add(states[20]);
        unitedStates[13].add(states[21]);

        unitedStates[14].add(states[10]);
        unitedStates[14].add(states[13]);
        unitedStates[14].add(states[15]);
        unitedStates[14].add(states[20]);

        unitedStates[15].add(states[7]);
        unitedStates[15].add(states[10]);
        unitedStates[15].add(states[14]);
        unitedStates[15].add(states[16]);
        unitedStates[15].add(states[19]);
        unitedStates[15].add(states[20]);

        unitedStates[16].add(states[6]);
        unitedStates[16].add(states[7]);
        unitedStates[16].add(states[15]);
        unitedStates[16].add(states[17]);
        unitedStates[16].add(states[18]);
        unitedStates[16].add(states[19]);

        unitedStates[17].add(states[6]);
        unitedStates[17].add(states[16]);
        unitedStates[17].add(states[18]);

        unitedStates[18].add(states[16]);
        unitedStates[18].add(states[17]);
        unitedStates[18].add(states[19]);
        unitedStates[18].add(states[34]);

        unitedStates[19].add(states[15]);
        unitedStates[19].add(states[16]);
        unitedStates[19].add(states[18]);
        unitedStates[19].add(states[20]);
        unitedStates[19].add(states[33]);
        unitedStates[19].add(states[34]);

        unitedStates[20].add(states[13]);
        unitedStates[20].add(states[14]);
        unitedStates[20].add(states[15]);
        unitedStates[20].add(states[19]);
        unitedStates[20].add(states[21]);
        unitedStates[20].add(states[31]);
        unitedStates[20].add(states[32]);
        unitedStates[20].add(states[33]);

        unitedStates[21].add(states[12]);
        unitedStates[21].add(states[13]);
        unitedStates[21].add(states[20]);
        unitedStates[21].add(states[22]);
        unitedStates[21].add(states[23]);
        unitedStates[21].add(states[31]);

        unitedStates[22].add(states[12]);
        unitedStates[22].add(states[21]);
        unitedStates[22].add(states[23]);

        unitedStates[23].add(states[21]);
        unitedStates[23].add(states[22]);
        unitedStates[23].add(states[24]);
        unitedStates[23].add(states[31]);

        unitedStates[24].add(states[23]);
        unitedStates[24].add(states[25]);
        unitedStates[24].add(states[26]);
        unitedStates[24].add(states[31]);

        unitedStates[25].add(states[24]);
        unitedStates[25].add(states[26]);
        
        this.map = this.unitedStates;

    }

    private void buildEgypt() {

    }

    public LinkedList<Territory>[] getMap() {
        return map;
    }

}
