package com.example.adoma.view.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adoma.R;
import com.example.adoma.service.model.Agent;

import java.util.List;

public class AgentAdapter extends RecyclerView.Adapter<AgentAdapter.ViewHolder> {
    private List<Agent> agentList;

    public AgentAdapter(List<Agent> agentList) {
        this.agentList = agentList;
    }


    public void loadNewData(List<Agent> list){
        agentList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.browse_agent, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(agentList == null || agentList.size() == 0){
            // when data is not available
        } else {
            Agent agent = agentList.get(position);
            holder.agentName.setText(agent.getFirstname());
            holder.agentPhone.setText(agent.getPhone());
            holder.agentType.setText(agent.getType());
            holder.agentEmail.setText(agent.getEmail());
        }
    }

    @Override
    public int getItemCount() {
        return agentList != null && agentList.size() != 0 ? agentList.size() : 0 ;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView agentName;
        TextView agentEmail;
        TextView agentPhone;
        TextView agentType;
        ViewHolder(View view){
            super(view);
            this.agentName = view.findViewById(R.id.agent_name);
            this.agentEmail = view.findViewById(R.id.agent_email);
            this.agentPhone = view.findViewById(R.id.agent_phone);
            this.agentType = view.findViewById(R.id.agent_type);
        }

    }


}
