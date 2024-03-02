import java.util.Scanner;
public class demoArraysort{
	public static void main(String[] args) {
		int array[] =new int[10];
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=inScanner.nextInt();
		System.out.println("Enter array elements one by one");
		for(int i=0; i<size; i++)
		array [i]=inScanner.nextInt();
		System.out.println("Array elements before sorting are");
		for (int i=0; i<size; i++)
		System.out.print(array[i]+"\t");
		System.out.println();
		inScanner.close();
		for (int i=0; i<size-1; i++)
		{
			int minidex=i;
			for(int j=i+1; j<size; j++)
			{
				if(array[j]<array[minidex])
				minidex=j;
			}
			
			int temporary=array[i];
			array[i]=array[minidex];
			array[minidex]=temporary;
		}
		System.out.println("Array elements after sorting are");
		for(int i=0; i<size; i++)
		System.out.print(array[i]+"\t");
		//break;
	}
}