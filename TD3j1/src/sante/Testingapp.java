package sante;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class Testingapp {
	
	@Test
	public void veriftaille()
	{
		Verif v=new Verif();
		Assert.assertEquals(true,v.veriftaille(1.8));
	}
@Test
public void verifPoids()
{
Verif v= new Verif();
Assert.assertEquals(true, v.verifpoids(20));

}
public static void main(String args[])
{
Verif vr=new Verif();
vr.calculeimc(80, 2);


}
}
