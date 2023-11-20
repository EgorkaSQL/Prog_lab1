package moves6;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove
{
    public Blizzard(double pow, double acc)
    {
        super(Type.ICE, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p)
    {
        if(Math.random()<=0.1)
        {
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe()
    {
        return "Использует Blizzard";
    }
}