public class Eevee {

    private String tipo;
    private double peso;
    private int altura;
    private int hp;

    ///construtor
    public Eevee (int altura, int hp, Double peso, String tipo) {
        this.altura = altura;
        this.hp = hp;
        this.peso = peso;
        this.tipo = tipo;
    }

    // get e setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String Ataque(){
        return "Ataque";
    }

    public String Defesa(){
        return "Desvio";
    }

    public String Especial(){
        return "Tri-Ataque";
    }

    public String getTipo() {
        return tipo;
    }
    //// print
    public void imprimir(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("HP: " + hp);

    }
}