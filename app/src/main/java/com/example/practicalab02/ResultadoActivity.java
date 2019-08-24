package com.example.practicalab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        String nombre = getIntent().getStringExtra(MainActivity.EXTRA_NOMBRE);

        TextView textView = new TextView( this);
        textView.setText(nombre);
        textView.setTextSize(40);

        ViewGroup viewGroup = (ViewGroup)findViewById(R.id.mostrarSaludo);
        viewGroup.addView(textView);


    }
}
