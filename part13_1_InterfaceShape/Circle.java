package part13_1_InterfaceShape;

 public  class Circle implements Shape {
		double radius;
		Circle(){

		}
		Circle(double redius){
			this.radius = redius;
		}
		public void FindArea() {
			System.out.println("the area of circle is: " + (3.14*radius*radius));
		}
		public void FindPerimeter() {
			System.out.println("The perimeter of circle is: " +2*(3.14*radius*radius)+"unit");
		}
	
	}