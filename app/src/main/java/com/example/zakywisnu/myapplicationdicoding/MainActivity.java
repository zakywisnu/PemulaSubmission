package com.example.zakywisnu.myapplicationdicoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvClub;
    private List<Club> list;
    private RecyclerView.ItemDecoration decoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupEnv();
        setupList();
        loadDataDummy();
    }
    private void setupEnv() {
        rvClub = findViewById(R.id.rv_club);
        list = new ArrayList<>();
        decoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
    }
    private void setupList() {
        ListClubAdapter adapter = new ListClubAdapter(list);
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        rvClub.addItemDecoration(decoration);
        rvClub.setAdapter(adapter);
    }

    private void loadDataDummy() {
        list.add(new Club(
                R.drawable.arsenal,
                "Arsenal",
                "England",
                "Premier League",
                "Arsenal Football Club is a professional football club based in Islington, London, England, that plays in the Premier League, the top flight of English football. The Club has won 13 League titles, a record 13 FA Cups, 2 League Cups, 15 FA Community Shields, 1 League Centenary Trophy, 1 UEFA Cup Winners' Cup and 1 Inter-Cities Fairs Cup.",
                "https://upload.wikimedia.org/wikipedia/hif/8/82/Arsenal_FC.png"
        ));
        list.add(new Club(
                R.drawable.barcelona,
                "Barcelona",
                "Spain",
                "La Liga",
                "Founded in 1899 by a group of Swiss, Spanish, English, and Catalan footballers led by Joan Gamper, the club has become a symbol of Catalan culture and Catalanism, hence the motto \"Més que un club\" (\"More than a club\"). Unlike many other football clubs, the supporters own and operate Barcelona. It is the fourth-most valuable sports team in the world, worth $4.06 billion, and the world's second-richest football club in terms of revenue, with an annual turnover of €690.4 million. The official Barcelona anthem is the \"Cant del Barça\", written by Jaume Picas and Josep Maria Espinàs.",
                "https://logos-download.com/wp-content/uploads/2016/05/FC_Barcelona_logo_logotipo_crest.png"
        ));
        list.add(new Club(
                R.drawable.chelsea,
                "Chelsea",
                "England",
                "Premier League",
                "Chelsea Football Club is an English professional football club. Founded in 1905, they compete in the Premier League, the top division of English football. Chelsea are among England's most successful clubs, having won over thirty competitive honours, including 6 top-flight titles, 8 FA Cups, 5 League Cups, 2 UEFA Europa Leagues, 2 UEFA Cup Winners' Cups, 1 UEFA Champions League, and 1 UEFA Super Cup. Their home ground is Stamford Bridge in Fulham, London.",
                "https://worldsportlogos.com/wp-content/uploads/2018/01/Chelsea-logo.png"
        ));
        list.add(new Club(
                R.drawable.dortmund,
                "BVB Dortmund",
                "Germany",
                "Bundesliga",
                "Ballspielverein Borussia 09 e.V. Dortmund, commonly known as Borussia Dortmund [boˈʁʊsi̯aː ˈdɔɐ̯tmʊnt], BVB, or simply Dortmund, is a German sports club based in Dortmund, North Rhine-Westphalia. Founded in 1909 by eighteen football players from Dortmund, the football team is part of a large membership-based sports club with more than 145,000 members, making BVB the second largest sports club by membership in Germany. Dortmund plays in the Bundesliga, the top tier of the German football league system.",
                "https://1.bp.blogspot.com/-mAaixeniGHU/U_X9nhyTmPI/AAAAAAAADoM/qDgX2r94R4Q/s1600/Logo%2BBorussia%2BDortmund.png"
                ));
        list.add(new Club(
                R.drawable.juventus,
                "Juventus",
                "Italy",
                "Serie A",
                "Juventus Football Club (from Latin: iuventūs, \"youth\"; Italian pronunciation: [juˈvɛntus]), colloquially known as Juve (pronounced [ˈjuːve]), is an Italian professional football club based in Turin, Piedmont. Founded in 1897 by a group of Torinese students, the club has worn a black and white striped home kit since 1903 and has played home matches in different grounds around its city, the latest being the 41,507-capacity Juventus Stadium.",
                "https://3.bp.blogspot.com/-lSIVSBSZ8uw/U_YUzKUvsrI/AAAAAAAADrc/ajVh4slvfcc/s1600/Logo%2BJuventus.png"
        ));
        list.add(new Club(
                R.drawable.liverpool,
                "Liverpool",
                "England",
                "Premier League",
                "Liverpool Football Club is a professional football club in Liverpool, England, that competes in the Premier League, the top tier of English football. The club has won six European Cups, more than any other English club, three UEFA Cups and four UEFA Super Cups, also English records, eighteen League titles, seven FA Cups, a record eight League Cups and fifteen FA Community Shields.",
                "https://worldsportlogos.com/wp-content/uploads/2018/01/Liverpool-logo.png"
        ));
        list.add(new Club(
                R.drawable.madrid,
                "Real Madrid",
                "Spain",
                "La Liga",
                "Founded on 6 March 1902 as the Madrid Football Club, the club has traditionally worn a white home kit since inception. The word real is Spanish for \"royal\" and was bestowed to the club by King Alfonso XIII in 1920 together with the royal crown in the emblem. The team has played its home matches in the 81,044-capacity Santiago Bernabéu Stadium in downtown Madrid since 1947. Unlike most European sporting entities, Real Madrid's members (socios) have owned and operated the club throughout its history.",
                "https://worldsportlogos.com/wp-content/uploads/2018/01/Real-Madrid-logo.png"
        ));
        list.add(new Club(
                R.drawable.munchen,
                "Bayern Munich",
                "Germany",
                "Bundesliga",
                "Fußball-Club Bayern München e.V., commonly known as FC Bayern München (German pronunciation: [ʔɛf tseː ˈbaɪɐn ˈmʏnçn̩]), FCB, Bayern Munich, or FC Bayern, is a German sports club based in Munich, Bavaria. It is best known for its professional football team, which plays in the Bundesliga, the top tier of the German football league system, and is the most successful club in German football history, having won a record 29 national titles and 19 national cups.",
                "https://worldsportlogos.com/wp-content/uploads/2018/01/FC-Bayern-M%C3%BCnchen-logo.png"
        ));
        list.add(new Club(
                R.drawable.napoli,
                "Napoli",
                "Italy",
                "Serie A",
                "Società Sportiva Calcio Napoli, commonly referred to as Napoli (pronounced [ˈnaːpoli]), is an Italian professional football club based in Naples, Campania that plays in Serie A, the top flight of Italian football. The club have won two league titles, five Coppa Italias, two Supercoppa Italiana titles, and one UEFA Cup.",
                "https://1.bp.blogspot.com/-doVmHM3E-4c/U_YWEGynuWI/AAAAAAAADr0/b6OugFCkk0w/s1600/Logo%2BNapoli.png"
        ));
        list.add(new Club(
                R.drawable.manchester,
                "Manchester United",
                "England",
                "Premier League",
                "Manchester United Football Club is a professional football club based in Old Trafford, Greater Manchester, England, that competes in the Premier League, the top flight of English football. Nicknamed \"the Red Devils\", the club was founded as Newton Heath LYR Football Club in 1878, changed its name to Manchester United in 1902 and moved to its current stadium, Old Trafford, in 1910.",
                "https://logos-download.com/wp-content/uploads/2016/05/Manchester_United_logo_logotype_crest.png"
        ));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedItem) {
        switch (selectedItem){
            case R.id.item_about:
                startActivity(new Intent(this, AboutActivity.class));
                break;
        }
    }
}
