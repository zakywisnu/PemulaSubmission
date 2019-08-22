package com.example.zakywisnu.myapplicationdicoding;

import java.util.ArrayList;

public class ClubData {
    public static String[][] data = new String[][]{
            {"Arsenal","England","Premier League","https://upload.wikimedia.org/wikipedia/hif/8/82/Arsenal_FC.png"},
            {"Chelsea","England","Premier League","https://worldsportlogos.com/wp-content/uploads/2018/01/Chelsea-logo.png"},
            {"Manchester United","England","Premier League","https://logos-download.com/wp-content/uploads/2016/05/Manchester_United_logo_logotype_crest.png"},
            {"Barcelona","Spain","La Liga","https://logos-download.com/wp-content/uploads/2016/05/FC_Barcelona_logo_logotipo_crest.png"},
            {"Real Madrid","Spain","La Liga","https://worldsportlogos.com/wp-content/uploads/2018/01/Real-Madrid-logo.png"},
            {"Bayern Munich","Germany","Bundesliga","https://worldsportlogos.com/wp-content/uploads/2018/01/FC-Bayern-M%C3%BCnchen-logo.png"},
            {"BVB Dortmund","Germany","Bundesliga","https://1.bp.blogspot.com/-mAaixeniGHU/U_X9nhyTmPI/AAAAAAAADoM/qDgX2r94R4Q/s1600/Logo%2BBorussia%2BDortmund.png"},
            {"Liverpool","England","Premier League","https://worldsportlogos.com/wp-content/uploads/2018/01/Liverpool-logo.png"},
            {"Napoli","Italy","Serie A","https://1.bp.blogspot.com/-doVmHM3E-4c/U_YWEGynuWI/AAAAAAAADr0/b6OugFCkk0w/s1600/Logo%2BNapoli.png"},
            {"Juventus","Italy","Serie A","https://3.bp.blogspot.com/-lSIVSBSZ8uw/U_YUzKUvsrI/AAAAAAAADrc/ajVh4slvfcc/s1600/Logo%2BJuventus.png"}
    };
    public static ArrayList<Club> getListData(){
        ArrayList<Club> list = new ArrayList<>();
        for (String[] myData : data){
            Club club = new Club();
            club.setName(myData[0]);
            club.setFrom(myData[1]);
            club.setLeague(myData[2]);
            club.setPhoto(myData[3]);

            list.add(club);
//            club.setDescription(myData[4]);
        }
        return list;
    }
}
