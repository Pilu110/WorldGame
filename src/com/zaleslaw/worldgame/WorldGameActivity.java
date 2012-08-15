package com.zaleslaw.worldgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WorldGameActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void button_NewGame_Click(View v)
	{
		switch (v.getId()) 
		{
		    case R.id.buttonNewGame:
		        Intent i = new Intent(this, NewGameActivity.class);
		        startActivity(i);
		        break;
	    }
	}
}