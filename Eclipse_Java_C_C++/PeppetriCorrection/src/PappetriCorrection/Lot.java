package PappetriCorrection;



public class Lot implements IFacturable {
	AritcleC articles[];
	private int nbrearticles;



	public Lot(int nbrearticles) {
		super();
		this.nbrearticles = nbrearticles;
		this.articles=new AritcleC[nbrearticles];
	}

	public int getNbrearticles() {
		return nbrearticles;
	}

	public void setNbrearticles(int nbrearticles) {
		this.nbrearticles = nbrearticles;
	}

	@Override

	public double calculerFacture() {
		// TODO Auto-generated method stub

		double Somme =0; 
		for (int i =0; i < this.articles.length; i++)
		{
			if (articles[i]!=null)
			{
				Somme= Somme + this.articles[i].getPrix();
			}
		}
		return Somme;
	}


	public AritcleC getArticle(int i) 

	{
		return articles[i];
	}

	public boolean ajouterArticle(AritcleC a, int indice) throws ArticleException

	{ boolean add=false ; 
	if ((indice <0)||(indice>nbrearticles))
	{
		throw new ArticleException ("Article non ajoutéé");
	}
	else 
	{ 
		articles[indice]=a;
		add =true;

	}
	return add ; 
	}
	public boolean supprimerArticle(int indice) throws ArticleException
	{
		boolean delete=false;
		if ((indice<0)||(indice>nbrearticles))
		{
			throw new ArticleException ("Article non supprimé");
		}
		else
		{
			articles[indice]=null;
			delete=true;
		}
		return delete;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
