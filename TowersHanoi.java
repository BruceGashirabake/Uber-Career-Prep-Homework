public class TowersHanoi{
	public TowersHanoi{}
	public static void hanoi (int n, int from, int to) {
		if (n == 1){
			System.out.println ("Move disk 1 from pin " + from + " to pin " + to);
		}
		else {
			int other = 6 - from - to;
			hanoi (n-1, from, other);
			System.out.println ("Move disk " + n + " from pin " + from + " to pin " + to);
			hanoi (n-1, other, to);
		}
	}

	public static void main(String[] args){
		TowersHanoi towerdObj=new TowersHanoi();
		towersObj.hanoi(4, 1, 3);
	}
}