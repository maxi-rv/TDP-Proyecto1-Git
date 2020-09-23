
public class Persona 
{
	//Attributes
	protected String name;
	protected int id;
	
	public Persona (String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getId()
	{
		return this.id;
	}
}
