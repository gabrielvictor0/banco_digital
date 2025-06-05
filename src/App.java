public class App {
    public static void main(String[] args) throws Exception {
        Cliente gabriel = new Cliente();
        gabriel.setNome("gabriel");

        Conta cc = new ContaCorrente(gabriel);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(gabriel);

        cc.transferir(100, poupanca);

        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();
    }
}
