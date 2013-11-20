package com.ece.robocktail;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class CocktailList extends Activity {
	
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cocktaillist);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
