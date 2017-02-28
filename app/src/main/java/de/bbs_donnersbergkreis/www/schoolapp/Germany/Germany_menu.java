package de.bbs_donnersbergkreis.www.schoolapp.Germany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.bbs_donnersbergkreis.www.schoolapp.R;

public class Germany_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany_menu);

    }


    public void button_Location(View button){
        Intent intent = new Intent(this, Germany_location.class);
        startActivity(intent);
    }
    public void button_History_of_School(View button){
        Intent intent = new Intent(this, Germany_History_of_school.class);
        startActivity(intent);
    }
    public void button_Pictures(View button){
        Intent intent = new Intent(this, Germany_Pictures.class);
        startActivity(intent);
    }
    public void button_List_of_graduates(View button){
        Intent intent = new Intent(this, Germany_List_of_graduates.class);
        startActivity(intent);
    }
    public void button_Disscussion_Blog(View button){
        Intent intent = new Intent(this, Germany_Discussion_blog.class);
        startActivity(intent);
    }
    public void button_School_meal(View button){
        Intent intent = new Intent(this, Germany_school_meal.class);
        startActivity(intent);
    }
    public void button_Events(View button){
        Intent intent = new Intent(this, Germany_events.class);
        startActivity(intent);
    }


}
