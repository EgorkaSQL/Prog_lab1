package pokemons;

import moves2.Feint_Attack;
import moves2.Hone_Claws;
import moves2.Work_Up;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Glameow extends Pokemon
{
    public Glameow(String name, int level)  
    {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(49, 55, 42, 42, 37, 85);
        super.setMove(new Hone_Claws(0, 0));
        super.setMove(new Feint_Attack(60, 0));
        super.setMove(new Work_Up(0, 0));
    }
}