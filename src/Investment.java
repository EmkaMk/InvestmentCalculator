/**
 * 
 */

/**
 * @author Emilija
 *
 */
public class Investment {

	private float value;
	
	
	
	public Investment() {
		super();
		this.value=14000;
	}


	public float firstYearValue()
	{
		return this.value/100*40+this.value;
	}
	
	public float secondYearValue()
	{
		return firstYearValue()-1500;
	}
	
	public float thirdYearValue()
	{
		return secondYearValue()/100*12+this.value;
	}
	
	public void investmentCalculator()
	{
		System.out.println("The investment is worth : "+thirdYearValue());
		
	}
}
