package com.example.testactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context context;
    ArrayList<Name> nameList;

    public RecyclerViewAdapter(Context context, ArrayList<Name> nameList) {
        this.context = context;
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // place to inflate the layout and give a look to each of rows
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_recycler_view, parent, false);
        return new RecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        // place to assign the values to each rows
        // based on position
        holder.name.setText(nameList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        // calculate the number of items in the recycler view

        return nameList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // get the views from layout file and assign the variables
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // set the layout view references
            name = itemView.findViewById(R.id.text1);
        }
    }


}
