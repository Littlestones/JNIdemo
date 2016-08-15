package com.example.uu.jnidemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	static{
		System.loadLibrary("jnidemo");
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "3+5=" + add(3, 5), 0).show();
    }



    public native int add(int i, int j);

}
