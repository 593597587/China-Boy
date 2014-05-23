package example;

public class Triangle {
	
	double a,b,c;
	public Triangle(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isValidTrangle(){
		if(hasPositiveSides()){
			if(twoSidesBiggerThanTheOther()){
				return true;
			}
		}
		return false;
	}

	private boolean twoSidesBiggerThanTheOther() {
		return a+b>c && b+c>a &&a+c >b;
	}

	private boolean hasPositiveSides() {
		return a>0 && b>0 && c>0;
	}
	
	public boolean isEqualTwosides(){
		if(hasPositiveSides()){
			if(twoSidesBiggerThanTheOther()){
				if(a==b || a==c ||b==c){
					if(a==b && b==c){
						return false;
					}
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isEqual3sides(){
		if(hasPositiveSides()){
			if(twoSidesBiggerThanTheOther()){
				if(a==b && b==c)
					return true;
			}
		}
		return false;
	}
}