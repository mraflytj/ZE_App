package raflyjamalullail.com.ze_app;

public class EO_Model {
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
}
