package com.example.adoma.view.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adoma.R;
import com.example.adoma.service.model.Complain;

import java.util.List;

public class RecordsAdapter extends RecyclerView.Adapter<RecordsAdapter.ViewHolder> {
    private List<Complain> complainList;

    public RecordsAdapter(List<Complain> complainList) {
        this.complainList = complainList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.browse_complain, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(complainList == null || complainList.size() == 0){
            // when data is not available
        } else {
            Complain complain = complainList.get(position);
            holder.content.setText(complain.getContent());
            holder.complainState.setText(complain.getStatus());
            holder.complainDate.setText(complain.getDate());
        }
    }

    @Override
    public int getItemCount() {
        return complainList != null && complainList.size() != 0 ? complainList.size() : 0;
    }

    public void loadNewData(List<Complain> list){
        complainList = list;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView content;
        TextView complainDate;
        TextView complainTime;
        TextView complainState;
        ViewHolder(View view){
            super(view);
            this.content = view.findViewById(R.id.content);
            this.complainDate = view.findViewById(R.id.complainDate);
            this.complainState = view.findViewById(R.id.complainState);
            this.complainTime = view.findViewById(R.id.complainTime);
        }
    }



}

