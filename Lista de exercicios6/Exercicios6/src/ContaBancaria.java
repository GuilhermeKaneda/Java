public class ContaBancaria {
    //Atributos
    private int numero;
    private double saldo;
    private String titular;

    //Construtor
    public ContaBancaria(int id, double saldo, String titular) {
        this.numero = id;
        this.saldo = saldo;
        this.titular = titular;
    }

    //Métodos
    public boolean depositar(double valor) {
        if(valor<=0)
            return false;
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if(valor>saldo || valor<=0)
            return false;
        saldo -= valor;
        return true;
    }
    public int getId() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    @Override
    public String toString() {
        return "ContaBancaria {" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
