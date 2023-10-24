/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.controller;

public class Territory {
    private String name;
    private int total;

    public Territory(){}

    public String getName(){return name;}

    public int getTotal() {
        return total;
    }

    public String setName(String newName){return this.name = newName;}

    public int setTotal(int newTotal){return this.total = newTotal;}
}
