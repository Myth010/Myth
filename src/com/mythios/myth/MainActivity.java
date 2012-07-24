package com.mythios.myth;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
   /** Called when the user clicks the button */
   public void mountText(View view)	{
	// Do something in response to button
	Intent intent = new Intent(this, Displayb1c.class);
   }
	/** Called when user clicks the second button */
	public void fsckText(View view)	{
	//Do something
	Intent intent = new Intent(this, Displayb2c.class);
    }
}
