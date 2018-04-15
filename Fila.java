public class Fila <X>
{
  //private X     [] item;
    private Object[] item;
    private int      inicio =  0,
                     fim    = -1,
                     qtd    =  0;

    public Fila (int capacidade) throws Exception
    {
        if (capacidade<=0)
        {
            Exception erro;
            erro = new Exception ("Capacidade invalida");
            throw erro;
        }

      //this.item = new X      [capacidade];
        this.item = new Object [capacidade];

        for (int i=0; i<this.item.length; i++)
            this.item[i]=null;
    }

    public void guardeUmItem (X x) throws Exception
    {
        if (x==null)
            throw new Exception ("Guardar oque?");

        if (this.qtd==this.item.length)
            throw new Exception ("Nao cabe mais nada");

        this.fim++;
        if (this.fim==this.item.length)
            this.fim = 0;
        this.item[this.fim] = x;
        this.qtd++;
    }

    public X getUmItem () throws Exception
    {
        if (this.qtd==0)
            throw new Exception ("Nada para recuperar");

        return (X)this.item[this.inicio];
    }

    public void jogueUmItemFora () throws Exception
    {
        if (this.qtd==0)
            throw new Exception ("Nada para jogar fora");

        this.item[this.inicio] = null;
        this.inicio++;
        if (this.inicio==this.item.length)
            this.inicio=0;
        this.qtd--;
    }

    public boolean cheia ()
    {
        if (this.qtd==this.item.length)
            return true;
        else
            return false;
    }

    public boolean vazia ()
    {
        if (this.qtd==0)
            return true;
        else
            return false;
    }

    public boolean equals (Object obj)
    {
		if (this==obj)
		    return true;

		if (obj==null)
		    return false;

		if (this.getClass() != obj.getClass())
		    return false;

		Fila<X> fil = (Fila<X>)obj;

		if (this.qtd!=fil.qtd)
		    return false;

		int iThis = this.inicio;
		int iFil  = fil .inicio;

		for (int i=0; i<this.qtd; i++)
		{
			if (!this.item[iThis].equals(fil.item[iFil]))
			    return false;

			iThis++;
			if(iThis==this.item.length)
			    iThis=0;

			iFil++;
			if(iFil==fil.item.length)
			    iFil=0;
		}

		return true;
	}
}