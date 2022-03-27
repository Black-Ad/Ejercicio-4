package com.example.administrador.ejercicio4;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos los botones aqui

        final Button submitButton = (Button) findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstName = (EditText) findViewById(R.id.first_name_text);
                EditText lastName = (EditText) findViewById(R.id.last_name_text);

                String firstNameString = firstName.getText().toString();
                String lastNameString = lastName.getText().toString();

                Intent submitIntent = new Intent(MainActivity.this, ShowActivity.class);
                submitIntent.putExtra("firstNameString", firstNameString);
                submitIntent.putExtra("lastNameString", lastNameString);
                startActivity(submitIntent);
            }
        });

        final Button browserButton = (Button) findViewById(R.id.browser_button);
        browserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.senati.edu.pe/"));
                startActivity(intent);
            }
        });
    }
}