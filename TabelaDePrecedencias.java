class TabelaDePrecedencias
{
   private static final boolean[][] TABELA =
   {{false,false,false,false,false,false,true },
    {false,false,true ,true ,true ,true ,true },
    {false,false,true ,true ,true ,true ,true },
    {false,false,true ,true ,true ,true ,true },
    {false,false,false,false,true ,true ,true },
    {false,false,false,false,true ,true ,true },
    {false,false,false,false,false,false,false}};


   private static final String OPERADORES = "(^*/+-)";

   public static boolean devoDesempilhar (char doTopo, char daSeq) throws Exception
   {
        int lin = TabelaDePrecedencias.OPERADORES.indexOf(""+doTopo);

        if (lin==-1)
            throw new Exception ("Operador do topo invalido");

        int col = TabelaDePrecedencias.OPERADORES.indexOf(""+daSeq );

        if (col==-1)
            throw new Exception ("Operador da sequencia invalido");

        return TabelaDePrecedencias.TABELA[lin][col];
   }
}