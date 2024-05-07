import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do cliente: ");
        String NomeCliente = sc.nextLine();
        System.out.println("digite o Numero da conta: ");
        int Numero = sc.nextInt();
        System.out.println("digite o saldo do cliente: ");
        Double Saldo = sc.nextDouble();
        System.out.println("digite a agencia: ");
        String Agencia = sc.next();

        System.out.println("ola "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia+", conta " +Numero+
        " e seu saldo " +Saldo+" já está disponivel para saque");
        sc.close();
    }
}
