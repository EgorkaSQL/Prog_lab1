package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Revelation_Dance extends SpecialMove
{
    public Revelation_Dance(double pow, double acc)
    {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.ATTACK, 70);
    }

    @Override
    protected String describe()
    {
        return "Использует Revelation Dance";
    }
}