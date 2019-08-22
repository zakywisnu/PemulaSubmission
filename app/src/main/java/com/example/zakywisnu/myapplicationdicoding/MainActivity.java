package com.example.zakywisnu.myapplicationdicoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvClub;
    private ArrayList<Club> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvClub = findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);

        list.addAll(ClubData.getListData());
        showRecyclerList();

        ListClubAdapter listClubAdapter = new ListClubAdapter(list);
        listClubAdapter.setOnItemClickCallback(new ListClubAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Club data) {
                showSelectedClub(data);
            }
        });

    }

    private void showSelectedClub(Club club) {
        Toast.makeText(this,"You Choose" + club.getName(), Toast.LENGTH_SHORT).show();
    }

    private void showRecyclerList() {
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        ListClubAdapter listClubAdapter = new ListClubAdapter(list);
        rvClub.setAdapter(listClubAdapter);
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
                break;
        }
    }
}
