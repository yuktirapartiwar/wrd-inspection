package com.gdg.bhopal.wrdinspection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button inspectionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main_menu );
        inspectionBtn = (Button)findViewById( R.id.inspectionBtn );
        inspectionBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainMenu.this , MainActivity.class );
                startActivity(intent);
            }
        } );
    }
}
