import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> ranking = new HashMap<>();
        for(int i=0; i<players.length; i++){
            ranking.put(players[i], i);
        }
        
        for(String player : callings){
            int Rank = ranking.get(player);
            String before = players[Rank-1];
            
            players[Rank-1] = players[Rank];
            players[Rank] = before;
            
            ranking.put(player, Rank-1);
            ranking.put(before, Rank);
        }
        
        return players;
    }
}