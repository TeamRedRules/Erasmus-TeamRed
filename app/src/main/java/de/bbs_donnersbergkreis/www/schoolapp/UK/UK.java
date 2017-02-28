package de.bbs_donnersbergkreis.www.schoolapp.UK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.bbs_donnersbergkreis.www.schoolapp.Czech.CZE_Events;
import de.bbs_donnersbergkreis.www.schoolapp.Czech.CZE_discussion;
import de.bbs_donnersbergkreis.www.schoolapp.Czech.CZE_meal;
import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_location;
import de.bbs_donnersbergkreis.www.schoolapp.R;

public class UK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk);
    }

    public void button_Location(View view) {
        Intent intent = new Intent(this, UK_location.class);
        startActivity(intent);
    }

    public void button_History_of_School(View view) {
        Intent intent = new Intent(this, UK_history.class);
        startActivity(intent);
    }


    public void button_Pictures(View view) {
        Intent intent = new Intent(this, UK_pictures.class);
        startActivity(intent);
    }

    public void button_List_of_graduates(View view) {

        Intent intent = new Intent(this, UK_history.class);
        startActivity(intent);
    }

    public void button_Disscussion_Blog(View view) {
        Intent intent = new Intent(this, UK_discussion.class);
        startActivity(intent);
    }

    public void button_School_meal(View view) {
        Intent intent = new Intent(this, UK_meal.class);
        startActivity(intent);
    }

    public void button_Events(View view) {
        Intent intent = new Intent(this, UK_events.class);
        startActivity(intent);
    }
}
