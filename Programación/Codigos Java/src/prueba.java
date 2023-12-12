public class prueba {
    
    public static void main(String[] args) {
        String[][] notas = {{"Juan","10","9.5","9.8"},{"Laura","10.0","9.5","10.0"},{"Saúl","0","0.5","2.8"}};

        for(String[] alumno : calcularMedias(notas)){
            System.out.printf("Alumno: %s Nota: %.2f \n", alumno[0], Double.parseDouble(alumno[1]));
        }
    }
    
    static String[][] calcularMedias(String[][] arr){
        String[][] medias = new String[arr.length][2];
        
        for(int i = 0; i < medias.length; i++){
            medias[i][0] = arr[i][0];
            double[] notas = new double[arr[i].length - 1];

            for(int j = 1; j < arr[i].length; j++){
                notas[j - 1] = Double.parseDouble(arr[i][j]);
            }

            medias[i][1] = String.valueOf(calcularMedia(notas));
        }

        return medias;
    }
    
    static double calcularMedia(double[] notas){
        double suma = 0.0;

        for(double nota : notas){
            suma += nota;
        }

        return notas.length != 0 ? suma / notas.length : 0.0;
    }
}
