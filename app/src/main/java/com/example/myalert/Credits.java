package com.example.myalert ;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Credits extends AppCompatActivity {
    /**
     * @author Eviatar dadon
     * @version 0.1
     * @since 27.11
     */

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }
    /**
     *
     *  menu Create Toggle Menu
     *  menu to be displayed or Enable
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     *
     *  item get  another item from the menu
     *  item pressed
     */
    public boolean onOptionsItemSelected(MenuItem item){
        String st = item.getTitle().toString();
        if(st.equals("Home")){
            finish();
        }
        if(st.equals("Credits")){

        }
        return true;
    }
}