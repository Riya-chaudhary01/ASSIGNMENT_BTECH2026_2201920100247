import java.io.*;
import java.util.*;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}

public class Solution {

    public static void main(String[] args) {
        Sports sport = new Sports();
        Soccer socer = new Soccer();
        System.out.println(sport.getName());
        sport.getNumberOfTeamMembers();
        System.out.println(socer.getName());
        socer.getNumberOfTeamMembers();
    }
}
