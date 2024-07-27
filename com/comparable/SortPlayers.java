package com.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortPlayers {
    public static void main(String[] args) {
        ArrayList<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : ");
        for (Player name : footballTeam) {
            System.out.println(name.getRanking());
        }
        Collections.sort(footballTeam);

        System.out.println("After Sorting : " + footballTeam.toString());

        for (Player name : footballTeam) {
            System.out.println(name.getRanking());
        }
    }
}
