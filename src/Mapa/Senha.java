package Mapa;

public class Senha {
    private char tipo;
    private int numero;
    
    /**
     * Método construtor da classe.
     * 
     * @param tipo
     * @param numero 
     */
    public Senha(char tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    /**
     * Aqui sobrepomos o método toString,
     * que apenas nos retorna a senha no formato necessário e respeitando as devidas prioridades
     *(P-1, R-2, C-3).
     */
    @Override
    public String toString() {
        return this.tipo + "-" + this.numero;
    }
   
    // Métodos acessores getters e setters.
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
