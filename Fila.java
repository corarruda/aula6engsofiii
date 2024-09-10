public class Fila {
    private static volatile Fila instance;
    
    public static Fila getInstance() {
        if (instance == null) {
            synchronized (Fila.class) {
                if (instance == null) {
                    instance = new Fila();
                }
            }
        }
        return instance;
    }
    
    public void adicionarDocumento(String documento) {
        // Adiciona documento à fila
    }

    public String imprimirProximoDocumento() {
        return "Documento Impresso";
    }
}
