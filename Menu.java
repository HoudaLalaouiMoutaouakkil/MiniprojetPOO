import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    //ajouter un employé
    static void ajouterEmploye () {

        System.out.print("Entrer le matricule :");
        int Matricule = sc.nextInt();
        System.out.print("Entrer le nom :");
        String Nom = sc.next();
        System.out.print("Enter le prenom :");
        String Prenom = sc.next();
        System.out.print("Entrer l'age :");
        int Age = sc.nextInt();
        System.out.print("Entre le salaire :");
        double Salaire = sc.nextDouble();
        employe e = new employe(Matricule, Nom, Prenom, Age, Salaire);
        emp.add(e);
        System.out.println(emp);

    }
    //modifier un employé
    public static void modifier () {
        System.out.println("Entrez le matricule de l'employé à modifier:");
        int matricule = sc.nextInt();
        for (employe i:emp) {
            if (i.getMatricule()==matricule){
                System.out.println("Entrez le matricule:");
                int Matricule = sc.nextInt();
                System.out.println("Entrez le nom:");
                String nom = sc.next();
                System.out.println("Entrez le prenom:");
                String prenom = sc.next();
                System.out.println("Entrez le age:");
                int age = sc.nextInt();
                System.out.println("Entrez le salaire:");
                int salaire = sc.nextInt();
                i.setMatricule(Matricule);
                i.setNom(nom);
                i.setPrenom(prenom);
                i.setAge(age);
                i.setSalaire(salaire);
                System.out.println("La modification est faite");
            }else {
                System.out.println("Cet employe n'existe pas");
            }
        }
    }

    //supprimer un employe
    public static void supprimer() {
        System.out.print("Entrer le matricule de l'employer à supprimer : ");
        int Matricule = sc.nextInt();
        for (int i = 0; i < emp.size(); i++) {
            if (Matricule == emp.get(i).getMatricule()) {
                emp.remove(i);
                System.out.print("supression avec succès");
            } else {
                System.out.print("cet employe n'existe pas ");
            }
        }
    }

    //afficher un employe
    public static void afficherEmploye () {
        System.out.print("Entrer  le matricule de l'employé à afficher :");
        int Matricule = sc.nextInt();
        int i = 0;
        for (employe e : emp) {
            i++;
            if (e.getMatricule() == Matricule) {
                System.out.println("les information de employé c'est" + e.getMatricule()+e.getNom()+e.getPrenom()+e.getAge());
            } else {
                System.out.println("cet employé n'existe pas ");
            }
        }
    }
    //afficher tous les employés
    public static void affichertous () {
        if(emp.isEmpty()){
            System.out.println("la liste des employés est vide");
        }
        for (int i = 0; i < emp.size(); i++) {
            System.out.println(emp.get(i));
        }
    }
    //emplyés ayant un salaire qui dépasse 10000
    public static void salaire () {
        int n = 0;

        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).getSalaire() > 1000) {
                n += 1;
            }
            else {
                System.out.println("Aucun employé ne dépasse 10000 ");
            }
        }
        System.out.println("le nombre des employés ayant un salaire qui dépasse 10000 est : " + n);
    }

    //age max
    public static void agemax(){
        int agemax =emp.get(0).getAge() ;
        for (int i = 0; i < emp.size(); i++)
            if (agemax >emp.get(i).getAge()) {
                agemax = emp.get(i).getAge();
                System.out.println("la employe le plus agé est celui qui a le matricule:" +emp.get(i).getMatricule()+",son age est"+ agemax);
            }
    }
    //age min
    public static void agemin(){
        int agemin = emp.get(0).getAge();
        for (int i = 0; i < emp.size(); i++)
            if (agemin< emp.get(i).getAge()) {
                agemin = emp.get(i).getAge();
                System.out.println("l'employe le mois agé est celui qui a le matricule:" +emp.get(i).getMatricule()+",son age est"+ agemin);
            }
            else {
                System.out.println("la liste est vide " );
            }}

    //quitter
    public static void quitter(){
        System.out.println("Fin de programme");
        System.exit(0);
    }
//*******************************************************************
   public static ArrayList<employe> emp = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        employe.menu();
        int x = sc.nextInt();

        while (x < 1 || x > 9) {
            employe.menu();
            x = sc.nextInt();
        }

        while (x >= 1 && x <= 9) {
            switch (x) {
            //ajouter un employé
                case 1:
                    ajouterEmploye();
                    employe.menu();
                    x = sc.nextInt();
                    break;
            //modifier un employé
                case 2:
                    modifier();
                    employe.menu();
                    x = sc.nextInt();
                    break;
            //supprimer un employé
                case 3:
                    supprimer();
                    employe.menu();
                    x = sc.nextInt();

                    break;
            //afficher un employé
                case 4:
                    afficherEmploye();
                    employe.menu();
                    x = sc.nextInt();

                    break;
            //afficher tous les employés
                case 5:
                    affichertous();
                    employe.menu();
                    x = sc.nextInt();

                    break;
            //salaire dépasse 10000
                case 6:
                    salaire();
                    employe.menu();
                    x = sc.nextInt();
                    break;
            //age max
                case 7:
                    agemax();
                    employe.menu();
                    x = sc.nextInt();
                    break;
            //age min
                case 8:
                    agemin();
                    employe.menu();
                    x = sc.nextInt();
                    break;
            //quitter
                case 9:
                    quitter();
                break;
            }
        }
    }
        }
