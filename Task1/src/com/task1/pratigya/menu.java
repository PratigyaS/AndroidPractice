package com.task1.pratigya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class menu extends Activity {
	/** Called when the activity is first created. */

	
	String stuff;
	Menu menu;
	EditText et;
	private boolean isChanged;

	public void onCreate(Bundle savedInstanceState)

	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		Intent intent = getIntent();
	    int value = intent.getIntExtra("v", 0);
	     if(value==0)
	     {
	    	 isChanged=true;
	    	 
	     }
	     else
	     {
	    	 isChanged=false;
	     }
		
	   
	}

	@Override
    public boolean onPrepareOptionsMenu(Menu menu) {  

		closeOptionsMenu();

		if(isChanged==true)
		{
		return super.onPrepareOptionsMenu(menu);
		}
		else
			return false;
		
    }
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		
		menu.add("Home");
		menu.add("More");
		return true;
}

	
	@Override
	public void onAttachedToWindow() {
		super.onAttachedToWindow();
		openOptionsMenu();
	}

	public boolean onOptionsItemSelected(MenuItem item) {

		Intent i1 = new Intent(menu.this, Task1Activity.class);

		switch (item.getItemId()) {
		case 0:
			startActivity(i1);
			return true;
		}
		return true;

	}

}
