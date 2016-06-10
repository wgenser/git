package com.example.david_genser.git;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TextView-Variable erzeugen
        final TextView Anzeige1 = (TextView) findViewById(R.id.textView);

        // Button-Variablen erzeugen
        Button Knopf1 = (Button) findViewById(R.id.button);
        Button Knopf2 = (Button) findViewById(R.id.button2);
        Button Knopf3 = (Button) findViewById(R.id.button3);

        // Buttons und Methoden verknÃ¼pfen
        Knopf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Anzeige1.setText(R.string.String_Plus);
                        }
        });

        Knopf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Anzeige1.setText(R.string.String_Minus);
                      }
        });

        Knopf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Anzeige1.setText(R.string.Antwort_Unsicher);
                          }
        });

    }
}
