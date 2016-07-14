public class SortArray{
	public static void main(String Args[])
	{
	int array[]=new int[5];
	int newarray[]=new int[6];
array[0]=32;
array[1]=24;
array[2]=98;
array[3]=13;
array[4]=56;
System.out.println("The array values");
for(int i=0;i<array.length;i++)
{
	System.out.println(array[i]);
}
for(int c=0;c<array.length;c++)
{
	for(int d=0;d<array.length-c-1;d++)
	{
		if(array[d]>array[d+1])
		{
	int temp=array[d];
	array[d]=array[d+1];
	array[d+1]=temp;
	}
	}
}
System.out.println("The sorted array");
for(int i=0;i<array.length;i++)
{
	System.out.println(array[i]);
}
	
for(int i=0;i<array.length;i++)
{
	newarray[i]=array[i];
}
System.out.println("The new array values");
newarray[5]=87;
for(int i=0;i<newarray.length;i++)
{
	System.out.println(newarray[i]);
}

	}
}

	