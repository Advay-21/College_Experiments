class objs
{
	static int count;

	objs()
	{
		count++;

	}

    static void display()
    {
    	System.out.println("Total Objects  : "+count);
    }

    public static void main(String[] args) 
    {
    	objs o1= new objs();
    	objs o2= new objs();
    	objs o3= new objs();
    	objs o4= new objs();

    	objs.display();
    }
}