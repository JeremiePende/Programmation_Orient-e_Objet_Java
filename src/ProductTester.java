public class ProductTester {
    public static void main(String args[]){
        // Creation de deux objets produit à l'aide de constructeur
        Product s1 = new Product(1,"Biscuit",2,500);
        System.out.println(s1);
        Product s2 = new Product(2,"Bonbon",3,100);
        System.out.println(s2);
        // Creation de 4 objet produit en indiquant les valeurs des arguments qui correspondent aux paramètre
        // contructeur

        // Creation du 1er (s3)
        Product s3 = new Product();
        s3.setNumber(3);
        s3.setName("Chocolat");
        s3.setQty(4);
        s3.setPrice(1000);
        System.out.println(s3);

        // Creation du 2e (s4)
        Product s4 = new Product();
        s4.setNumber(4);
        s4.setName("Creme");
        s4.setQty(5);
        s4.setPrice(1000);
        System.out.println(s4);

        // Creation du 3e (s5)
        Product s5 = new Product();
        s5.setNumber(5);
        s5.setName("Chandwich");
        s5.setQty(7);
        s5.setPrice(1500);
        System.out.println(s5);

        // Creation du 4e (s6)
        Product s6 = new Product();
        s6.setNumber(6);
        s6.setName("Pizza");
        s6.setQty(7);
        s6.setPrice(10000);
        System.out.println(s6);
    }
}
