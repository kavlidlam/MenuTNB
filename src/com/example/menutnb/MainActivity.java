package com.example.menutnb;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {
	
	int multiplier;
	Button circle, square;
	TextView display;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		multiplier = 0;
		circle = (Button) findViewById(R.id.bGOcircle);
		square = (Button) findViewById(R.id.bGOsquare);
		display = (TextView) findViewById(R.id.tvdisplay);
		square.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				multiplier++;
				display.setText("your_total_is_0" + multiplier);
			}
		});
		circle.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(v.getContext(), GL1Activity.class);
				startActivityForResult (intent, 0);
			}
		});
		
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
