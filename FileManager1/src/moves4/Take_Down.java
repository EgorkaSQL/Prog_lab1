package moves4;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Take_Down extends PhysicalMove
{
    public Take_Down(double pow, double acc)
    {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage)
    {
        p.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected void applySelfDamage(Pokemon p, double damage)
    {
        p.setMod(Stat.HP, (int) Math.round(damage/4));
    }

    @Override
    protected String describe()
    {
        return "Использует Take Down";
    }
}