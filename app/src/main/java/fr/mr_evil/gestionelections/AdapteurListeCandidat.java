package fr.mr_evil.gestionelections;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class AdapteurListeCandidat extends ArrayAdapter {

   public ArrayList<Candidat> listCands;

   public AdapteurListeCandidat(Context context, ArrayList<Candidat> listCands){
    super(context, 0,listCands);
    this.listCands=listCands;
   }

  /*@NonNull
   @Override
   public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
       return initView(position,convertView,parent);
   }
    public View initView(int position, View convertView, ViewGroup parent){
       if (convertView==null){
           convertView= LayoutInflater.from(getContext()).inflate(
                   R.layout.candidat_view_raw,parent,false
           );
       }
    }*/



    public AdapteurListeCandidat(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public AdapteurListeCandidat(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public AdapteurListeCandidat(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, resource, objects);
    }

    public AdapteurListeCandidat(@NonNull Context context, int resource, int textViewResourceId, @NonNull Object[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public AdapteurListeCandidat(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    public AdapteurListeCandidat(@NonNull Context context, int resource, int textViewResourceId, @NonNull List objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
