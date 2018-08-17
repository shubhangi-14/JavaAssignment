import java.util.Scanner;
class PatternFinder{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		String string=new String();
		int i,k;
		string=input.nextLine();
		i=input.nextInt();
		String[] s=new String[i];
		for(k=0;k<s.length;k++){
			s[k]=input.nextLine();
		}
		for(k=0;k<s.length;k++){
			for (int j = 0; j <= (string.length() - s[k].length()); j++)
        {
           if (string.substring(j, (j + s[k].length())).equalsIgnoreCase(
                    s[k])){
						System.out.println(++j);
					}
		}
	}
	}
}