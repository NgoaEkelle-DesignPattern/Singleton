public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //Test de connexion
        connexion c = connexion.createConnexion("Test","123Test");
        System.out.println("Connexion created with name: " + c.getName() + "and password:"+ c.getPassword());
        c.setName("Test3");
        c.setPassword("1234TestTest");
        System.out.println("Connexion modified with name: " + c.getName() + " and password:" + c.getPassword());
        
        connexion b = connexion.createConnexion("Test2","12345Test");
        System.out.println("Connexion create name " + b.getName() + "and password:"+ b.getPassword());
        b.setName("Test4");
        b.setPassword("123456TestTest");
        System.out.println("Connexion modified with name: " + b.getName() + " and password:" + b.getPassword());
        System.out.println("Connexion closed: " + c.closeConnexion());
        System.out.println("Connexion closed: " + b.closeConnexion());
    }
}
