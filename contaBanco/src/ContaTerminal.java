import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

    //TODO:conhecer e importar a class 
     //TODO: Exibir as mensagens para o nosso usuario
    //TODO: Obter pela scanner os valores digitados no terminal
    //TODO: Exibir a mensagem conta criada 

      int numero = 12345;
      String agencia;
      String nomeCliente = "Ronierison Braz";
      double saldo = 100000.000;    
    Scanner scan = new Scanner(System.in);

     System.out.println("Por favor, digite o numero da Agência");
      agencia = scan.nextLine();   
    
    
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+ numero+" e seu saldo "+saldo+" já está disponível para saque. ");

    }
}
