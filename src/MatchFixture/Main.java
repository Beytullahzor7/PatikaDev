package MatchFixture;

public class Main {
    public static void main(String[] args) {
        BuildMatches buildMatches = new BuildMatches();
        buildMatches.addTeam("Galatasaray");
        buildMatches.addTeam("Fenerbahce");
        buildMatches.addTeam("Besiktas");
        buildMatches.addTeam("Samsunspor");
        buildMatches.addTeam("Basaksehir");
        buildMatches.addTeam("Real Madrid");
        buildMatches.createMatch();


    }
}
