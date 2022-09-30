package com.javaPractice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FootballPlayer joe =new FootballPlayer("joe");
        BaseballPlayer pat =new BaseballPlayer("pat");
        SoccerPlayer bechkam =new SoccerPlayer("sue");

         Team<FootballPlayer> adelaideCrows = new Team<>("adelaide Crows");
         adelaideCrows.addPlayer(joe);
        System.out.println(adelaideCrows.numberOfPlyers());

        Team<BaseballPlayer> adelaideeCrows = new Team<>("chicago Crows");
        adelaideeCrows.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this wont work");
        brokenTeam.addPlayer(bechkam);

        Team<FootballPlayer> melnorne =new Team<>("meloborne");
        FootballPlayer banks =new FootballPlayer("goardon");
        melnorne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("hawthorn");
        Team<FootballPlayer> fremantel = new Team<>("fremantel");
        hawthorn.matchResult(fremantel,1,0);
        hawthorn.matchResult(adelaideCrows,3,9);
        adelaideCrows.matchResult(fremantel,2,1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName()+""+adelaideCrows.ranking());
        System.out.println(melnorne.getName()+""+melnorne.ranking());
        System.out.println(fremantel.getName()+""+fremantel.ranking());
        System.out.println(hawthorn.getName()+""+hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melnorne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melnorne.compareTo(fremantel));


    }
}
