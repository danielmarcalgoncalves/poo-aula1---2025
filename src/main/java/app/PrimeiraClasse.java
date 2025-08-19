package app;    

public class PrimeiraClasse {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.nome = "Daniel";
        a1.idade = 18;

        Aluno a2 = a1;
        a2.nome = "Daniel";

    System.out.println("[A1]");    
    System.out.println("nome = "+ a1.nome);
    System.out.println("idade = "+ a1.idade);
    
    System.out.println("[A2]");    
    System.out.println("nome = "+ a2.nome);
    System.out.println("idade = "+ a2.idade);


    System.out.println("[ CHAMADA DE METODO ]");
    System.out.println("A1 = " + a1.getDados());
    System.out.println("A2 = " + a2.getDados());

    Aluno a3 = new Aluno("Maria", 23);
    System.out.println("[ CHAMADA DE METODO ]");
    System.out.println("A3 = " + a3.getDados());


    Cliente c1 = new Cliente();
    C1.setNome("teste");
    System.out.println("[CHAMADA DE GETE]");
    System.out.println(C1.GETnOME());
    }

}







