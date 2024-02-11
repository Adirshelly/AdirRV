package com.example.adirshellyrv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CustomeAdapter extends RecyclerView.Adapter<CustomeAdapter.myViewHolder> {

    ArrayList<DataModel> dataset;


    public CustomeAdapter(ArrayList<DataModel> dataSet) {
        this.dataset = dataSet;


    }

    public static class myViewHolder extends RecyclerView.ViewHolder{

        TextView textname;
        TextView textdescription;
        ImageView imageView;

        public myViewHolder(View itemView ){
            super(itemView);


            textname = itemView.findViewById(R.id.textView);
            textdescription = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);




        }




    }



    @NonNull
    @Override
    public CustomeAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, parent,false );
        myViewHolder myVHolder = new myViewHolder(view);

        return myVHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomeAdapter.myViewHolder holder, int position) {

            holder.textname.setText(dataset.get(position).getName());
            holder.textdescription.setText(dataset.get(position).getDescription());
            holder.imageView.setImageResource(dataset.get(position).getImage());






    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
