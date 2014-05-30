package example;
public class Shape {
	private double sides[] ;
	
	public Shape(double sides[]) {
		this.sides = sides;
	}
	public boolean isValidShape() {
		int length = sides.length;
		
		for(int i=0;i<length;i++){
			if(sides[i]<=0)
				return false;
		}
		
		double swap;
		
		for(int i=0;i<length-1;i++){
			if(sides[i]>sides[i+1]){
				swap = sides[i];
				sides[i] = sides[i+1];
				sides[i+1] = swap;
			}
		}
		
		int sum = 0;
		for(int i=0;i<length-1;i++){
			sum += sides[i];
		}
		if(sum<=sides[length-1]){
			return false;
		}
		return true;
	}
	public boolean hasNEqualSides(int N) {
		
		int length = sides.length;
		int counter =0;
		
		for(int i=0;i<length;i++){
			if(sides[i]<=0)
				return false;
		}
		
		double swap;
		
		for(int i=0;i<length-1;i++){
			if(sides[i]>sides[i+1]){
				swap = sides[i];
				sides[i] = sides[i+1];
				sides[i+1] = swap;
			}
		}
		
		int sum = 0;
		for(int i=0;i<length-1;i++){
			sum += sides[i];
		}
		if(sum<=sides[length-1]){
			return false;
		}
		
		for(int i=0;i<=length-1;i++){
			for(int j=0;j<=length-1;j++){
				if(sides[i]==sides[j]){
					counter++;
				}
			}
			if(counter==N){
				return true;
			}
			counter=0;
		}
		return false;
	}
}

