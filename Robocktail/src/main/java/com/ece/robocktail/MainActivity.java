package com.ece.robocktail;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {
    public String DB_PATH;
    public String DB_NAME;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ImageView name = (ImageView) this.findViewById(R.id.imageView1);
        ImageView list = (ImageView) this.findViewById(R.id.imageView2);
        ImageView lucky = (ImageView) this.findViewById(R.id.imageView3);

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