package moves5;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Amnesia extends StatusMove
{
    public Amnesia(double pow, double acc)
    {
        super(Type.PSYCHIC, pow, acc);
    }

    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.SPECIAL_DEFENSE, +2);
    }

    @Override
    protected String describe()
    {
        return "Использует Amnesia";
    }
}