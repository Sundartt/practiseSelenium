package nov22;

public class Desktop implements Hardware,Software {
	public void softwareResource() {
		// TODO Auto-generated method stub
		System.out.println("Software");
	}

	public void hardwareResource() {
		// TODO Auto-generated method stub
		System.out.println("Hardware");
		
	}
   public void desktopModel() {
	   System.out.println("4");
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Desktop top=new Desktop();
      top.hardwareResource();
      top.softwareResource();
      top.desktopModel();
	}

	
}
