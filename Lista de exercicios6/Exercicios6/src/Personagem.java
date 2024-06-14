import java.util.Random;

public class Personagem {
    private String nome;
    private int vida, armadura, ataque;
    Random rand = new Random();

    public Personagem (String nome) {
        this.nome = nome;
        vida = 100;
        ataque = rand.nextInt(10) + 20;
        armadura = rand.nextInt(5) + 10;
    }

    public boolean atacar (Personagem inimigo) {
        inimigo.setVida(inimigo.getVida() -  (ataque - inimigo.getArmadura()));

        if(inimigo.getVida() <= 0)
            return true;
        return false;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
