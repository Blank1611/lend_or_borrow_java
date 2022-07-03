package com.example.lend_or_borrow.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.lend_or_borrow.MainActivity;
import com.example.lend_or_borrow.Model.LendOrBorrowModel;
import com.example.lend_or_borrow.R;

import java.util.List;

public class LendOrBorrowAdapter extends RecyclerView.Adapter<LendOrBorrowAdapter.ViewHolder> {

    private List<LendOrBorrowModel> lendorborrowList;
    private MainActivity activity;

    public LendOrBorrowAdapter(MainActivity activity){
        this.activity = activity;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_layout, parent, false);
        return new ViewHolder(itemView);
    }

    public void onBindViewHolder(ViewHolder holder, int position){
        LendOrBorrowModel item = lendorborrowList.get(position);
        holder.name.setText(item.getName());
        holder.amount.setText(item.getAmount());
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView amount;

        ViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.name);
            amount = view.findViewById(R.id.amount);
        }
    }
}
