package indiabix;

public class TestArray
{
    public static void main(String [] args) 
    {
    int [] [] [] x = new int [3] [] [];
    int i, j;
    x[0] = new int[4][];
    x[1] = new int[2][];
    x[2] = new int[5][];
    for (i = 0; i < x.length; i++)
    {
        for (j = 0; j < x[i].length; j++) 
        {
            x[i][j] = new int [i + j + 1];
            System.out.println("size = " + x[i][j].length);
        }
    }
    }
}

	

//In the given program, how many lines of output will be produced? 
//Answer is : 11 line---> 4+2+5=11