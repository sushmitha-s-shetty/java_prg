
public class ParsingSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		int deposited=0,month=0;
		float intrest=0.0F;char type='\0';
		deposited=Integer.parseInt(args[0]);
		month=Integer.parseInt(args[1]);
		intrest=Float.parseFloat(args[2]);
		type=args[3].charAt(0);//byte and char no parse
		deposited+=(deposited*(month*intrest))/100;
		System.out.println("account details"+type+" "+month+" "+intrest+" "+deposited);
	}

}
