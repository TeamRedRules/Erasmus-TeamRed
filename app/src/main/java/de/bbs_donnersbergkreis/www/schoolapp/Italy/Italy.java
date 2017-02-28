package de.bbs_donnersbergkreis.www.schoolapp.Italy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_location;
import de.bbs_donnersbergkreis.www.schoolapp.R;



public class Italy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);


    }


    public void button_Location_it(View view) {
        Intent intent = new Intent(this, IT_location.class);
        startActivity(intent);
    }

    public void btn_history(View view) {
        Intent intent = new Intent(this, IT_history.class);
        startActivity(intent);

    }

    public void btn_pictures(View view) {
        Intent intent = new Intent(this,IT_pictures.class);
        startActivity(intent);


    }

    public void btn_list(View view) {
        Intent intent = new Intent(this, IT_list.class);
        startActivity(intent);
    }

    public void btn_discuss(View view) {
        Intent intent = new Intent(this, IT_discuss.class);
        startActivity(intent);
    }

    public void btn_meal(View view) {
        Intent intent = new Intent(this, IT_Meal.class);
        startActivity(intent);
    }

    public void btn_events(View view) {
        Intent intent = new Intent(this, IT_events.class);
        startActivity(intent);
    }
}
