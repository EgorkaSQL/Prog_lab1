package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swords_Dance extends StatusMove
{
    public Swords_Dance(double pow, double acc)
    {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.ATTACK, +2);
    }

    @Override
    protected String describe()
    {
        return "Использует Swords Dance";
    }
}