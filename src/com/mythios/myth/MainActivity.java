package com.mythios.myth;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
	public final static String EXTRA_MESSAGE ="com.mythios.myth.MESSAGE";
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
	startActivity(intent);
   }
	/** Called when user clicks the second button */
	public void fsckText(View view)	{
	//Do something
	Intent intent = new Intent(this, Displayb2c.class);
	startActivity(intent);
    }
	/** Called when user clicks third button */
	public void grubText(View view)	{
		// Get busy
	Intent intent = new Intent(this, Displayb3c.class);
	startActivity(intent);
	}
/** Called when user clicks fourth button */
	public void psaxText(View view)	{
		// Get busy
	Intent intent = new Intent(this, Displayb4c.class);
	startActivity(intent);
	}
	/** To start the Chmod calculator app */
	public void chmodCalc (View view) {
		Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.splatsoft.chmodcalculator");
		startActivity(LaunchIntent);
		}
}
