public class JavaOperaciones {
    public static void main(String[] args) {

        for (int i=1; i<11; i++) {
            System.out.println("\n******************** " );
            System.out.println("\nTABLA DE MULTIPLICAR DEL " + i);
            for (int j=1; j<11; j++) {
                System.out.println( i + "x" + j + "=" + i*j);
            }
        }
    }
}
