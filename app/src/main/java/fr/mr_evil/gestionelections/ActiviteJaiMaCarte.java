package fr.mr_evil.gestionelections;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class ActiviteJaiMaCarte extends AppCompatActivity {

    private EditText zoneNomuser, zoneIdCarte, zoneVille, zoneProfession, zoneNationalite;
    private Button btnSuivant, btnRestour;
    private CheckBox checkHomme, checkFemme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_jai_ma_carte);




    }
}