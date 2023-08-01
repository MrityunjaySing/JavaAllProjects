package part13_1_InterfaceShape;

 public class Rectangle implements Shape {
		double l;
		double w;

		Rectangle(){
			
		}
		Rectangle(double l, double w) {
		this.l=l;
		this.w = w;
		}
		public void FindArea() {
			System.out.println("find area of rectangle is: " +(l*w)+"sq.unit");
		}
		public void FindPerimeter() {
			System.out.println("the perimeter of rectangle is:" + 2*(l+w)+"unit");
		}
		
		}

