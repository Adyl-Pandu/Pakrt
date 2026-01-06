
package Session;


public class UserSession {
    private static UserSession instance;

    private int idWarga;
    private String namaWarga;
    private String role;

    private UserSession() {}

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void setUser(int idWarga, String namaWarga, String role) {
        this.idWarga = idWarga;
        this.namaWarga = namaWarga;
        this.role = role;
    }

    public int getIdWarga() {
        return idWarga;
    }

    public String getNamaWarga() {
        return namaWarga;
    }

    public String getRole() {
        return role;
    }

    public void logout() {
        instance = null;
    }
}
