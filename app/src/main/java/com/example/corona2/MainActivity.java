package com.example.corona2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView covid;
    EditText email;
    EditText password;
    Button signin;
    TextView new_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        covid = findViewById(R.id.textView);
        email = findViewById(R.id.editText2);
        password = findViewById(R.id.editText3);
        signin = findViewById(R.id.button);
        TextView new_user = (TextView)findViewById(R.id.textView2);
    }
}
