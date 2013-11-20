package com.ece.robocktail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ImageView name = (ImageView) this.findViewById(R.id.imageView1);
        ImageView list = (ImageView) this.findViewById(R.id.imageView2);

        name.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CocktailMain.class);
                startActivity(i);
            }
        });
        list.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CocktailList.class);
                startActivity(i);
            }
        });
    }
}  