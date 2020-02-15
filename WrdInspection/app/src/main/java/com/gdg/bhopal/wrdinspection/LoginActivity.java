package com.gdg.bhopal.wrdinspection;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    private ProgressDialog loadingBar;
    TextView username;
    TextView password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        loadingBar = new ProgressDialog(this);
        username =  findViewById(R.id.usernameTxt);
        password =  findViewById(R.id.passwordTxt);
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        Button loginButton = findViewById( R.id.loginBtn );
        loginButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String u = username.getText().toString().trim();
//                String p = password.getText().toString();
//                if (u.trim().equals("") || p.trim().equals("")) {
//                    Toast.makeText(LoginActivity.this, "Fields are empty", Toast.LENGTH_LONG).show();
//
//                } else {

                    loadingBar.setTitle( "Login" );
                    loadingBar.setMessage( "Please wait, while we are checking the credentials." );
                    loadingBar.setCanceledOnTouchOutside( false );
                    loadingBar.show();


                    Intent intent = new Intent( LoginActivity.this, MainMenu.class );
                    startActivity( intent );
  //              }
    }
});
    }
}