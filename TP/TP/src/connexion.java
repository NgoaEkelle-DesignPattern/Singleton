public final class connexion {
    private String name;
    private String Password;
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public static connexion getDbconnexion() {
        return dbconnexion;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return Password;
    }

    private static connexion dbconnexion;

    private connexion(String name, String Password){
        this.name=name;
        this.Password=Password;
    }

    public static connexion createConnexion(String name, String Password){
        if(dbconnexion==null){
            dbconnexion=new connexion(name,Password);
        }
        return dbconnexion;
        
    }

    public String closeConnexion(){
        dbconnexion.name=null;
        dbconnexion.Password=null;
        return "Connexion closed";
    }
}

