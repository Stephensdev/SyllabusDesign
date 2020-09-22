package com.starlabs.syllabusdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class LatestItemAdapter extends RecyclerView.Adapter<LatestItemAdapter.ViewHolder> {
    List<Getter_Item> productGetters;
    private final Context context;

    public LatestItemAdapter(List<Getter_Item> paramList, Context context) {
        this.productGetters = paramList;
        this.context = context;
    }

    public int getItemCount() {
        return productGetters.size();
    }

    public void onAttachedToRecyclerView(RecyclerView paramRecyclerView) {
        super.onAttachedToRecyclerView(paramRecyclerView);
    }

    public void onBindViewHolder(final ViewHolder paramViewHolder, int paramInt) {
        paramViewHolder.textViewtie.setText(productGetters.get(paramInt).getEventtittle());
        paramViewHolder.textViewEvents.setText(productGetters.get(paramInt).getDetails());
        paramViewHolder.textViewDate.setText(productGetters.get(paramInt).getPosteddate());
        paramViewHolder.cardevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Picasso.get().load(productGetters.get(paramInt).getPicture()).into(paramViewHolder.imageViewEve);

    }

    public ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt) {
        return new ViewHolder(LayoutInflater.from(paramViewGroup.getContext()).inflate(R.layout.row_item1, paramViewGroup, false));
    }
//make reference of xml element from cardview

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardevent;
        TextView textViewtie;
        TextView textViewEvents;
        TextView textViewDate;
        TextView textViewReadmore;
        ImageView imageViewEve;

        ViewHolder(View paramView) {
            super(paramView);
            cardevent = paramView.findViewById(R.id.cardevent);
            textViewtie = paramView.findViewById(R.id.textViewtie);
            textViewEvents = paramView.findViewById(R.id.textViewEvents);
            textViewDate = paramView.findViewById(R.id.textViewDate);
            textViewReadmore = paramView.findViewById(R.id.textViewReadmore);
            imageViewEve = paramView.findViewById(R.id.imageView);


        }
    }
}

