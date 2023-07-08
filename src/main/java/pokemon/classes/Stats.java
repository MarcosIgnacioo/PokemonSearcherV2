package pokemon.classes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Stats {
    int hp;
    int attack;
    int defense;
    int specialAttack;
    int specialDefense;
    int speed;

    public Stats(int hp, int attack, int defense, int specialAttack, int specialDefense, int speed) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }
    public Stats(){

    }
    public Stats(List<Integer> statsNumbers){

        this.hp             = statsNumbers.get(0);
        this.attack         = statsNumbers.get(1);
        this.defense        = statsNumbers.get(2);
        this.specialAttack  = statsNumbers.get(3);
        this.specialDefense = statsNumbers.get(4);
        this.speed          = statsNumbers.get(5);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return
                "HP              : " + hp             + "\n" +
                "ATTACK          : " + attack         + "\n" +
                "DEFENSE         : " + defense        + "\n" +
                "SPECIAL ATTACK  : " + specialAttack  + "\n" +
                "SPECIAL DEFENSE : " + specialDefense + "\n" +
                "SPEED           : " + speed;
    }
}
