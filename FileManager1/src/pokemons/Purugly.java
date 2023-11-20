package pokemons;

import moves3.Bulldoze;
import ru.ifmo.se.pokemon.Type;

public class Purugly extends Glameow
{
    public Purugly(String name, int level)
    {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(71, 82, 64, 64, 59, 112);
        super.addMove(new Bulldoze(60, 100));
    }
}