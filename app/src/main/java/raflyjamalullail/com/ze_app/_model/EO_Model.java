package raflyjamalullail.com.ze_app._model;

import android.os.Parcel;
import android.os.Parcelable;

public class EO_Model implements Parcelable {
    private String id, user_id, nama_eo, email, alamat, kontak, link, gambar_profil, deskripsi, created_at, updated_at;

    public EO_Model(String id, String user_id, String nama_eo, String email, String alamat, String kontak, String link, String gambar_profil, String deskripsi, String created_at, String updated_at) {
        this.id = id;
        this.user_id = user_id;
        this.nama_eo = nama_eo;
        this.email = email;
        this.alamat = alamat;
        this.kontak = kontak;
        this.link = link;
        this.gambar_profil = gambar_profil;
        this.deskripsi = deskripsi;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public EO_Model() {
    }

    protected EO_Model(Parcel in) {
        id = in.readString();
        user_id = in.readString();
        nama_eo = in.readString();
        email = in.readString();
        alamat = in.readString();
        kontak = in.readString();
        link = in.readString();
        gambar_profil = in.readString();
        deskripsi = in.readString();
        created_at = in.readString();
        updated_at = in.readString();
    }

    public static final Creator<EO_Model> CREATOR = new Creator<EO_Model>() {
        @Override
        public EO_Model createFromParcel(Parcel in) {
            return new EO_Model(in);
        }

        @Override
        public EO_Model[] newArray(int size) {
            return new EO_Model[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getNama_eo() {
        return nama_eo;
    }

    public void setNama_eo(String nama_eo) {
        this.nama_eo = nama_eo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getGambar_profil() {
        return gambar_profil;
    }

    public void setGambar_profil(String gambar_profil) {
        this.gambar_profil = gambar_profil;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.user_id);
        dest.writeString(this.nama_eo);
        dest.writeString(this.email);
        dest.writeString(this.alamat);
        dest.writeString(this.kontak);
        dest.writeString(this.link);
        dest.writeString(this.gambar_profil);
        dest.writeString(this.deskripsi);
        dest.writeString(this.created_at);
        dest.writeString(this.updated_at);
    }
}
