import java.util.Scanner;
public class paisesyciudades {
        public static void main(String[] args) {
            String[][] paises = {{"España", "Madrid", "Ferrol","Santiago"} , {"Reino_Unido", "London", "Bristol","Liverpool"} , {"Italia", "Roma", "Florencia","Venecia"} , {"Francia","Marsella", "Lyon","Paris"},{"Portugal", "Oporto", "Braga","Lisboa"}};
                
            String Pais ="";   
            
            Scanner scanner = new Scanner (System.in);
        
           System.out.println("Escriba un pais");
           Pais = scanner.next();
           

           for (int i =0; i<paises.length; i++){
                for(int j = 0; j<paises[i].length; j++) {
                    if(!paises[i][0].equalsIgnoreCase(Pais))
                    break;
                if (j > 0) {
                    System.out.println("Pais["+ i +"]["+ j +"]=" + paises[i][j]);
                }else{
                    System.out.println("Ciudades");
                }
            
           

         
        }    
           
    }
        
    scanner.close();
}

}