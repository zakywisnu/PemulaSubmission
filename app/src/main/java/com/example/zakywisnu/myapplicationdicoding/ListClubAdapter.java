package com.example.zakywisnu.myapplicationdicoding;

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

public class ListClubAdapter extends RecyclerView.Adapter<ListClubAdapter.ListClubViewHolder> {
    private ArrayList<Club> listClub;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }



    public ListClubAdapter(ArrayList<Club> list){
        this.listClub = list;
    }

    @NonNull
    @Override
    public ListClubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_club, parent, false);
        return new ListClubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListClubViewHolder holder, int position) {
        Club club = listClub.get(position);

        Glide.with(holder.itemView.getContext())
                .load(club.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(club.getName());
        holder.tvFrom.setText(club.getFrom());
        holder.tvLeague.setText(club.getLeague());
//        holder.tvDescription.setText(club.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listClub.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listClub.size();
    }

    public class ListClubViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom, tvLeague, tvDescription;
        public ListClubViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_photo_club);
            tvName = itemView.findViewById(R.id.item_club_name);
            tvFrom = itemView.findViewById(R.id.item_club_from);
            tvLeague = itemView.findViewById(R.id.item_club_league);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Club data);
    }
}
