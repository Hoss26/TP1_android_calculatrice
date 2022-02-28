package com.example.tpcalculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button _btnSom,_btnSou,_btnMul,_btnDiv,_btnMod;
    EditText _edtPremier,_edtSecond;
    TextView _txtResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //liaison entre contrôles XML et variables Java
        _btnSom = findViewById(R.id.btnSom);
        _edtPremier = findViewById(R.id.edtPremier);
        _edtSecond = findViewById(R.id.edtSecond);
        _txtResultat = findViewById(R.id.txtResultat);
        // traitements
        _btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,somme;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                somme = n1 + n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(somme));
            }
        });
        _btnSou = findViewById(R.id.btnSou);
        _edtPremier = findViewById(R.id.edtPremier);
        _edtSecond = findViewById(R.id.edtSecond);
        _txtResultat = findViewById(R.id.txtResultat);

        _btnSou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,soustraction;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt((_edtSecond.getText().toString()));
                soustraction = n1 - n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(soustraction));
            }
        });
        _btnMul = findViewById(R.id.btnMul);
        _edtPremier = findViewById(R.id.edtPremier);
        _edtSecond = findViewById(R.id.edtSecond);
        _txtResultat = findViewById(R.id.txtResultat);

        _btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,multiplication;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt((_edtSecond.getText().toString()));
                multiplication = n1 * n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(multiplication));
            }
        });

        _btnDiv = findViewById(R.id.btnDiv);
        _edtPremier = findViewById(R.id.edtPremier);
        _edtSecond = findViewById(R.id.edtSecond);
        _txtResultat = findViewById(R.id.txtResultat);

        _btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,division;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                division = n1 / n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(division));
            }
        });

        _btnMod = findViewById(R.id.btnMod);
        _edtPremier = findViewById((R.id.edtPremier));
        _edtSecond = findViewById(R.id.edtSecond);
        _txtResultat = findViewById(R.id.txtResultat);

        _btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,modulo;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                modulo = n1 % n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(modulo));
            }
        });



    }
}