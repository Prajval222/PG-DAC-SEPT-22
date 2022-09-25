class StarPattern17
{
public static void main(String[] args)
{
for (int i = 0; i <= 5; i++)
        {
        	int x = 0;
        	int y = 1;
        	System.out.print(y+" ");
            for (int j = 0; j < i; j++)
            {
            	int z = x + y;
            	System.out.print(z + " ");
            	x = y;
            	y = z;
            }
            System.out.println();
        }
    }
}