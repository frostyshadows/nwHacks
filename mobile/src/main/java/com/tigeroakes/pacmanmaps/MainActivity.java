package com.tigeroakes.pacmanmaps;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		View newButton = findViewById(R.id.new_button);
		newButton.setOnClickListener(this);
		View howToButton = findViewById(R.id.how_to_play_button);
		howToButton.setOnClickListener(this);
		View aboutButton = findViewById(R.id.about_button);
		aboutButton.setOnClickListener(this);
		View settingsButton = findViewById(R.id.settings);
		settingsButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	//WHAT'S THIS METHOD EVEN FOR
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.new_button:
				Intent i = new Intent(this, MapsActivity.class);
				startActivity(i);
				break;
			case R.id.how_to_play_button:
				Intent j = new Intent(this, HowToPlay.class);
				startActivity(j);
				break;
			case R.id.about_button:
				Intent k = new Intent(this, About.class);
				startActivity(k);
				break;
			case R.id.settings:
		}

	}
}
