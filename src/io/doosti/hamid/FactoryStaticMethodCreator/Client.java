package io.doosti.hamid.FactoryStaticMethodCreator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape1 = ShapeFactory.getShape("CIRCLE");
		shape1.draw();

	}

}
