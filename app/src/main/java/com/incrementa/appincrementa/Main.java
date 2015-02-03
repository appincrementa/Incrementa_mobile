package com.incrementa.appincrementa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       setContentView(R.layout.main);
       
       
       final Button btnRegistrarse = (Button) findViewById(R.id.btnregistrar);
       final Button btnIngresarMenu = (Button) findViewById(R.id.btnIngresar);
       
       
       btnIngresarMenu.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Creamos el Intent
				Intent intent = new Intent(Main.this, Menu.class);

				startActivity(intent);
			}
		});
       
      btnRegistrarse.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Creamos el Intent
				Intent intent = new Intent(Main.this, Registrarse.class);

				startActivity(intent);
			}
		});
       
       
       
       
       
        
    }


   
    
}
