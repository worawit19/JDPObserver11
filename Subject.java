import java.util.*;

public class Subject implements ISubject {

	private int _flag;


	public Subject() {
	}

	 List<Observer> observerList = new ArrayList<>(); 
	public int getFlag() {
		return _flag;
	}

	
	public void setFlag(int num) {
		this._flag=num;             
		notifyObservers(); 
	}

	public void register(Observer o) {
		observerList.add(o);
	}

	public void unregister(Observer o) {
		observerList.remove(o);
	}

	public void notifyObservers() {
		for(int i=0;i<observerList.size();i++)                
		{                    
			observerList.get(i).update();                
		} 
	}

}