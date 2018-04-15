public class Pilha <X>
{
    Object[] pilha;
    int      topo = -1,
    		  qtd = 0;
    


	public Pilha (int capacidade)
	{
		this.topo = -1;
		this.pilha = new Object[capacidade];
	}
	
	public boolean pilhaVazia() {
        if (this.topo == -1)
        {
            return true; 
        }
        return false;
	}
	
	public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.topo + 1;
	}
	
	public Object exibeUltimoValor() {
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.topo];
    }

	void empilhar (Object x)
    {
    	
    if (this.topo < this.pilha.length - 1) 
	    { 
    		this.topo++;
	        this.pilha[topo] = x;
	        this.qtd++;
	    }
    }
	
	public Object desempilhar() {
        if (pilhaVazia()) {
            return null;
        }
        this.qtd--;
        
        return this.pilha[this.topo--];
	}
	
	
	public boolean equals (Object obj)
    {
		if (this==obj)
		    return true;

		if (obj==null)
		    return false;

		if (this.getClass() != obj.getClass())
		    return false;

		Pilha<X> pil = (Pilha<X>)obj;

		if (this.qtd!=pil.qtd)
		    return false;

		int iThis = this.topo;
		int iFil  = pil .topo;

		for (int i=0; i<this.qtd; i++)
		{
			if (!this.pilha[iThis].equals(pil.pilha[iFil]))
			    return false;

			iThis++;
			if(iThis==this.pilha.length)
			    iThis=0;

			iFil++;
			if(iFil==pil.pilha.length)
			    iFil=0;
		}

		return true;
	}
	
	 public String toString ()
	    {
	        String ret="";
	        
	        for (int i=0; i<this.pilha.length; i++)
	        {
	        	ret += this.pilha[i] += "\n";	            
	        }
	        	        
	        return ret;
	    }
	
}