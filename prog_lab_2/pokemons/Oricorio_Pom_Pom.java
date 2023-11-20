package pokemons;

import moves.Agility;
import moves.Feather_Dance;
import moves.Revelation_Dance;
import moves.Swords_Dance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oricorio_Pom_Pom extends Pokemon
{
    public Oricorio_Pom_Pom(String name, int level)
    {
        super(name, level);

        super.setType(Type.FIRE, Type.FLYING);
        super.setStats(75, 70, 70, 98, 70, 93);
        super.setMove(new Agility(0, 0));
        super.setMove(new Swords_Dance(0, 0));
        super.setMove(new Feather_Dance(0, 100));
        super.setMove(new Revelation_Dance(90, 100));
    }
}