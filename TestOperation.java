import java.util.Scanner;

public class TestOperation {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String choixUser;

        System.out.println("-- Calculatrice Simple en JAVA --");
        System.out.println("Choisissez une opération :\n");
        System.out.println("\t1- Addition / 2- Soustraction / 3- Multiplication / 4- Division\n");
        System.out.println("FIN pour arrêter le programme\n\n");

        while (true) {
            System.out.println("Votre choix d'opération: ");
            choixUser = scanner.nextLine();

            if((choixUser.toLowerCase()).equals("fin")){
                System.out.println("Merci d'avoir testé");
                break;
            }

            if (!choixUser.matches("[1-4]")){
                System.out.println("Veuillez entrer un numéro entre 1 et 4.");
                continue;
            }

            System.out.println("Entrez la première valeure: ");
            double choix1 = scanner.nextDouble();
            System.out.println("Entrez la deuxième valeure: (Attention pas de 0 si division)");
            double choix2 = scanner.nextDouble();
            scanner.nextLine();

            Expression exp1 = new Nombre(choix1);
            Expression exp2 = new Nombre(choix2);
            Expression calcul = null;

            if(choixUser.equals("1")){
                calcul = new Addition(exp1, exp2);
                System.out.println(calcul + " = " + calcul.valeur() + "\n");
            }

            else if(choixUser.equals("2")){
                calcul = new Soustraction(exp1, exp2);
                System.out.println(calcul + " = " + calcul.valeur() + "\n");
            }
            
            else if(choixUser.equals("3")){
                calcul = new Multiplication(exp1, exp2);
                System.out.println(calcul + " = " + calcul.valeur() + "\n");
            }

            else if (choixUser.equals("4")){
                try{
                    calcul = new Division(exp1, exp2);
                    System.out.println(calcul + " = " + calcul.valeur() + "\n");
                }
                catch (ArithmeticException err1){
                    System.out.println("Vous avez diviser par 0\n\nChoisissez une opération à nouveau\n");
                }   
            }

            

        }

        scanner.close();

    }
}
