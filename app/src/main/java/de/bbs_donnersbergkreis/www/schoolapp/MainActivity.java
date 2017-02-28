package de.bbs_donnersbergkreis.www.schoolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.bbs_donnersbergkreis.www.schoolapp.Czech.Czech;
import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_menu;
import de.bbs_donnersbergkreis.www.schoolapp.Italy.Italy;
import de.bbs_donnersbergkreis.www.schoolapp.Poland.Poland;
import de.bbs_donnersbergkreis.www.schoolapp.UK.UK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pressButton1(View button){
        Intent intent = new Intent(this, Italy.class);
        startActivity(intent);

    }
    public void pressButton2(View button){
        Intent intent = new Intent(this, Germany_menu.class);
        startActivity(intent);

    }
    public void pressButton3(View button){
        Intent intent = new Intent(this, Czech.class);
        startActivity(intent);

    }
    public void pressButton4(View button){
        Intent intent = new Intent(this, UK.class);
        startActivity(intent);

    }
    public void pressButton5(View button){
        Intent intent = new Intent(this, Poland.class);
        startActivity(intent);

    }

}
