import java.util.ArrayList;


public class mathset <Type> {
	
	ArrayList<Type> set=new ArrayList<Type>();
	int card;
	mathset(Type element){
		set.add(element);
		card=set.size();
	}
	
	mathset(){
		card=0;
	}
	
	
	
	public void insert(Type element){
		if(set.indexOf(element)==-1){
		set.add(element);
		card=set.size();}		
	}
	
	public void delete(Type element){
		if(set.indexOf(element)!=-1){
			set.remove(set.indexOf(element));
			card=set.size();
		}
		
		
	}
	public int count(Type el){
		int k=0;
		for (Type element: set){
			if(element.equals(el)){
				k++;
			}
		}
		return k;
	}
	
	public Type value(int i){
		return set.get(i);
	}
	
	public static<Type> boolean subset(mathset<Type> subset, mathset<Type> superset){
		for (Type entry: subset.set){
			if(superset.set.indexOf(entry)==-1){
				return false;
			}
			
		}
		return true;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}