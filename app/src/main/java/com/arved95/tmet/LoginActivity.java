package com.arved95.tmet;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etpassword;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etpassword = (EditText) findViewById(R.id.editTextPassword);
        btn_login = (Button) findViewById(R.id.bLogin);

        btn_login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            EditText etpassword = (EditText) findViewById(R.id.editTextPassword);
            String password = etpassword.getText().toString();

            etpassword.getEditableText().toString();
            if (password.equals("TriveniMemorialTrust")) {
                Intent intent2 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent2);
            }else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Wrong School Password!");
                builder.setMessage("Try again.");
                builder.setPositiveButton("OK", null);
                AlertDialog dialog = builder.show();
            }

        }

    }

