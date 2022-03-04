package MatchFixture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuildMatches {

    List<String> teamList;

    BuildMatches(){
        teamList = new ArrayList<>();
    }
    BuildMatches(List<String> teams){
        this.teamList = teams;
    }

    public void addTeam(String teamName){
        teamList.add(teamName);
    }

    public void createMatch(){
        int size1 = teamList.size();
        if(size1 % 2 == 1){
            teamList.add("Bay");
        }

        List<String> round = new ArrayList<>();
        for(int i = 0 ; i < teamList.size() ; i++ ) {
            for (int k = 0; k < teamList.size(); k++) {
                if (k == i) continue;
                String match = teamList.get(i) + " vs " + teamList.get(k);
                round.add(match);
            }
        }

        System.out.println("Takimlar ");
        for(String team : teamList ){
            if(!team.equals("Bay") )
                System.out.println("-"+ " " + team);
        }

        int plus = teamList.size();
        Collections.shuffle(round);
        for(int i = 0 ; i < teamList.size() ; i++ ){

            System.out.println();
            System.out.println("Round "+ (i+1));
            System.out.println(round.get(i));
            System.out.println(round.get((i+plus) % round.size()) );
            System.out.println(round.get(((i+plus*2) % round.size())));
        }

        teamList.remove("Bay");
    }
}
