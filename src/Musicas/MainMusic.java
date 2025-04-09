public class MainMusic {
	public static void main(String[] args) {
		Compositores c1 [] = new Compositores[3];
		
		c1[0] = new Compositores(null,null);
		c1[0].setNome("Gabriel");
		c1[1] = new Compositores(null,null);
		c1[1].setNome("John");
		c1[2] = new Compositores(null,null);
		c1[2].setNome("Carlo");
		
		c1[0].setNacio("Brasil");
		c1[1].setNacio("BR");
		c1[2].setNacio("B");
		Musicas m1 = new Musicas(null,0,null,c1);
		Musicas m2 = new Musicas(null,0,null,c1);
		
		c1[0] = new Compositores(null,null);
		c1[0].setNome("Gabriel");
		c1[1] = new Compositores(null,null);
		c1[1].setNome("John");
		c1[2] = new Compositores(null,null);
		c1[2].setNome("Carlo");
		
		c1[0].setNacio("Brasil");
		c1[1].setNacio("BR");
		c1[2].setNacio("B");
		
		m1.setNome("A");
		m1.setAno(1);
		m1.setTipo("A");
		m1.setComp(c1);
		
		m2.setNome("B");
		m2.setAno(2);
		m2.setTipo("B");
		m2.setComp(c1);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
	}
}
