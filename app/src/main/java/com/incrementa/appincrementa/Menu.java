package com.incrementa.appincrementa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       setContentView(R.layout.menu);

        final Button btnReportesClarity = (Button) findViewById(R.id.btnReportes);

        btnReportesClarity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creamos el Intent
                Intent intent = new Intent(Menu.this, ReportesClarity.class);

                startActivity(intent);
            }
        });





       
    }
    
}