package com.starlabs.syllabusdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.shashank.sony.fancygifdialoglib.FancyGifDialog;
import com.shashank.sony.fancygifdialoglib.FancyGifDialogListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editTextUsername = findViewById(R.id.editviewUsername);
        final EditText editTextPassword = findViewById(R.id.editTextpassword);
        Button buttonLogin = findViewById(R.id.buttonLogin);

        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //capture data from edit text and store in a variable
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                if ( username.isEmpty()){

                    Toast.makeText(MainActivity.this, "UserName is required", Toast.LENGTH_SHORT).show();
                }

                if (password.isEmpty()) {

                    Toast.makeText(MainActivity.this, "Password is required", Toast.LENGTH_SHORT).show();
                }
                if (username.equals("admin@gmail.com")) {

                    Intent intentDashboard = new Intent(MainActivity.this, DashboardActivity.class);
                    startActivity(intentDashboard);}

            }
        });
    }


    @Override
    public void onClick(View view) {
        new FancyGifDialog.Builder(this)
                .setTitle("Forgot Password")
                .setMessage("Contact StarLabs system Admin to receive your account password reset instructions.")
                .setPositiveBtnBackground("#FF4081")
                .setPositiveBtnText("Ok")
                .setNegativeBtnText("Cancel")
                .setNegativeBtnBackground("#FFA9A7A8")
                .setGifResource(R.drawable.gif1)
                .isCancellable(true)
                .OnPositiveClicked(new FancyGifDialogListener() {
                    @Override
                    public void OnClick() {
                        Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
                    }
                })
                .OnNegativeClicked(new FancyGifDialogListener() {
                    @Override
                    public void OnClick() {
                        Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                })
                .build();


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
