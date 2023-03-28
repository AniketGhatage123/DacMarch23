class pattern10{

public static void main(String args[]){
	
	 char c = 64;
	 for(int i=5;i>=1;i--)
	   {
		 for(int k=i; k>=2;k--)
			  {
			  System.out.print(" ");}
	 
		 for(int j=i;j<=5;j++){
		 	System.out.print((char)(c+j)+" ");
	        }
	     
		 System.out.println();
		 

	     }
	

    }
	
}
