public class Product {
    // Declarations de champs d'instance
    private int number;
    private String name;
    private int qty;
    private double price;

    // Création d'un constructeur par defaut
    // qui autorise au compilateur à initialiser les champs avec leur valeur par defaut
    public Product() {
    }
    // Création d'un constructeur contenant les parametres pour quatre champs d'instance de la classe afin qu'ils
    // puissent être initialisés avec les valeurs de la classe
    //pilote
    public Product(int number, String name, int qty, double price) {
        this.number = number;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    // Définition d'une methode get/d'acces qui permet d'acceder aux informations de la variable Number
    public int getNumber() {
        return number;
    }
    // Définition d'une methode set/modificateur qui permet de modifier les informations de la variable Number
    public void setNumber(int number) {
        this.number = number;
    }
    // Définition d'une methode get/d'acces qui permet d'acceder aux informations de la variable Name
    public String getName() {
        return name;
    }
    // Définition d'une methode set/modificateur qui permet de modifier les informations de la variable name
    public void setName(String name) {
        this.name = name;
    }
    // Définition d'une methode get/d'acces qui permet d'acceder aux informations de la variable Qty
    public int getQty() {
        return qty;
    }
    // Définition d'une methode set/modificateur qui permet de modifier les informations de la variable qty
    public void setQty(int qty) {
        this.qty = qty;
    }
    // Définition d'une methode get/d'acces qui permet d'acceder aux informations de la variable Price
    public double getPrice() {
        return price;
    }
    // Définition d'une methode set/modificateur qui permet de modifier les informations de la variable price
    public void setPrice(double price) {
        this.price = price;
    }
    // Redefinition de la methode toString() afin d'afficher une description de chaque objet Product incluant les valeurs
    // des champ d'instance
    public String toString()
    {
        String s1 = "";
        s1 = "Numéro de l'article : "+ getNumber()+
             "\nNom               : "+ getName()+
             "\nQuantité en stock : "+ getQty() +
             "\nPrix              : "+ getPrice() +
             "\n_____________________________";
        return s1;

    }
}
