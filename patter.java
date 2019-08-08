	
public class patter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min_star = 1;
		int p_height=5;
		int p_space=p_height-1;
		for(int i=1;i<=p_height;i++)
		
		{
			for(int j=p_space;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=min_star;k++)
			{
				System.out.print("*");
			}
			min_star=min_star+2;
			System.out.println();

		}
	//	System.out.println();

	}

}
