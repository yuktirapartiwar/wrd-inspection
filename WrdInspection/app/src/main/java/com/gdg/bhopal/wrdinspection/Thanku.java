package com.gdg.bhopal.wrdinspection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Thanku extends AppCompatActivity {

    public Button mainmenuBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_thanku );
        mainmenuBtn = (Button)findViewById( R.id.mainmenuBtn );
        mainmenuBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Thanku.this, MainMenu.class );
                startActivity( intent );
            }
        } );
    }
}
