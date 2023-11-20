import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class App 
{
    public static void main(String[] args)
    {
        Battle b = new Battle();
        b.addAlly(new Mamoswine("Mamos", 1));
        b.addAlly(new Swinub("Swinka", 1));
        b.addAlly(new Glameow("Glam", 1));
        b.addFoe(new Purugly("Purugl", 1));
        b.addFoe(new Oricorio_Pom_Pom("Oricorio Porfovour", 1));
        b.addFoe(new Piloswine("Pila", 1));
        b.go();
    }
}