
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		char setone='A';
		char settwo='c';
    	   
int row=4,space=1,letter=0;
while(row>=1)
{
space=1;
while(space<row)
{
System.out .print(" ");
space++;
if(row<3)
{
	settwo+=row;
}
else{
setone+=row;
}
}
letter=4;
while(letter>=row)
{
if(row<3)
{
System.out.print(settwo);
settwo+=row;
}
else
{
System.out.print(setone);
setone+=row;
}
letter--;
}
System.out .println();
row--;
}
}
}