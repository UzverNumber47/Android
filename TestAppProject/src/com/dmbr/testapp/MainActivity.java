package com.dmbr.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	ImageButton imageButton;
	TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		text = (TextView) findViewById(R.id.textView);
		addListenerOnButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void addListenerOnButton() {

		imageButton = (ImageButton) findViewById(R.id.imageButton1);

		imageButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

//				System.out.println("ololo");
				text.setText("Ololoo");
				Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
				// Intent a = new
				// Intent a = new Intent(this,QuestionActivity.class);
				// a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				 startActivity(intent);

			}

		});

	}
}
