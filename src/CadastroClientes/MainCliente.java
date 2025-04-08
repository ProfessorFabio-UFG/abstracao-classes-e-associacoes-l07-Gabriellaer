public class MainCliente {
	public static void main(String[] args) {
		Endereco end = new Endereco(null,0,null,null,null,null);
		Cliente c1 = new Cliente(null,null,end);
		
		end.setRua("A");
		end.setNumero(1);
		end.setBairro("B");
		end.setComplemento("C");
		end.setCidade("D");
		end.setEstado("E");
		c1.setNome("Gabriel Marques");
		c1.setCPF("123456");
		
		System.out.println(c1.toString());
	}
}
