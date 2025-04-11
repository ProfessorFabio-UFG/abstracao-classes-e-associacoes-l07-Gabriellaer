public class MainEmpresa {
	public static void main(String[] args) {
		Endereco end = new Endereco(null, 0, null, null, null, null);
		Endereco funcEnd = new Endereco("Casa", 1, "Na", "Rua", "De", "Uma Casa");
		Empresa e1 = new Empresa(null, null, null, null);
		Empregado func = new Empregado(null,0,null,null);
		
		end.setRua("Antio");
		end.setNumero(1);
		end.setBairro("C");
		end.setCidade("Trindade");
		end.setEstado("Goias");
		end.setComplemento("Quadrado");
		
		e1.setCnpj("77777777");
		e1.setEnd(end);
		e1.setRazao("OLA");
		
		func.setEmp(e1);
		func.setEnd(funcEnd);
		func.setMatri(1);
		func.setNome("John");
		e1.setEmp(func);
		
		System.out.println(func.toString());
		System.out.println("----------------------------------");
		System.out.println(e1.toString());
	}
}
