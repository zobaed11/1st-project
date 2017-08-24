package start;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("May ALLAH give me strength to come out with success");
		int a[][] = new int[100][100];
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
		/*for (int i=0;i<3;i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		 */
		System.arraycopy(arr, 0, a, 50, 3);
		
	 for(int i=50;i<53;i++)
	 {
		 for (int j=0;j<3;j++)
		 {System.out.print(a[i][j]+ " ");}
		 
	System.out.println();
		 
	}  
	 
	 File x = new File ("/Users/zobaed/eclipse-workspace/test/sakib.txt");
	 if(x.exists())
		 System.out.println(x.getName()+ " exists!");
	 else 
		 System.out.println(x.getName()+ "not found!");
	 
	 /*Hello g= new Hello();
	 g.openFile();
	 g.addRecords();
	 g.closeFile(); */
	 
	 Hello hello = new Hello(new lathi());
	 hello.martese();
	 hello.currentState();
	 hello.changeMarardhoron(new ghushi());
	 hello.martese();
	 hello.currentState();
	 
	
	 
	 
	 
	}

}
