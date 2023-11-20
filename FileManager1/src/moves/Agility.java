package moves;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class Agility extends StatusMove
{
    public Agility(double pow, double acc)
    {
        super(Type.PSYCHIC, pow, acc);
    }
    
    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.SPEED, +2);
    }

    @Override
    protected String describe()
    {
        return "Использует Agility";
    }
}