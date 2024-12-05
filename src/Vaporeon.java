public class Vaporeon extends Eevee {
    
    public Vaporeon() {
        super(100,160,29.0,"Água");
    }

    @Override
    public String Ataque() {
        return "Jato de Água - Water Gun";
    }

    @Override
    public String Defesa() {
        return "Escudo de Bolha - Bubble Shield";
    }

    @Override
    public String Especial() {
        return "Hidro Bomba - Hydro Pump";
    }
}
