import java.util.Scanner;

public class ContaTerminal {
    private int numConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void abrirConta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do cliente: ");
        this.nomeCliente = sc.nextLine();
        System.out.println("Insira o número da conta: ");
        this.numConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira a agência da conta: ");
        this.agencia = sc.nextLine();
        System.out.println("Insira o saldo da conta: ");
        this.saldo = sc.nextDouble();
    }
    public void imprimirConta() {
        System.out.println("Dados da conta:");
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
