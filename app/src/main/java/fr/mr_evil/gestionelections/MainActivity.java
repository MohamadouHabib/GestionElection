package fr.mr_evil.gestionelections;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnJaiuneCarte;
    private Button btnPasDeCarte;
    private Button btnSeConnecter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJaiuneCarte = findViewById(R.id.btnJaiCarte);
        btnPasDeCarte  = findViewById(R.id.btnPasCarte);
        btnSeConnecter = findViewById(R.id.btnSeConnecter);

        btnPasDeCarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActiviteUtilisateurs.class);
                startActivity(intent);

            }
        });
        btnJaiuneCarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActiviteJaiMaCarte.class);
                startActivity(intent);
            }
        });
    }
}