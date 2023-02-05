import java.io.*;
class Q1RepresentAllFileAndDirectories 
{
	public static void main(String[] args)throws Exception 
	{
		int dirCount     = 0;
		int jpgFileCount = 0;
		int txtFileCount = 0;
		int zipFileCount = 0;

		String location = "E:\\LearningCode";
		File f= new File(location);

		String[] names = f.list();

		for(String name : names){
			
			File f1 = new File(f,name);

			if (f1.isDirectory())
				dirCount++;

			if(f1.isFile()){

				if (name.endsWith(".png"))
					jpgFileCount++;
				if(name.endsWith(".txt"))
					txtFileCount++;
				if(name.endsWith(".zip"))
					zipFileCount++;
			}
			System.out.println(name);
			}
	
		
		System.out.println("Total no of JPGfiles  is :: "+jpgFileCount);
		System.out.println("Total no of txtfiles  is :: "+txtFileCount);
		System.out.println("Total no of Zipfiles  is :: "+zipFileCount);
		System.out.println("Total no of Directory is :: "+dirCount);

	}
	
}