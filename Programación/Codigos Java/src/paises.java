public class paises {
    public static void main(String[] args) {
        
        String[] paises = {"España", "Reino Unido", "Italia","Francia","Portugal"};
    
            for(int i = 0; i< paises.length; i++) {
                System.out.println("Pais["+ i +"] = " +paises[i]);
            }    
            for(int i= paises.length -1; i >=0; i--) {

                System.out.println("Pais[" + i +"] = " +paises[i]);
            }

            for (String pais:paises) {
                System.out.println("Pais[] = " + pais);
            }
        
    }    
        
}
    
    

