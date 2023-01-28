package shiva;

public class IncrementInWhile {
	static boolean ball;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    short bat=42;
    if (bat<50 && !ball)
          bat++;
    if (bat>50)
    	;
    else if (bat>40) {
    	bat+=7;
    	bat++;
    	
    }
    else
    
    	--bat;
    	System.out.println(bat);
    
}
}