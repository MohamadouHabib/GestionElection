package fr.mr_evil.gestionelections;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ConnecteurBD extends SQLiteOpenHelper {

    private static final String nomBD="bdGestionElecteur";
    private static final int versionBD=1;



    public ConnecteurBD(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public ConnecteurBD(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table candidat ("
                +"id int not null primary key autoincrement,"
                +"nom text not null ,"
                +"prenom text not null,"
                +"dateNaissance text not null,"
                +"lieuNaissance text not null,"
                +"photo text,"
                +"numeroPhone int not null,"
                +"cni text not null,"
                +"profession text not null,"
                +"sex text not null,"
                +"slogan text not null,"
                +"promesses text not null"
                +") ";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

   /* public ArrayList<Candidat> listCandidat() {
        ArrayList<Candidat> listCand=new ArrayList<Candidat>();
        String slqSelect= "select * from candidat";
        Cursor cursor = this.getWritableDatabase().rawQuery(slqSelect,null);

        if (cursor.moveToFirst()){
            while (cursor.isAfterLast()){
                int idBd= cursor.getInt(cursor.getColumnIndex("id"));
                String nomBd = cursor.getString(cursor.getColumnIndex("nom"));
                String prenomBd=cursor.getString(cursor.getColumnIndex("prenom"));
                String dateNaissBd=cursor.getString(cursor.getColumnIndex("dateNaissance"));
                String lieuNaissBd=cursor.getString(cursor.getColumnIndex("lieuNaissance"));
                String photoBd=cursor.getString(cursor.getColumnIndex("photo"));
                int numeroPhoneBd= cursor.getInt(cursor.getColumnIndex("numeroPhone"));
                String cniBd=cursor.getString(cursor.getColumnIndex("cni"));
                String professionBd=cursor.getString(cursor.getColumnIndex("profession"));
                String sexBd=cursor.getString(cursor.getColumnIndex("sex"));
                String sloganBd=cursor.getString(cursor.getColumnIndex("slogan"));
                String promessesBd=cursor.getString(cursor.getColumnIndex("promesses"));

                Candidat cands= new Candidat();
                cands.setIdCandidat(idBd);
                cands.setNomCandidat(nomBd);
                cands.setPrenomCandidat(prenomBd);
                cands.setCniCand(cniBd);
                cands.setSexeCand(sexBd);
                cands.setPhotoProfileCand(photoBd);
                cands.setSloganCand(sloganBd);
                cands.setDateNaissanceCand(dateNaissBd);
                cands.setLieuNaissanceCand(lieuNaissBd);
                cands.setNumeroTelephoneCand(numeroPhoneBd);
                cands.setProfessionCand(professionBd);
                listCand.add(cands);
                cursor.moveToNext();
            }
        }
        return listCand;
    }*/
}

