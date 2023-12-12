import java.util.Scanner;
public class Signozodiacal {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int dia;
         do {
             System.out.println("Introduzca el día de nacimiento (entre 1 y 31):");
             dia = scanner.nextInt();
         } while (dia < 1 || dia > 31);
 
         int mes;
         do {
             System.out.println("Introduzca el mes de nacimiento (entre 1 y 12):");
             mes = scanner.nextInt();
         } while (mes < 1 || mes > 12);
       

        String Signozodiacal = obtenerSignozodiacal(dia, mes);

        System.out.println("Tu signo zodiacal es " + Signozodiacal);
        scanner.close();
    }

    public static String obtenerSignozodiacal(int dia, int mes) {
        int[] LimiteDias = {20,19,20,20,20,20,22,23,22,23,22,21};
        
        if (dia <= LimiteDias[mes - 1 ]) {
    
        if ((mes == 1 && dia > 20 ) || (mes == 2 && dia <= 19))  {
            return "Acuario";

        } else if ((mes == 2 && dia > 19) || (mes == 3 && dia <= 20))  {
            return "Piscis";

        } else if ((mes == 3 && dia > 20) || (mes == 4 && dia <= 20))  {
            return "Aries";

        } else if ((mes == 4 && dia > 20) || (mes == 5 && dia <= 20))  {
            return "Tauro";

        } else if ((mes == 5 && dia > 20) || (mes == 6 && dia <= 20))  {
            return "Geminis";    

        } else if ((mes == 6 && dia > 20) || (mes == 7 && dia <= 22))  {
            return "Cancer";  

        } else if ((mes == 7 && dia > 22) || (mes == 8 && dia <= 23))  {
            return "Leo";   

        } else if ((mes == 8 && dia > 23) || (mes == 9 && dia <= 22))  {
            return "Virgo";   

        } else if ((mes == 9 && dia > 22) || (mes == 10 && dia <= 23))  {
            return "Libra";   

        } else if ((mes == 10 && dia > 23) || (mes == 11 && dia <= 22))  {
            return "Escorpio";   

        } else if ((mes == 11 && dia > 22) || (mes == 12 && dia <= 21))  {
            return "Sagitario";   
        } else if ((mes == 12 && dia > 21) || (mes == 1 && dia <= 20))  {
            return "Capricornio";
        }
         
    }    
        return "Signo no encontrado";  
    }

}    
