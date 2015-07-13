package com.example.activity;

import com.example.R;

import android.app.Activity;
import android.os.Bundle;

public class MyFirstActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);
  }
}
