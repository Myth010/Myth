package com.mythios.myth;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Displayb1c extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState)	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_button1);
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
	}
}
