import java.util.Arrays;

public class prog_lab_1 
{
    public static void main(String[] args)
    {
        long[] c = new long[12];

        for (int i = 0; i < c.length; i++)
        {
            c[i] = (i + 1) * 2;
        }

        int[] intc = new int[c.length];
        
        for (int i = 0; i < c.length; i++)
        {
            intc[i] = (int) c[i];
        }
        
        float[] x = new float[17];
        
        for (int i = 0; i < x.length; i++)
        {
            x[i] = (float) ((Math.random() * 17 - 9));
        }
        
        final int ROW = 12;
        final int COL = 17;
        double[][] C = new double[ROW][COL];

        for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
            {
                switch (intc[i])
                {
                case 6:
                    C[i][j] = Math.log(Math.pow(5 + Math.pow(Math.PI / Math.abs(x[j]), 2) / Math.pow(Math.cos(x[j]), 2), 2));
                    break;
                case 4:
                case 10:
                case 14:
                case 20:
                case 24:
                    C[i][j] = Math.atan(Math.cos(Math.pow(Math.log(Math.abs(x[j])) / 2, Math.atan((x[j] - 0.5) / 17))));
                    break;
                default:
                    C[i][j] = (1.0 / 4) * (Math.asin(0.25 * 0.25 * ((x[j] - 0.5) / 17)) - 1);
                }
            }
        }

        for (int i = 0; i < ROW; i++)
        {
            boolean Otrizc = true;

            for (int j = 0; j < COL; j++)
            {
                if (C[i][j] >= 0) 
                {
                    Otrizc = false;
                    break;
                }
            }
            
            if (Otrizc)
            {
                for (int j = 0; j < COL; j++)
                {
                    C[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
            {
                if (C[i][j] == 0)  
                {
                    System.out.printf("%10s", "Слово");
                }
                else
                {
                    System.out.printf("%10.3f", C[i][j]);
                }
            }
            System.out.println();
        }
    }
}
