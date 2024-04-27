import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


       // TODO: Conhecer e importar a classe Scanner
       System.out.println("DIgite numero do cliente: ");
       int numero = sc.nextInt();

       System.out.println("DIgite numero da agencia: ");
       String agencia = sc.next();

       System.out.println("DIgite o nome do cliente: ");
       String nomeCliente = sc.next();

       System.out.println("DIgite o saldo da conta: ");
       double saldo = sc.nextFloat();

       System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque");
       

       // TODO: Exibir as mensagens para o nosso usuario

       // TODO: Obter pela scanner os valores digitados no terminal

       // TODO: Exibir a mensagem: conta criada com sucesso!!!
    }

    
}
