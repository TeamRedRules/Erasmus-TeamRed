package de.bbs_donnersbergkreis.www.schoolapp.Czech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_location;
import de.bbs_donnersbergkreis.www.schoolapp.R;

public class Czech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_czech);
    }
    public void button_Location_CZE(View button){
        Intent intent = new Intent(this, Czech_Location.class);
        startActivity(intent);
    }

    public void button_History_of_School_CZE(View view) {
        Intent intent = new Intent(this, History_school.class);
        startActivity(intent);
    }

    public void button_Pictures_CZE(View view) {
        Intent intent = new Intent(this, CZE_Pictures.class);
        startActivity(intent);
    }

    public void button_List_of_graduates_CZE(View view) {
        Intent intent = new Intent(this, List_CZE.class);
        startActivity(intent);
    }

    public void button_Disscussion_Blog_CZE(View view) {
        Intent intent = new Intent(this, CZE_discussion.class);
        startActivity(intent);
    }

    public void button_School_meal_CZE(View view) {
        Intent intent = new Intent(this,CZE_meal.class);
        startActivity(intent);
    }

    public void button_Events_CZE(View view) {
        Intent intent = new Intent(this,CZE_Events.class);
        startActivity(intent);
    }
}
