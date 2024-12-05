public class Espeon extends Eevee {

        public Espeon() {
        super(90,120,26.5,"Psiquico");
        }
    
        @Override
        public String Ataque() {
            return "Confusão - Confusion";
        }
    
        @Override
        public String Defesa() {
            return "Barreira Psíquica - Psychic Barrier";
        }
    
        @Override
        public String Especial() {
            return "Raio Psíquico - Psychic";
        }   
}

