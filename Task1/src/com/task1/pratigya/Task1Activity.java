package com.task1.pratigya;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Task1Activity extends Activity {
    /** Called when the activity is first created. */
   
	int value1;
	String s;
	EditText et;
	private boolean isChangedStat = false;
	private static final int MENUITEM = Menu.FIRST;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
   
    
        Button btn=(Button) findViewById(R.id.wlcbutton);
         et=(EditText) findViewById(R.id.editText1);
        

    btn.setOnClickListener(new OnClickListener() {
    	
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			s=et.getText().toString();
			 if(s.equals(""))
	      {
	    	  new AlertDialog.Builder(Task1Activity.this)
				.setTitle("Error")
				.setMessage("Inputs Can't be Empty")
				.setPositiveButton("OK", null).show();
	      }
	    	
	      else
	      {
	       value1=  Integer.parseInt(s);    
	       
	       Intent i=new Intent(Task1Activity.this,menu.class);
	       Bundle b = new Bundle(); 
	      
				 b.putInt("v",value1);
				 
				 i.putExtras(b);
				 Log.i("Message of value",String.valueOf(b));
				startActivity(i);
			
			
	      }
		}
	});
  
    }
}
   