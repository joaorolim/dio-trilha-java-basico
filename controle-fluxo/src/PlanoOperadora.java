public class PlanoOperadora {
    public static void main(String[] args) {
        // O sistema terá 03 planos: BASIC, MIDIA , TURBO
        String plano = "T"; 

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Intagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}