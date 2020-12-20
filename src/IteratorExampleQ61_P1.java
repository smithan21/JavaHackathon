
public class IteratorExampleQ61_P1 implements Comparable<IteratorExampleQ61_P1>{


		public String name;
		public int Id;
		public int height;
		
		IteratorExampleQ61_P1(String name, int Id, int height){
			this.name = name;
			this.Id = Id;
			this.height = height;
		}

		@Override
		public int compareTo(IteratorExampleQ61_P1 s) { 
			
			return this.name.compareTo(s.name) * -1; 
			
		}
	}

