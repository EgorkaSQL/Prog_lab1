package pokemons;

import moves5.Amnesia;
import ru.ifmo.se.pokemon.Type;

public class Piloswine extends Swinub
{
    public Piloswine(String name, int level)
    {
        super(name, level);

        super.setType(Type.ICE, Type.GROUND);
        super.setStats(100, 100, 80, 60, 60, 50);
        super.addMove(new Amnesia(0, 0));;
    }
}