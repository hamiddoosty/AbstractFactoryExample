package io.doosti.hamid.FactoryAbstractCreatorExample;

public abstract class AbbstractShapeFactory {
	
	protected abstract Shape factoryMethod(); 
		
	public Shape getShape() {
		return factoryMethod();
	}	
	//other helper methods
}

class RectangleFactory extends AbbstractShapeFactory{
	
	protected Shape factoryMethod() {
		return new Rectangle();
	}
}

class SquareFactory extends AbbstractShapeFactory{
	
	protected Shape factoryMethod() {
		return new Square();
	}
}

class CircleFactory extends AbbstractShapeFactory{
	
	protected Shape factoryMethod() {
		return new Circle();
	}
}
