package com.mythios.myth;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Displayb2c extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState)	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_button2);
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
	}
}
