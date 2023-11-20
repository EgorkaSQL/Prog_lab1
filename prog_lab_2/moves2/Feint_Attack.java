package moves2;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Feint_Attack extends PhysicalMove
{
    public Feint_Attack(double pow, double acc)
    {
        super(Type.DARK, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.ATTACK, +1);
    }

    @Override
    protected String describe()
    {
        return "Использует Feint Attack";
    }
}