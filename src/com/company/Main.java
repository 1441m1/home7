package com.company;

public class Main {

    public static void main(String[] args) {
        warrior warrior = new warrior();
        warrior.applySuperAbility();

        magic magic = new magic();
        magic.applySuperAbility();

        medic medic = new medic();
        medic.applySuperAbility();
    }
}
