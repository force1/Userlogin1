package com.mycompany.userlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText= (EditText) findViewById(R.id.editText);
        Button button=(Button) findViewById(R.id.button);
    }

    public void view(View view) {
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("Value1", "arvind");
        i.putExtra("Value2", "abhay");
        i.putExtra("Value3", "antony");
        startActivity(i);

    }
}
