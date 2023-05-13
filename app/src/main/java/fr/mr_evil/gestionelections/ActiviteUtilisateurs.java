package fr.mr_evil.gestionelections;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Observable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ActiviteUtilisateurs extends AppCompatActivity {

    private ListView listeCandidat;
    private ArrayList<String> Candidats= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_utilisateurs);
        listeCandidat= findViewById(R.id.listcandidats);
        Candidats.add("Mohamadou Habib (chef)");
        Candidats.add("Yassine Bonou");
        Candidats.add("Mr Evil");
        Candidats.add("Candidat 4");
        Candidats.add("Mohamadou Habib (chef)");
        Candidats.add("Yassine Bonou");
        Candidats.add("Mr Evil");
        Candidats.add("Candidat 4");
        Candidats.add("Mohamadou Habib (chef)");
        Candidats.add("Yassine Bonou");
        Candidats.add("Mr Evil");
        Candidats.add("Candidat 4");
        Candidats.add("Mohamadou Habib (chef)");
        Candidats.add("Yassine Bonou");
        Candidats.add("Mr Evil");
        Candidats.add("Candidat 4");
        Candidats.add("Mohamadou Habib (chef)");
        Candidats.add("Yassine Bonou");
        Candidats.add("Mr Evil");
        Candidats.add("Candidat 4");

        ArrayAdapter adapter =new ArrayAdapter(this, android.R.layout.simple_list_item_1,Candidats);
        listeCandidat.setAdapter(adapter);
    }
}