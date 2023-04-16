package com.example.mypokemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Pokemon> {

    ArrayList<Pokemon> pokemons;


    public MyAdapter(@NonNull Context context, int textViewResourceId, @NonNull ArrayList<Pokemon> objects) {
        super(context, textViewResourceId, objects);
        pokemons = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.grid_view_list, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        Picasso.get().load(pokemons.get(position).getImage()).into(imageView);
        textView.setText(pokemons.get(position).getName());
        return view;
    }
}
