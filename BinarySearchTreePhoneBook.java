
public class BinarySearchTreePhoneBook implements PhoneBook{
	//have a root here and maybe as part of a constructor for the class 
	public NodeEntry root;
	public int numEntries;
	class NodeEntry{
		String _name;
		Long _phoneNumber;
		NodeEntry left, right;
		NodeEntry(String _name, Long _phoneNumber){
			this._name=_name;
			this._phoneNumber=_phoneNumber;
		}
	
	
	
	public int size() {
		return numEntries;
	}

	
	public void insert(String name, long phoneNumber) {
		if (numEntries==0) {
			root=new NodeEntry(name, phoneNumber);
			
		}
		else if (name.compareTo(_name)<=0) {
			if (left==null) {
				left= new NodeEntry(name, phoneNumber);
			}
			else {
				left.insert(name, phoneNumber);
			}
		}
		else if (name.compareTo(_name)>0){
			if (right==null) {
				right=new NodeEntry(name, phoneNumber);
			}
			else {
				right.insert(name, phoneNumber);
			}
		}
		numEntries++;
		
		
	}


	public long find(String name) {
		if (name.compareTo(_name)==0) {
			return this._phoneNumber;
		}
		else if (name.compareTo(_name)<0) {
			return left.find(name);
		}
		else if (name.compareTo(_name)>0) {
			 return right.find(name);
		}
		return -1;
	}
	
	}
	
}
