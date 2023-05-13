package fr.mr_evil.gestionelections;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.Date;

public class Candidat implements Parcelable {
    private String nomCandidat;
    private String prenomCandidat;
    private String photoProfileCand;
    private String dateNaissanceCand;
    private int numeroTelephoneCand;
    private String cniCand;
    private String professionCand;
    private  String sexeCand;
    private String lieuNaissanceCand;
    private  String sloganCand;
    private String promessesCand;
    private int idCandidat;


    protected Candidat(Parcel in) {
        idCandidat = in.readInt();
        nomCandidat = in.readString();
        prenomCandidat=in.readString();
        photoProfileCand=in.readString();
        numeroTelephoneCand=in.readInt();
        dateNaissanceCand=in.readString();
        cniCand=in.readString();
        professionCand=in.readString();
        sexeCand=in.readString();
        lieuNaissanceCand=in.readString();
        sloganCand=in.readString();
        promessesCand=in.readString();

    }

    public void setNomCandidat(String nomCandidat) {
        this.nomCandidat = nomCandidat;
    }

    public void setPrenomCandidat(String prenomCandidat) {
        this.prenomCandidat = prenomCandidat;
    }

    public void setPhotoProfileCand(String photoProfileCand) {
        this.photoProfileCand = photoProfileCand;
    }

    public void setDateNaissanceCand(String dateNaissanceCand) {
        this.dateNaissanceCand = dateNaissanceCand;
    }

    public void setNumeroTelephoneCand(int numeroTelephoneCand) {
        this.numeroTelephoneCand = numeroTelephoneCand;
    }

    public void setCniCand(String cniCand) {
        this.cniCand = cniCand;
    }

    public void setProfessionCand(String professionCand) {
        this.professionCand = professionCand;
    }

    public void setSexeCand(String sexeCand) {
        this.sexeCand = sexeCand;
    }

    public void setLieuNaissanceCand(String lieuNaissanceCand) {
        this.lieuNaissanceCand = lieuNaissanceCand;
    }

    public void setSloganCand(String sloganCand) {
        this.sloganCand = sloganCand;
    }

    public void setPromessesCand(String promessesCand) {
        this.promessesCand = promessesCand;
    }

    public void setIdCandidat(int idCandidat) {
        this.idCandidat = idCandidat;
    }

    public String getNomCandidat() {
        return nomCandidat;
    }

    public String getPrenomCandidat() {
        return prenomCandidat;
    }

    public String getPhotoProfileCand() {
        return photoProfileCand;
    }

    public String getDateNaissanceCand() {
        return dateNaissanceCand;
    }

    public int getNumeroTelephoneCand() {
        return numeroTelephoneCand;
    }

    public String getCniCand() {
        return cniCand;
    }

    public String getProfessionCand() {
        return professionCand;
    }

    public String getSexeCand() {
        return sexeCand;
    }

    public String getLieuNaissanceCand() {
        return lieuNaissanceCand;
    }

    public String getSloganCand() {
        return sloganCand;
    }

    public String getPromessesCand() {
        return promessesCand;
    }

    public int getIdCandidat() {
        return idCandidat;
    }

    public Candidat(){

    }

    public Candidat(String nomCandidat, String prenomCandidat,
                    String photoProfileCand, String dateNaissanceCand,
                    int numeroTelephoneCand, String cniCand,
                    String professionCand, String sexeCand,
                    String lieuNaissanceCand, String sloganCand,
                    String promessesCand, int idCandidat) {
        this.nomCandidat = nomCandidat;
        this.prenomCandidat = prenomCandidat;
        this.photoProfileCand = photoProfileCand;
        this.numeroTelephoneCand = numeroTelephoneCand;
        this.cniCand = cniCand;
        this.professionCand = professionCand;
        this.sexeCand = sexeCand;
        this.lieuNaissanceCand = lieuNaissanceCand;
        this.sloganCand = sloganCand;
        this.promessesCand = promessesCand;
        this.idCandidat = idCandidat;
        this.dateNaissanceCand=dateNaissanceCand;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "nomCandidat='" + nomCandidat + '\'' +
                ", prenomCandidat='" + prenomCandidat + '\'' +
                ", photoProfileCand='" + photoProfileCand + '\'' +
                ", dateNaissanceCand=" + dateNaissanceCand +
                ", numeroTelephoneCand=" + numeroTelephoneCand +
                ", cniCand='" + cniCand + '\'' +
                ", professionCand='" + professionCand + '\'' +
                ", sexeCand='" + sexeCand + '\'' +
                ", lieuNaissanceCand='" + lieuNaissanceCand + '\'' +
                ", sloganCand='" + sloganCand + '\'' +
                ", promessesCand='" + promessesCand + '\'' +
                ", idCandidat=" + idCandidat +
                '}';
    }

    public static final Creator<Candidat> CREATOR = new Creator<Candidat>() {
        @Override
        public Candidat createFromParcel(Parcel in) {
            return new Candidat(in);
        }

        @Override
        public Candidat[] newArray(int size) {
            return new Candidat[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
    }
}
