package br.unicap.eng2.debuggin_squad.war.controller;

import java.util.List;

public class Life {
    private static List<Territory> conqueredTerritories;
    private Life life;
    private String id;

    public static boolean isAlive(){
        return false;
        /*if (conqueredTerritories <= 0){
            return true;
        } else {
            return false;
        }*/
    }

    public static String messageNotImplemented() {
        return null;
    }
}
