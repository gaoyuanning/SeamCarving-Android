package com.android.cs190i.project;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	public static String filePath = "";
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		View cameraCaptureNProcessButton = (View) findViewById(R.id.cameraCaptureNProcessButton);
		cameraCaptureNProcessButton.setOnClickListener(this);
		View loadNProcessButton = (View) findViewById(R.id.loadNProcessButton);
		loadNProcessButton.setOnClickListener(this);
		View exitButton = (View) findViewById(R.id.exitButton);
		exitButton.setOnClickListener(this);
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) 
	{
		switch (v.getId()) {
		case R.id.cameraCaptureNProcessButton:
			
			break;
		case R.id.loadNProcessButton:
			Intent i = new Intent(this, FileChooser.class);
			startActivity(i);
			break;
		case R.id.exitButton:
			finish();
			break;
		default:
			break;
		}
	}

}
