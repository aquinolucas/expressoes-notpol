import java.util.StringTokenizer;

public class Expressoes
{
    String[] item = new String [10];
    int      topo = -1;

    void ordenaDados (String exp)
    {
    	StringTokenizer quebrador = new StringTokenizer (exp, "+-*/^()", true);
    	
    	String pedaco = quebrador.nextToken();
    	boolean ehNro;
    	double nro = 0;
    	try
    	{
    	  nro = Double.parseDouble(pedaco);
    	  ehNro = true;
    	}
    	 catch (NumberFormatException erro)
    	{  ehNro = false;
    	}

    	
    	do
    	{
    
    	}
    	while (quebrador.hasMoreTokens());
    }
   

    
    void guardeUmItem (String x)
    {
    ....
    }

    String getUmItem ()
    {
    ...
    }

    void jogueUmItemFora ()
    {
    ...
    }
}