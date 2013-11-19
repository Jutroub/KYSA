package com.ece.robocktail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class CocktailMain extends Activity {
	private ListView lv;
	public int flg = 0;
	private EditText searchEdit = null;
	String oldText = "";
	int[] no = new int[100];
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setEditText();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
    //EditView
    private void setEditText()
    {
    	//searchEdit = (EditText) findViewById(R.id.editTextSearch);
    	searchEdit.addTextChangedListener(new TextWatcher() {
    		
            public void afterTextChanged(Editable editable){
            	oldText = editable.toString();
            }

            public void beforeTextChanged(CharSequence charsequence, int start,int count,int after){}

            
            public void onTextChanged(CharSequence charsequence, int start,int count,int after){}
        });	
    	
    	searchEdit.setOnKeyListener(new AdapterView.OnKeyListener() {
    	public boolean onKey(View v, int keyCode, KeyEvent event) {

    	        //EnterKey
    			if (event.getAction() == KeyEvent.ACTION_DOWN
    					&& keyCode == KeyEvent.KEYCODE_ENTER) {
    				
    	            //ferme le clavier virtuel
    				InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
    				inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);

    	            //recherche
    				/*EditText word = (EditText) findViewById(R.id.editTextSearch);
    				if (word != null && word.length() != 0) {
                        flg = 1;
                        
                    }*/
    				return true;
    			}
    			return false;
    		}
    	});

    }
}

