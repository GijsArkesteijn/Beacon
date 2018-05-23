package com.example.a302543540.chocoladevlokken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       int resID =  R.string.incorrect_toast;

       String falseButtonText = getString(R.string.false_button);
    }
}
