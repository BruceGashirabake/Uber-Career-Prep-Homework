import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListPhoneBook2 extends ListPhoneBook {
	static long time_lapse;
	static long time_lapse2;
	static int phoneBookSize;
	static int numTimes;
	public void readerMethod() {  //method to help reading for insertion of entries into Phonebook
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"\\Users\\Bruce Gashirabake\\AppData\\Local\\Temp\\data.csv"));   //file path
			String line = reader.readLine();
			long start1=System.currentTimeMillis();
			while (line != null) {
				String[] entry= line.split(",");
				long phoneNum = Long.parseLong(entry[1]);
				ListPhoneBook2 listInsert=new ListPhoneBook2();
				listInsert.insert(entry[0], phoneNum);
				phoneBookSize= listInsert.size();
				line = reader.readLine();
			}
			time_lapse= System.currentTimeMillis()- start1;
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	public void readerMethod2() {  //method to help find all entries of search.txt in 
		BufferedReader reader;
		try {
			reader= new BufferedReader(new FileReader(
					"\\Users\\Bruce Gashirabake\\AppData\\Local\\Temp\\search.txt"));
			String line=reader.readLine();
			long start2=System.currentTimeMillis();
			while(line!=null) {
				String [] entry=line.split(",");
				ListPhoneBook2 listFind= new ListPhoneBook2();
				long phoneNumber=listFind.find(entry[0]);
				if (phoneNumber != -1) {
					numTimes++;
					
				}
				
				else {
					
					break;
				}
				
				
			}
			time_lapse2= System.currentTimeMillis()- start2;
			reader.close();
		}catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
	
	public static void main(String[] args) {
		ListPhoneBook2 listReader=new ListPhoneBook2();
		listReader.readerMethod();
		
		System.out.println("Insert took " + time_lapse + " milliseconds."); 
		System.out.println("The size of the Phonebook is " + phoneBookSize + ".");
		System.out.println("find() was called " + numTimes + " times.");
		System.out.println("Search took " + time_lapse2 + " milliseconds.");
	
	}
}


//was unable to implement the phoneBook using a Binary tree. One problem I had was how to sort the data. If you check
//first phonebook implementation using a binary search tree, you can see that I used the compareTo() to try and sort the data
//into what goes left or right of the tree. Implementing that with a UUID was difficult that's why I couldn't implement it here.
