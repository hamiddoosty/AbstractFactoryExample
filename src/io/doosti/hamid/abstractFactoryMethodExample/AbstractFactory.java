package io.doosti.hamid.abstractFactoryMethodExample;


public abstract class AbstractFactory {
	
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
	
}

class ShapeFactory extends AbstractFactory {	
	@Override
	public Color getColor(String color) {
		return null;
	}
	
	@Override
	public Shape getShape(String shapeType) {		
		
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}		
		return null;

	}
}

class ColorFactory extends AbstractFactory {
	@Override
	Color getColor(String colorType) {		
		
		if (colorType == null) {
			return null;
		}
		if (colorType.equalsIgnoreCase("RED")) { 
			return new Red();
		}else if(colorType.equalsIgnoreCase("GREEN")) {
			return new Green();
		}else if(colorType.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		
		return null;		
	}
	
	@Override
	Shape getShape(String shape) {
		return null;
	}
}