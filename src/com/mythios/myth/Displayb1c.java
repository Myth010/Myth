package com.mythios.myth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;

public class Displayb1c extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState)	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_button1);
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
	}
}
