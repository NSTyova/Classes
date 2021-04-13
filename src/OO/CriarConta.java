package OO;

public class CriarConta {

	public static void main(String[] args) {
		Cliente jose = new Cliente();
		jose.nome="Salvador Tyova";
		
		
		Conta contaJose = new Conta(123, 111);
		contaJose.setSaldo(200);
		contaJose.levantar(400);
		
		Conta contaMario = new Conta(123, 111);
		contaMario.setSaldo(400);
		contaMario.levantar(400);
		
		contaJose.setTitular(jose);
		System.out.println(contaJose.getTitular().nome);
		System.out.println(contaJose.getSaldo());
		System.out.println(contaJose.getAgencia());
		
		System.out.println(Conta.getTotal());
		
	}
}
