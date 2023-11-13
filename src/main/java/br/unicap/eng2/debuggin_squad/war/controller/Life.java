package br.unicap.eng2.debuggin_squad.war.controller;

public class Life {
    private List<Territory> conqueredTerritories;
    private Life life;
    private String id;

    public static boolean isAlive(){
        if (conqueredTerritories <= 0){
            return true;
        } else {
            return false;
        }
    }
}
