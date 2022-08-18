package com.example.adoma.view.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adoma.R;
import com.example.adoma.service.model.Customer;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {
    private List<Customer> customerList;

    public CustomerAdapter(List<Customer> list){
        this.customerList = list;
    }

    public void loadNewData(List<Customer> list){
        customerList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.browse_customer, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(customerList == null || customerList.size() == 0){
            // when data is not available
        } else {
            Customer customer = customerList.get(position);
            holder.customerName.setText(customer.getFirstname());
            holder.customerAccNo.setText(customer.getAccNo());
            holder.customerPhone.setText(customer.getPhone());
            holder.customerRouterNo.setText(customer.getRouterNo());
        }
    }

    @Override
    public int getItemCount() {
        return customerList != null && customerList.size() != 0 ? customerList.size() : 0;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView customerName;
        TextView customerAccNo;
        TextView customerPhone;
        TextView customerRouterNo;
        ViewHolder(View view){
            super(view);
          this.customerName = view.findViewById(R.id.customer_name);
          this.customerAccNo = view.findViewById(R.id.customer_acc_no);
          this.customerPhone = view.findViewById(R.id.customer_phone);
          this.customerRouterNo = view.findViewById(R.id.customer_router_no);
        }
    }
}
