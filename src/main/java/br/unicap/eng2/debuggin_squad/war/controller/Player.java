/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.controller;

public class Player {
    private String name;
    private String id;

    public Player(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName(){return name;}

    public String getId() {
        return id;
    }

    public String setName(String newName){return this.name = newName;}

    public String setId(String newId){return this.id = newId;}
}
