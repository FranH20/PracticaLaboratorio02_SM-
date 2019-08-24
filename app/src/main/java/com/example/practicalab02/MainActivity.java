package com.example.practicalab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textonum1, textonum2;
    public static String EXTRA_NOMBRE,EXTRA_FRASE1,EXTRA_FRASE2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_saludar = (Button)findViewById(R.id.btn_Aceptar);
        textonum1 = (EditText) findViewById(R.id.txt_text1);
        textonum2 = (EditText) findViewById(R.id.txt_text2);

        btn_saludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txt_nombre = " ";
                String a = textonum1.getText().toString();
                String b = textonum2.getText().toString();
                String[] abc = a.split("");
                String[] cba = b.split("");
                int contador_frase1 = 0, contador_frase2 = 0;
                for (int i=0; i < abc.length; i++){
                    switch (abc[i]){
                        case "i":
                            contador_frase1++;
                            break;
                        case "u":
                            contador_frase1++;
                            break;
                        case "I":
                            contador_frase1++;
                            break;
                        case "U":
                            contador_frase1++;
                            break;
                    }
                }

                for(int i=0; i < cba.length; i++){
                    switch (cba[i]){
                        case "i":
                            contador_frase2++;
                            break;
                        case "u":
                            contador_frase2++;
                            break;
                        case "I":
                            contador_frase2++;
                            break;
                        case "U":
                            contador_frase2++;
                            break;
                    }
                }

                if(a.equals(b)){
                    txt_nombre = "SI son iguales las palabras";
                }else{
                    txt_nombre = "NO son iguales las palabras";
                }

                txt_nombre = txt_nombre + "\n Vocales cerradas IU \n La frase 1 tiene " + String.valueOf(contador_frase1) + "\n La frase 2 tiene " + String.valueOf(contador_frase2);
                Intent intent = new Intent(getApplicationContext(),ResultadoActivity.class);

                intent.putExtra(EXTRA_NOMBRE,txt_nombre);

                startActivity(intent);


            }
        });
    }
}
