package com.example.zakywisnu.myapplicationdicoding;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListClubAdapter extends RecyclerView.Adapter<ListClubAdapter.ListClubViewHolder> {
    private List<Club> list;

    public ListClubAdapter(List<Club> list){
        this.list = list;
    }

    @Override
    public ListClubViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new ListClubViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_club,parent,false)
        );
    }

    @Override
    public void onBindViewHolder(ListClubViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ListClubViewHolder extends RecyclerView.ViewHolder {
        ImageView picture;
        TextView name, from, league, descripton;
        public ListClubViewHolder(View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.img_photo_club);
            name = itemView.findViewById(R.id.item_club_name);
            from = itemView.findViewById(R.id.item_club_from);
            league = itemView.findViewById(R.id.item_club_league);
//            descripton = itemView.findViewById(R.id.detail_description);
        }
        public void bind(final Club item){
            picture.setImageResource(item.getPicture());
            name.setText(item.getName());
            from.setText(item.getFrom());
            league.setText(item.getLeague());
//            descripton.setText(item.getDescription());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle bundle = new Bundle();
                    bundle.putString("name",item.getName());
                    bundle.putString("from",item.getFrom());
                    bundle.putString("league",item.getLeague());
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra(DetailActivity.PHOTO, item.getPhoto());
                    intent.putExtra(DetailActivity.DESCRIPTION, item.getDescription());
                    intent.putExtras(bundle);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
