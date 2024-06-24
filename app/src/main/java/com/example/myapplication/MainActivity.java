package com.example.myapplication;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView Title_app,title_new_movies;
    EditText Search;
    GridView new_movies;

    CostumeAddpater costumeAddpater_newmoview;

    ArrayList<Model> arrayList_newmovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Title_app=findViewById(R.id.title_app);
        title_new_movies=findViewById(R.id.new_movies);
        Search=findViewById(R.id.search);
        new_movies=findViewById(R.id.grid_new_movies);
        arrayList_newmovie=new ArrayList<>();
        costumeAddpater_newmoview=new CostumeAddpater(this,R.layout.model,arrayList_newmovie);

        Model model0=new Model(R.drawable.movie1,"Pirates Of the Caribbean","3");
        Model model1=new Model(R.drawable.movie2,"Pirates Of the Caribbean","3.5");
        Model model2=new Model(R.drawable.move3,"Special 26","4");
        Model model3=new Model(R.drawable.movie4,"JohnWick 2","5");
        Model model4=new Model(R.drawable.movie5,"JohnWick 4","4.8");
        Model model5=new Model(R.drawable.movie6,"Serenity","3.9");
        Model model6=new Model(R.drawable.movie7,"North","4.5");
        costumeAddpater_newmoview.addmovie(model0);
        costumeAddpater_newmoview.addmovie(model1);
        costumeAddpater_newmoview.addmovie(model2);
        costumeAddpater_newmoview.addmovie(model3);
        costumeAddpater_newmoview.addmovie(model4);
        costumeAddpater_newmoview.addmovie(model5);
        costumeAddpater_newmoview.addmovie(model6);

        new_movies.setAdapter(costumeAddpater_newmoview);


    }
}