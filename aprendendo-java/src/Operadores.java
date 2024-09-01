import java.util.Date;

public class Operadores {

    public static void main(String[] args) throws Exception {
        
        // Operadores de atribuição
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("peso: " + peso);
        System.out.println("sexo: " + sexo);
        System.out.println("doadorOrgao: " + doadorOrgao);
        System.out.println("dataNascimento: " + dataNascimento);
        System.out.println("----------------------------------");

        // Operadores aritmeticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado =  (10 * 7) + (20/4);
        
        System.out.println("soma: " + soma);
        System.out.println("subtração: " + subtracao);
        System.out.println("multiplicação: " + multiplicacao);
        System.out.println("divisão: " + divisao);
        System.out.println("modulo: " + modulo);
        System.out.println("resultado: " + resultado);
        System.out.println("----------------------------------");


        /* ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do 
           tipo texto, realizará a “concatenação de textos”.
        */

    
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        System.out.println("nomeCompleto: " + nomeCompleto);
                
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 
        System.out.println("concatenacao: " + concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println("1+1+1+\"1\" = " + concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println("1+\"1\"+1+1 = " + concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println("1+\"1\"+1+\"1\" = " + concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println("\"1\"+1+1+1 = " + concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println("\"1\"+(1+1+1) = " + concatenacao);

        concatenacao = (1+1+1)+"1"+(1+1+1);
        System.out.println("(1+1+1)+\"1\"+(1+1+1) = " + concatenacao);
        System.out.println("----------------------------------");


        // Operadores Unários
        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
        System.out.println("----------------------------------");


        // Operador Ternário
        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            valor = "verdadeiro";
        else
            valor = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String valor = (a==b) ? "verdadeiro" : "falso";

        System.out.println("Ternário - valor: " + valor);
        System.out.println("----------------------------------");



        // Operadores Relacionais
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2 \n");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2 \n");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2 \n");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2 \n");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2 \n");

        System.out.println("----------------------------------");
            
        /*  
            Quando estiver mais familiarizado com linguagem, recomendamos se 
            aprofundar no conceito de espaço em memória Stack versus Heap.

            Valor e referência: Precisamos entender que em Java tudo é objeto, 
            logo objetos diferentes podem ter as mesmas características, mas 
            lembrando, são objetos diferentes.
        */    
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println("nome1 == nome2: " + nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println("nome1 == nome3: " + nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println("nome3 == nome4: " + nome3 == nome4); //true
        
        //equals na parada
        System.out.println("nome1.equals(nome2): " + nome1.equals(nome2)); //??
        System.out.println("nome2.equals(nome3): " + nome2.equals(nome3)); //??
        System.out.println("nome3.equals(nome4): " + nome3.equals(nome4)); //??

        System.out.println("----------------------------------");


        // Operadores Logicos
        boolean condicao1=true;

        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");


    }
}
