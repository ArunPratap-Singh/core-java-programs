package generics.Animal;

public class Register<K, V> {
	
		private K key;
		private V value;
		
		Register(){
			
		}
		
		Register(K key, V value){
			this.key = key;
			this.value = value;
		}
		
		public String getDetails() {
			return "Key is: " +key+"\nValue is: " +value;
		}
		
		public K getKey() {
			return key;
		}
		
		public V getValue() { 
			return value;
		}

}
