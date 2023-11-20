package moves2;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Work_Up extends StatusMove
{
    public Work_Up(double pow, double acc)
    {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.ATTACK, +1);
        p.setMod(Stat.SPECIAL_ATTACK, +1);
    }

    @Override
    protected String describe()
    {
        return "Использует Work Up";
    }
}