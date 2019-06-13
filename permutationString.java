public class permutationString{

	public permutationString(){
		
	}

	public boolean isStringPermutation(String s1, String s2){
		String [] arrayChar= s1.split("");
		//String [] arrayChar2= this.s2.split("");
		if (s1.length() != s2.length()){
			return false;
		}
		for (int i=0; i<arrayChar.length-1;i++){
			//System.out.println(arrayChar[i]);
			s2=s2.replaceFirst(arrayChar[i], "");
			if  (! s2.contains(arrayChar[i])){
				return false;

			}
			else{
				
				
				continue;
			}
		}
		return true; 
	}





	public static void main(String[] args){
		permutationString a=new permutationString();
		System.out.println(a.isStringPermutation("aat", "att"));
	}
}


