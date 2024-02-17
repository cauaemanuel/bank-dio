public class Main {

	public static void main(String[] args) {
		Cliente p1 = new Cliente();
		p1.setNome("Karol");
		
		Conta cc = new ContaCorrente(p1);
		Conta poupanca = new ContaPoupanca(p1);

		cc.depositar(1300);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
     }
}