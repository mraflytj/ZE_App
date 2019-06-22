package raflyjamalullail.com.ze_app._model;

public class User {

    private int id;
    private String username, email, gender, nomor_telepon, password;
    private String is_eo = "0";

    public User(int id, String username, String email, String gender) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIs_eo() {
        return is_eo;
    }
    public void setIs_eo(String is_eo) {
        this.is_eo = is_eo;
    }
}
