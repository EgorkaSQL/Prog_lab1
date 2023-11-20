package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Feather_Dance extends StatusMove
{
    public Feather_Dance(double pow, double acc)
    {
        super(Type.FLYING, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p)
    {
        p.setMod(Stat.ATTACK, -2);
    }

    @Override
    protected String describe()
    {
        return "Использует Feather Dance";
    }
}