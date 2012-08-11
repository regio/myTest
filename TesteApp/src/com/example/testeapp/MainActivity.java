package com.example.testeapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View playButton = findViewById(R.id.btnOk);
        //playButton.setOnClickListener(this);
        playButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				System.out.print("ok");
				 TextView hello =  (TextView) findViewById(R.id.txtHello);
				 EditText ed = (EditText) findViewById(R.id.edName);
				 hello.setText("Opaa " + ed.getText());
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
