package pokemons;

import moves4.Powder_Snow;
import moves4.Take_Down;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon
{
    public Swinub(String name, int level)
    {
        super(name, level);

        super.setType(Type.ICE, Type.GROUND);
        super.setStats(50, 50, 40, 30, 30, 50);
        super.setMove(new Take_Down(90, 85));
        super.setMove(new Powder_Snow(40, 100));
    }
}