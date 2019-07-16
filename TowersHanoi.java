public class TowersHanoi{
	public TowersHanoi{}
	public static void hanoi (int n, int from, int to) {
		if (n == 1){
			System.out.println ("Shift disk 1 from tower " + from + " to tower " + to);
		}
		else {
			int other = 6 - from - to;
			hanoi (n-1, from, other);
			System.out.println ("Shift disk " + n + " from tower " + from + " to tower " + to);
			hanoi (n-1, other, to);
		}
	}

	public static void main(String[] args){
		TowersHanoi towerdObj=new TowersHanoi();
		towersObj.hanoi(4, 1, 3);
	}
}