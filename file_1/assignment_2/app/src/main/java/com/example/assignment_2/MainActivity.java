package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView icMail;
    private EditText edtage;
    private EditText edthobby;
    private EditText edtname;
    private EditText edtmail;
    private EditText edtskill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);

        icMail = findViewById(R.id.icMail);
        edtmail = findViewById(R.id.edt_mail);
        edtname = findViewById(R.id.edt_name);
        edtage = findViewById(R.id.edt_age);
        edthobby = findViewById(R.id.edt_hobby);
        edtskill = findViewById(R.id.edt_skill);

        icMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtname.getText().toString();
                String mail = edtmail.getText().toString();
                String age = edtage.getText().toString();
                String hobby = edthobby.getText().toString();
                String skill = edtskill.getText().toString();

                Toast.makeText(getApplicationContext(),
                        "Your name: " + name +
                        "\n Your mail: " + mail +
                        "\n Your age: " + age +
                        "\n Your hobby: " + hobby +
                        "\n Your skill: " + skill
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }
}