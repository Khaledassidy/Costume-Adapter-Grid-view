package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CostumeAddpater extends BaseAdapter {

    private Context context;
    private int resource;
    private ArrayList<Model> arrayList;

    public CostumeAddpater( Context context, int resource,ArrayList<Model> arrayList){
        this.context=context;
        this.resource=resource;
        this.arrayList=arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Model getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addmovie(Model model){
        if(model!=null){
            arrayList.add(model);
            notifyDataSetChanged();
        }
        else{
            Toast.makeText(context, "hi", Toast.LENGTH_SHORT).show();
        }

    }
    public  void deletemoview(int postion){
        arrayList.remove(postion);
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=convertView;
        if(view==null){
            view= LayoutInflater.from(this.context).inflate(this.resource,parent,false);

        }
        ImageView filmimage=view.findViewById(R.id.imagefilm);
        TextView title=view.findViewById(R.id.title);
        TextView score=view.findViewById(R.id.score);
        Model model=getItem(position);
        filmimage.setImageResource(model.getImage_resource());
        title.setText(model.getTitle());
        score.setText(model.getScore());


        return view;
    }
}
