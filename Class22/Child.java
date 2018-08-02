public class Child extends Parent
{
	int attribute;

	public Child(int childAttribute, int parentAttribute)
	{
		super(parentAttribute);

		attribute = childAttribute;
	}

	public String toString()
	{
		return ("Child: " + this.attribute + ", Parent: " + super.attribute);
	}
}