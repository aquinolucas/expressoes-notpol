public class Programa
{
   public static void main (String[] args)
   {
        try
        {
			Pilha<String> p1 = new Pilha<String> (3);
			p1.empilhar ("UNICAMP");
			p1.empilhar ("COTUCA");
			p1.empilhar ("DPD");
			p1.desempilhar();
			p1.desempilhar();

			System.out.println (p1.toString());
			
		}
		catch (Exception erro)
		{
			System.err.println (erro.getMessage());
			String s1 = new String ("COTUCA");
			String s2 = new String ("COTUCA");
			String s3 = s1;
			String s4 = new String ("UNICAMP");
		}
   }
}