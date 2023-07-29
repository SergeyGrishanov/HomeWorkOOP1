package Work2;

public class ForShapes {
    
        private double width;
        private double height;
    
        ForShapes(double width, double height) {
            this.width = width;
             this.height = height;
        }
    
        ForShapes() {
            width = height = 0.0;
        }
    
        void showDem() {
            System.out.println("Ширина и Высота: " + width + " и "+ height);
        }
    
        public void setWidth(double width) {
            this.width = width;
        }
    
        public void setHeight(double height) {
            this.height = height;
        }
    
        public double getWidth() {
        return width;
        }
    
        public double getHeight() {
            return height;
        }
    }
    
    class Rectangle extends ForShapes {
        private String style;
        Rectangle(double width, double height, String style) {
            super(width, height);
            this.style = style;
        }
        
        Rectangle(double width, double height) {
            super(width, height);
        }
    
        double calculateArea() {
            return (getHeight() * getWidth());
        }

        double calculatePerimeter() {
            return ((getHeight() + getWidth()) * 2);
        }

        void showStyle() {
            System.out.println("Прямоугольник: " + style);
        }
    }
