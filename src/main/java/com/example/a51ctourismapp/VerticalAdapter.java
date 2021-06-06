package com.example.a51ctourismapp;

import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

        import java.util.List;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder> {
    private List<Places> verticalPlacesList;
    private Context context;

    public VerticalAdapter(List<Places> verticalPlacesList, Context context) {
        this.verticalPlacesList = verticalPlacesList;
        this.context = context;
    }

    @NonNull
    @Override
    public VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.vertical_view, parent, false);
        return new VerticalViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalViewHolder holder, int position) {
        holder.placesImageView.setImageResource(verticalPlacesList.get(position).getImage());
        holder.placeName.setText(verticalPlacesList.get(position).getPlaceName());
        holder.placeDescription.setText(verticalPlacesList.get(position).getPlaceDescription());
        final Places location = verticalPlacesList.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(location.getPlaceName() == "Melbourne")
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    MelbourneFragment melbourneFragment = new MelbourneFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, melbourneFragment).addToBackStack(null).commit();
                }
                else if(location.getPlaceName() == "Bangkok")
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    BangkokFragment bangkokFragment = new BangkokFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, bangkokFragment).addToBackStack(null).commit();
                }

                else if(location.getPlaceName() == "Karachi")
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    KarachiFragment karachiFragment = new KarachiFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, karachiFragment).addToBackStack(null).commit();
                }
                else if(location.getPlaceName() == "Tokyo")
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    TokyoFragment tokyoFragment = new TokyoFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, tokyoFragment).addToBackStack(null).commit();
                }
                else if(location.getPlaceName() == "Kathmandu")
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    KathmanduFragment kathmanduFragment = new KathmanduFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, kathmanduFragment).addToBackStack(null).commit();
                }
                else if(location.getPlaceName() == "Venice")
                {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    VeniceFragment veniceFragment = new VeniceFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, veniceFragment).addToBackStack(null).commit();
                }
                else
                {
                    Toast.makeText(context, location.getPlaceName(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    @Override
    public int getItemCount() {
        return verticalPlacesList.size();
    }

    public class VerticalViewHolder extends RecyclerView.ViewHolder {
        public ImageView placesImageView;
        public TextView placeName;
        public TextView placeDescription;
        public VerticalViewHolder(@NonNull View itemView) {
            super(itemView);
            placesImageView = itemView.findViewById(R.id.verticalImageView);
            placeName = itemView.findViewById(R.id.placeNameTextView);
            placeDescription = itemView.findViewById(R.id.placeInformationTextView);
        }
    }
}