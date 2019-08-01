public class Manage implements Operator {
Freelancer[] base=new Freelancer[5];
static int pos;public void insert(Freelancer free)
{
for(int index=0;index<base.length;index++)
{
if(base[index]==null)
{
base[index]=free;
System.out.println(free.getName()+"lancer added");break;
}
}
}
public void search(String tech)
{
if(pos>=base.length-1)
{
return;
}
else
{
if(base[pos].getSkill().equalsIgnoreCase(tech))
{
System.out.println(base[pos]);
}
pos++;
}
search(tech);
}



public static void main(String[] args) {
// TODO Auto-generated method stub
//freelancer free1=new freelancer();
//free1.setName("swee");free1.setExp(2); free1.setSkill("software developer");free1.setId(5);
//System.out.println(free1);
Freelancer f=new Freelancer("ss","java",7,7000);
Freelancer b=new Freelancer("s","java",12,17000);
Freelancer t=new Freelancer("sj","c",2,5000);
Freelancer m=new Freelancer("ls","python",5,8000);
Manage man=new Manage();
man.insert(f);
man.insert(b);
man.insert(t);
man.insert(m);
pos=0;
man.search("python"); 
}
}
