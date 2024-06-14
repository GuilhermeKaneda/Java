public class Main {
    public static void main(String[] args) {
        // Questão 1
        ContaBancaria c1 = new ContaBancaria(1, 0, "Guilherme");

        if(c1.depositar(100))
            System.out.println("Deposito realizado");
        else
            System.out.println("Valor invalido");

        System.out.println(c1.getSaldo());

        if(c1.sacar(10))
            System.out.println("Saque realizado");
        else
            System.out.println("Valor invalido");

        System.out.println(c1.getSaldo());
        System.out.println(c1.toString() + "\n\n");

        // Questão 2
        Arquivo a1 = new Arquivo("Test.text");
        System.out.println(a1.abrir());
        a1.editar("Este arquivo é um teste");
        System.out.println("Arquivo editado");
        System.out.println(a1.abrir());
        a1.editar("", "Test2.txt");
        System.out.println("Arquivo editado");
        a1.limparArquivo();
        System.out.println("Arquivo limpado");
        System.out.println(a1.abrir() + "\n\n");

        // Questão 3
        Personagem p1 = new Personagem("Player1");
        Personagem p2 = new Personagem("Player2");
        Personagem p3 = new Personagem("Player3");
        Personagem p4 = new Personagem("Player4");

        while(true) {
            if(p1.atacar(p2)) {
                System.out.println(p2.getNome() + " morreu!");
                break;
            }
            if(p2.atacar(p3)) {
                System.out.println(p3.getNome() + " morreu!");
                break;
            }
            if(p3.atacar(p4)) {
                System.out.println(p4.getNome() + " morreu!");
                break;
            }
            if(p4.atacar(p1)) {
                System.out.println(p1.getNome() + " morreu!");
                break;
            }
        }
    }
}