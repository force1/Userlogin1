package com.mycompany.userlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("value1");
        String value2 = extras.getString("value2");
        String value3 = extras.getString("value3");
        Toast.makeText(this, "welcome user:",Toast.LENGTH_LONG).show();

    }
}
