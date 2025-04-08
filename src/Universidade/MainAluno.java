public class MainAluno {
    public static void main(String[] args){
        Departamento d1 = new Departamento(null,null);
        Curso c1 = new Curso(null,null,d1);
        Aluno al1 = new Aluno(null,0,0,c1);
        
        d1.setNome("Informatica");
        d1.setSigla("INF");
        
        c1.setNome("Ciencia Da Computação");
        c1.setSigla("CC");
        
        al1.setNome("Gabriel");
        al1.setMatri(000001);
        al1.setAno(1);
        al1.setCurso(c1);
        
        System.out.println(al1.toString());
    }    
}
