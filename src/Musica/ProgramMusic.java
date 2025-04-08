public class ProgramMusic {
    public static void main(String[] args){
        Musica music1 = new Musica(null, null, 0);
        Musica music2 = new Musica(null, null, 0);
        Musica music3 = new Musica(null, null, 0);
        Compositor c1 = new Compositor(null, null);
        Compositor c2 = new Compositor(null, null);
        Compositor c3 = new Compositor(null, null);
        //Iniciados
        System.out.println("----------------------------");
        System.out.println(music1.toString());
        System.out.println(music1.compositor.toString());
        System.out.println(music2.toString());
        System.out.println(music2.compositor.toString());
        System.out.println(music3.toString());
        System.out.println(music3.compositor.toString());
        System.out.println("----------------------------");
        //Colocando dados nas musicas e compositores usando set
        music1.setData("Musica1", "M1", 1);
        music2.setData("Musica2", "M2", 2);
        music3.setData("Musica3", "M3", 3);
        c1.setDataC("C1","C1");
        c2.setDataC("C2", "C2");
        c3.setDataC("C3","C3");
        music1.compositor = c1;
        music2.compositor = c2;
        music3.compositor = c3;
        System.out.println("Musicas e Compositores");
        System.out.println("----------------------------");
        System.out.println(music1.toString());
        System.out.println(music1.compositor.toString());
        System.out.println(music2.toString());
        System.out.println(music2.compositor.toString());
        System.out.println(music3.toString());
        System.out.println(music3.compositor.toString());
    }
}
