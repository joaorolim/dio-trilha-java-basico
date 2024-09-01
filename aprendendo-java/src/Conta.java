public class Conta {

	/* Exemplo de Escopo de Variáveis */

	//variavel da classe conta
	double saldo=30.0;
	
	public void sacar(Double valor) {
		//variavel local de método
		double novoSaldo = saldo - valor;
        saldo = novoSaldo;
	}
	public void imprimirSaldo(){
		//disponível em toda classe
		System.out.println("Saldo atual: " + saldo);

		//somente o método sacar conhece esta variavel
		// System.out.println(novoSaldo);
	
	}
	public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for
		
		return valorMontante;
	}


    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.sacar(5.0);
        conta.imprimirSaldo();

        double divida = conta.calcularDividaExponencial();
        System.out.println("divida: " + divida);
    }
}