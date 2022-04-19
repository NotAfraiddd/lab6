package com.example.lab3_c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewShoesAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Shoes> shoes;
    private int idLayout;

    public ListViewShoesAdapter(Context context) {
        this.context = context;
    }

    public ListViewShoesAdapter(Context context, ArrayList<Shoes> shoes, int idLayout) {
        this.context = context;
        this.shoes = shoes;
        this.idLayout = idLayout;
    }

    @Override
    public int getCount() {
        return shoes.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout,viewGroup,false);
        TextView name = view.findViewById(R.id.avatar_id);

        return view;
    }
}
