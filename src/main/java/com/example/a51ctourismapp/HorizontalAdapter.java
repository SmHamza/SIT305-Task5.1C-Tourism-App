package com.example.a51ctourismapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {
    private List<horizontalPlaces> horizontalPlacesList;
    private Context context;

    public HorizontalAdapter(List<horizontalPlaces> horizontalPlacesList, Context context) {
        this.horizontalPlacesList = horizontalPlacesList;
        this.context = context;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.horizontal_view, parent, false);
        return new HorizontalViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
        holder.placesImageView.setImageResource(horizontalPlacesList.get(position).getImage());
        final horizontalPlaces location = horizontalPlacesList.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(location.getId() == 0)
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    MelbourneFragment melbourneFragment = new MelbourneFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, melbourneFragment).addToBackStack(null).commit();
                }
                else if(location.getId() == 1)
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    BangkokFragment bangkokFragment = new BangkokFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, bangkokFragment).addToBackStack(null).commit();
                }
                else if(location.getId() == 2)
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    KarachiFragment karachiFragment = new KarachiFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, karachiFragment).addToBackStack(null).commit();
                }
                else if(location.getId() == 3)
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    TokyoFragment tokyoFragment = new TokyoFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, tokyoFragment).addToBackStack(null).commit();
                }
                else if(location.getId() == 4)
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    KathmanduFragment kathmanduFragment = new KathmanduFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, kathmanduFragment).addToBackStack(null).commit();
                }
                else if(location.getId() == 5)
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    VeniceFragment veniceFragment = new VeniceFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, veniceFragment).addToBackStack(null).commit();
                }
                else
                {
                    Toast.makeText(context, location.getId(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return horizontalPlacesList.size();
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder {
        public ImageView placesImageView;
        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            placesImageView = itemView.findViewById(R.id.horizontalImageView);
        }
    }
}
