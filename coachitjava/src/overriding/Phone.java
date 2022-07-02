package overriding;

class Phone {
	
	public static void main(String[] args) {
		
		Phone obj=new cell();
		obj.p1();
	}
	public void p1() {
		System.out.println("phone is ringing....");
		
	}
}
	 class cell extends Phone{
		public void p1() {
			System.out.println("cell is vibrating....");
		}
	}
