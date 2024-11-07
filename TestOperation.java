public class TestOperation {
    public static void main(String[]args){
        try{
            
            // PARTIE 1 - SAE 201
            
            Nombre six = new Nombre(6);
            Nombre dix = new Nombre(10);
            Nombre cinq = new Nombre(5);
            Nombre zero = new Nombre();
    
            Operation s = new Soustraction(dix,six);
            Operation m = new Multiplication(six, dix);
            Operation d = new Division(dix, cinq);
            //Operation d2 = new Division(dix, zero); Mis en commentaire pour permettre la construction des prochains objets (ligne catch par l'ArithmeticException)
    
            System.out.println(s + " = " + s.valeur());    
            System.out.println(m + " = " + m.valeur());    
            System.out.println(d + " = " + d.valeur());    
            //System.out.println(d2 + " = " + d2.valeur());
            // PARTIE 2 - SAE 201
            Expression deux = new Nombre(2);
            Expression trois = new Nombre(3);
            Expression dixSept = new Nombre(17);
            Expression sous = new Soustraction(dixSept,deux);
            Expression add = new Addition(deux,trois);
            Expression div = new Division(sous,add);
            Expression mul = new Multiplication(sous,add);
            Expression add2 = new Addition(mul,deux);
            Expression sous2 = new Soustraction(add2,dixSept);
            
            System.out.println(div + " = " + div.valeur());
            System.out.println(mul + " = " + mul.valeur());
            System.out.println(add2 + " = " + add2.valeur());
            System.out.println(sous2 + " = " + sous2.valeur());
        }
        catch (ArithmeticException e){
            System.out.println("Tentative de division par 0, opération impossible");
        }
    }
}
