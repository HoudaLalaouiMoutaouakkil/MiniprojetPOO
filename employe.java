public class employe {

    private int matricule;
    private String nom;
    private String prenom;
    private int age;
    private double salaire;

    public employe(int matricule, String nom, String prenom, int age, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire;
    }



    public void setMatricule(int matricule) {
        matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setNom(String nom) {
        nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        salaire = salaire;
    }

    public static void menu (){
        System.out.print("""
                                         Menu du programme
                1 - Ajouter un nouvel employé\t
                2 - Modifier un employé\t
                3 - Supprimer un employé\t
                4 - Afficher un employé\t
                5 - Afficher tous les employés\t
                6 - Calculer le nombre des employés ayant un salaire qui dépasse 10000.\t
                7 - Afficher l’employé le plus âgé.\t
                8 - Afficher l’employé le moins âgé.\t
                9 - Quitter\t
                Donner votre choix :""");

    }
    @Override
    public String toString() {
        return
                "   * matricule  = " + matricule +'\n'+
                        "     * nom        = " + nom + '\n' +
                        "     * prenom     = " + prenom + '\n' +
                        "     * age        = " + age +'\n' +
                        "     * salaire    = " + salaire +'\n'
                ;
    }


}