class Medicine{
	public static void medicineinfo(String name,long manufacture,float price,int quantity)
	{
		System.out.println("start medicineinfo in medicine");
		
		System.out.println("Name :"+name);
		System.out.println("Manufacture :"+manufacture);
		System.out.println("Price :"+price);
		System.out.println("Quantity :"+quantity);
		

		System.out.println("end medicineinfo in medicine");
	}
	
	public static void main (String[] args){
		
		if (args.length==4)
		{
			String name=args[0];
			String manufacture=args[1];
			String price=args[2];
			String quantity=args[3];
			
			long convertedmanufacture=Long.parseLong(manufacture);
			float convertedprice=Float.parseFloat(price);
			int convertedquantity=Integer.parseInt(quantity);
			
			Medicine.medicineinfo(name,convertedmanufacture,convertedprice,convertedquantity);	
		}
		else
		{ 
			System.out.println("3 args are required");
		}
		
	}
	
}