import java.util.ArrayList;
public class ListPhoneBook implements PhoneBook {
	ArrayList<Entry> phoneBookList=new ArrayList<Entry>();
	class Entry{
		String _name;
		Long _phoneNumber;
		Entry(String _name, Long _phoneNumber){
			this._name=_name;
			this._phoneNumber=_phoneNumber;
		}
	}
	
	public int size() {
		return phoneBookList.size();
	}

	public void insert(String name, long phoneNumber) {
		Entry entry=new Entry(name, phoneNumber);
		phoneBookList.add(entry);
		
	}

	
	public long find(String name) {
		for (Entry e: phoneBookList) {
			if (phoneBookList.size()!=0) {
				if (name==e._name) {
					return e._phoneNumber;
				}
			}
		}
		return -1;
	}

}
