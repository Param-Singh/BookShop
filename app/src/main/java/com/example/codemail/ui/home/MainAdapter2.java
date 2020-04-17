package com.example.codemail.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.codemail.R;

import java.util.ArrayList;

public class MainAdapter2 extends RecyclerView.Adapter<MainAdapter2.ViewHolder> {
    ArrayList<MainModel2> mainModel2s;
    Context context2;

    public MainAdapter2(Context context2, ArrayList<MainModel2> mainModel2s)
    {
        this.context2 = context2;
        this.mainModel2s = mainModel2s;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_itemm,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(mainModel2s.get(position).getLangLogo());
        holder.textView.setText(mainModel2s.get(position).getLangName());
    }

    @Override
    public int getItemCount() {
        return mainModel2s.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view2);
            textView = itemView.findViewById(R.id.text_view2);
        }
    }
}
