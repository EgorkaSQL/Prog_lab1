package pokemons;

import moves6.Blizzard;
import ru.ifmo.se.pokemon.Type;

public class Mamoswine extends Piloswine
{
    public Mamoswine(String name, int level)
    {
        super(name, level);

        super.setType(Type.ICE, Type.GROUND);
        super.setStats(110, 130, 80, 70, 60, 80);
        super.addMove(new Blizzard(110, 70));
    }
}