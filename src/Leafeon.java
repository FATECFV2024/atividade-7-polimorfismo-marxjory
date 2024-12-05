public class Leafeon extends Eevee {
    public Leafeon() {
        super(100,110,25.5,"Grama");
    }
    
    @Override
    public String Ataque() {
        return "Corte de Folha - Leaf Blade";
    }

    @Override
    public String Defesa() {
        return "Escudo de Folha - Leaf Shield";
    }

    @Override
    public String Especial() {
        return "Tempestade de Folhas - Leaf Storm";
    }
}
