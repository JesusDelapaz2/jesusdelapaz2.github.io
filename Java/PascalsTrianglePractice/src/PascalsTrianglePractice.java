
public class PascalsTrianglePractice
{
    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main(String[] args)
    {
        int n = 7, i, j;
        PascalsTrianglePractice g = new PascalsTrianglePractice();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {

                // for left spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++)
            {

                // nCr formula
                System.out.print
                        (
                        " "
                                + g.factorial(i)
                                / (g.factorial(i - j)
                                * g.factorial(j)));
            }

            // for newline
            System.out.println();
        }
    }
}