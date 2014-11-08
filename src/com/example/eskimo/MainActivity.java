package com.example.eskimo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView message = (TextView)findViewById(R.id.txtMessage);
		Button submit = (Button)findViewById(R.id.btnSubmit);
		submit.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				message.setText("Bazinga! Bazinga!");	
				
			}
		});
	}
}
