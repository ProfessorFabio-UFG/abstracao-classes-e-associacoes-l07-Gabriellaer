public class MainMusic {
	public static void main(String[] args) {
		Compositores c1 = new Compositores(null,null);
		Compositores c2 = new Compositores(null,null);
		Musicas m1 = new Musicas(null,0,null,null);
		Musicas m2 = new Musicas(null,0,null,null);
		

		c1.setNacio("Brasil");
		c1.setNome("Gringo");
		c2.setNacio("Trindade");
		c2.setNome("GO");
		
		m1.setNome("A");
		m1.setAno(1);
		m1.setTipo("A");
		m1.setComp(c1);
		
		m2.setNome("B");
		m2.setAno(2);
		m2.setTipo("B");
		m2.setComp(c2);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
	}
}
