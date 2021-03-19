package com.example.serviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;


public class Register extends AppCompatActivity {
    public static final String TAG = "TAG";
    EditText mName, mEmail, mPhone, mPassword, mConfirmPass;
    Spinner mArea;
    Button mRegisterBtn, mClearBtn;
    ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mName = findViewById(R.id.name);
        mEmail = findViewById(R.id.email);
        mPhone = findViewById(R.id.phone);
        Spinner mySpinner = findViewById(R.id.spinner);
        mPassword = findViewById(R.id.password);
        mConfirmPass = findViewById(R.id.comfirmpass);
        mRegisterBtn = findViewById(R.id.registerBtn);
        mClearBtn = findViewById(R.id.clearBtn);
        mProgressBar = findViewById(R.id.progressBar);

        //Add drop down menu for Areas
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Register.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.areas));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);


        mRegisterBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = mName.getText().toString();
                final String email = mEmail.getText().toString().trim();
                final String phone  = mPhone.getText().toString();
                String comfirmpass = mConfirmPass.getText().toString();
                String password = mPassword.getText().toString().trim();
                //setup overide method for spinner

                if (TextUtils.isEmpty(email)) {
                    mEmail.setError("Email is Required.");
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    mPassword.setError("Password is Required.");
                    return;
                }

                if (password.length() < 6) {
                    mPassword.setError("Password Must be >= 6 Characters");
                    return;
                }

                mProgressBar.setVisibility(View.VISIBLE);

            }
        });

        mRegisterBtn.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),Lobby.class)));

        mClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mName.setText("");
                mEmail.setText("");
                mPhone.setText("");
                mPassword.setText("");
                mConfirmPass.setText("");
            }
        });

    }
}