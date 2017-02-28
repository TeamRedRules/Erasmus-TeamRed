package de.bbs_donnersbergkreis.www.schoolapp.Poland;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.bbs_donnersbergkreis.www.schoolapp.Czech.Czech_Location;
import de.bbs_donnersbergkreis.www.schoolapp.R;

public class Poland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poland);
    }

    public void button_Location(View view) {
        Intent intent = new Intent(this, PL_Location.class);
        startActivity(intent);

    }

    public void button_History_of_School(View view) {
        Intent intent = new Intent(this, PL_history.class);
        startActivity(intent);
    }

    public void button_Pictures(View view) {
        Intent intent = new Intent(this, PL_pictures.class);
        startActivity(intent);
    }

    public void button_List_of_graduates(View view) {
        Intent intent = new Intent(this, PL_list.class);
        startActivity(intent);
    }

    public void button_Disscussion_Blog(View view) {
        Intent intent = new Intent(this, PL_discuss.class);
        startActivity(intent);
    }

    public void button_School_meal(View view) {
        Intent intent = new Intent(this, PL_school.class);
        startActivity(intent);
    }

    public void button_Events(View view) {
        Intent intent = new Intent(this, PL_events.class);
        startActivity(intent);
    }

    public void PL_Translate(View view) {

    }
}
