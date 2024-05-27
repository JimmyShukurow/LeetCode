package io.smartir.DesignPatterns.StrategyPattern.characterExample;

public class Main {
    public static void main(String[] args) {
        Character kingCharacter = new King();
        kingCharacter.display();
        kingCharacter.fight();
        Character queenCharacter = new Queen();
        queenCharacter.display();
        queenCharacter.fight();
        Character knight = new Knight();
        knight.display();
        knight.fight();
        Character troll = new Troll();
        troll.display();
        troll.fight();
    }
}
