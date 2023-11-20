package moves3;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Bulldoze extends PhysicalMove
{
    public Bulldoze(double pow, double acc)
    {
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p)
    {
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe()
    {
        return "Использует Bulldoze";
    }
}