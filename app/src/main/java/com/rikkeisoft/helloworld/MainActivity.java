package com.rikkeisoft.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		int i = 0;
		if (1+1 == 2)
			i = 10;
		i += i;
		
		Log.i("MainActivity1", "i=" + i);
    }
}
