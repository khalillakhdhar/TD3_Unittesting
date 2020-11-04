package sante;

public class Verif {
public boolean verifpoids(double poids)
{
if((poids<=30)||(poids>200))
	return false;
else
	return true ;
// return (poids>=30)&&(poids<200)
}
public boolean veriftaille(double taille)
{
	
return (taille>=0.9) && (taille <2.6);
}
void calculeimc(double poids, double taille)
{
	
if(!verifpoids(poids))
{
	System.out.print("donner un poids valide!");
}
else if(!veriftaille(taille))
{
System.out.println("donner une taille valide");	
}
else
{
int imc=(int) Math.round(poids/(Math.pow(taille,2)));
System.out.println("le imc est: "+imc);
if(imc<20)
	System.out.println("maigre");
else if(imc<=25)
{
System.out.println("idéal");

}
else
{
System.out.println("en surpoids");	

}
}


}
}
