package com.example.football;

import java.util.ArrayList;

public class FootballData {
    private  static String[] title = new String[]{"Arsenal","Aston Villa","Chelsea","Everton","Liverpool","Manchester United","Manchester City","New Castle United","Tottenham Hotspur","Westham United"};
    private static  int[] thumbnail = new int[]{R.drawable.arsenal,R.drawable.aston_villa,R.drawable.chelsea,R.drawable.everton,R.drawable.liverpool,R.drawable.mu,R.drawable.man_city,R.drawable.newcastle_united,R.drawable.tottenham,R.drawable.westham};

    public static ArrayList<FootballModel> getListData(){
        FootballModel footballModel = null;
        ArrayList<FootballModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++){
            footballModel = new FootballModel();
            footballModel.setLambangTim(thumbnail[i]);
            footballModel.setNamaTim(title[i]);
            list.add(footballModel);
        }
        return list;
    }
}
