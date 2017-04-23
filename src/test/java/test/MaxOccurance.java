package test;

public class MaxOccurance {
	
	 
	public static void main(String[] args) {		
		String x = "malayalam";
		int charCount = 0;
		int maxValue = 0;
		char c = 0;
		for(int i=0;i<x.length();i++){
			
			for(int j=0;j<x.length();j++){
				if(x.charAt(i)==x.charAt(j)){
					charCount++;					
				}
				if(charCount>maxValue){
					maxValue=charCount;
					c=x.charAt(i);
				}
			}
			x=x.replace(String.valueOf(x.charAt(i)), "");
			System.out.println(x);
			charCount=0;
			i--;
		}
		System.out.println(maxValue);	
		System.out.println(c);		
	}
	

}
