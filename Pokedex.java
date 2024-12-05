public class Pokedex {
    public static void main(String[] args) {

        Eevee e = new Eevee(30, 60, 6.5, "Normal");
        Joltreon j = new Joltreon();
        Umbreon  u = new Umbreon();
        Vaporeon v = new Vaporeon();
        Flareon  f = new Flareon();
        Espeon   es = new Espeon();
        Leafeon  lf = new Leafeon();
        Glaceon  gl = new Glaceon();
        Sylveon  sy = new Sylveon();

        System.out.println("Eu sou: Eevee ");
        e.imprimir();
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial());

        e = j;

        System.out.println("Eu sou: Joltreon ");
        e.imprimir();
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial());

        e = u;

        System.out.println("Eu sou: Umbreon ");
        e.imprimir();
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial());

        e = v;

        System.out.println("Eu sou: Vaporeon ");
        e.imprimir();
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial());

        e = f;

        System.out.println("Eu sou: Flareon ");
        e.imprimir();
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial());

        e = es;

        System.out.println("Eu sou: Espeon ");
        e.imprimir();
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial());
        System.out.print("\n");

        e = lf;

        System.out.println("Eu sou: Leafeon ");
        e.imprimir();
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial());
        
        e = gl;

        System.out.println("Eu sou: Glaceon ");
        e.imprimir();
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial());

        e = sy;

        System.out.println("Eu sou: Sylveon ");
        e.imprimir();
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("Especial: " + e.Especial());


    }
}