package FILE_OPS_PROJECT;
import java.io.IOException;
import java.io.File;
import java.util.*;
public class Project {

	public static void main(String[] args) throws IOException {
		int ch;
		Scanner sc=new Scanner(System.in);

		String path="F:\\JAVA PROJECT\\";
		
		ArrayList<String> al=new ArrayList<>();
		do {
			System.out.println("Press Following Numbers for Services");
		System.out.println("1. CREATE FILE");
		System.out.println("2. DELETE FILE");
		System.out.println("3. LIST OF FILES");
		System.out.println("4. SEARCH FILE");
		System.out.println("9. EXIT AND RETURN TO MAIN");
		System.out.println("Enter Your Choice :  ");
		ch=sc.nextInt();
		
		
		
		switch(ch) {
		case 1:
			
				System.out.println("Enter the name of File you want to create:: ");
				String Filename=sc.next();
				String Finalfile=path+Filename;
				File f=new File(Finalfile);	
				boolean b=f.createNewFile();
				if(b) {
			    System.out.println("file created");
			    System.out.println("+++++++++++++++++++++++++++++++++++");
				System.out.println("+++++++++++++++++++++++++++++++++++");
				}
				else {
					System.out.println("file not created");
					System.out.println("+++++++++++++++++++++++++++++++++++");
					System.out.println("+++++++++++++++++++++++++++++++++++");
				}
		break;
		
		case 2:
			System.out.println("Enter Name you want to delete file:  ");
			String delf=sc.next();
			String Finalfile2=path+delf;
			File f2=new File(Finalfile2);
			f2.delete();
			System.out.println("+++++++++++++++++++++++++++++++++++");
			System.out.println("+++++++++++++++++++++++++++++++++++");
			
			break;
			
		case 3:
			File f3=new File(path);
			String[] str=f3.list();
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[i]);
				
			}
			System.out.println("+++++++++++++++++++++++++++++++++++");
			System.out.println("+++++++++++++++++++++++++++++++++++");
			
			break;
			
		case 4:
			File f4=new File(path);
			System.out.println("Enter file name user want to find :  ");
			String Srch=sc.next();
			File filen[]=f4.listFiles();
			int flag=0;
			for(File ff:filen) {
				if(ff.getName().equals(Srch)) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
			}
				if(flag==1) {
					System.out.println("File Found In Directory");
					System.out.println("+++++++++++++++++++++++++++++++++++");
					System.out.println("+++++++++++++++++++++++++++++++++++");
					
				}
				else {
					System.out.println("File Not Found In Directory");
					System.out.println("+++++++++++++++++++++++++++++++++++");
					System.out.println("+++++++++++++++++++++++++++++++++++");
				}
			
			
		}
		}while(ch!=9);	
		}
	
	
			
		
		
		
		
	}


