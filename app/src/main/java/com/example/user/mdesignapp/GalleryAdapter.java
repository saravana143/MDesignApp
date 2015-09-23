package com.example.user.mdesignapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Saravana Attiyappagounder on 15/09/2015.
 */
public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder>{

    private String[] cardNames;

    public GalleryAdapter(String[] cardNames) {
        this.cardNames = cardNames;
    }

    @Override
    public GalleryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int pos) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gallery_card_view_item, parent, false);

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(GalleryAdapter.ViewHolder viewHolder, int pos) {
        viewHolder.cardName.setText(cardNames[pos]);
    }

    @Override
    public int getItemCount() {
        return cardNames.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView cardName;

        public ViewHolder(View itemView) {
            super(itemView);

            cardName = (TextView) itemView.findViewById(R.id.info_text);
        }
    }
}
