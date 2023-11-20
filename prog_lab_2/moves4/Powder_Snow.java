package moves4;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Powder_Snow extends SpecialMove
{
    public Powder_Snow(double pow, double acc)
    {
        super(Type.ICE, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p)
    {
        if(Math.random() <= 0.1)
        {
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe()
    {
        return "Использует Powder Snow";
    }
}