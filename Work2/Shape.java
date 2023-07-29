package Work2;

// Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:

// Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
// Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
// Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
// Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).

public class Shape {
public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.0, 10.1, "Синий");
        Rectangle r2 = new Rectangle(3.0, 25.0, "Красный");
        
        // t1.setHeight(4.0);
        // t1.setWidth(10.1);
        // t1.style = "Зеленый";

        // t2.setHeight(3.0);
        // t2.setWidth(25.0);
        // t2.style = "Серый";

        System.out.println("Информация о 'r1'.");
        r1.showStyle();
        r1.showDem();
        System.out.println("Площадь = " + r1.calculateArea());
        System.out.println("Периметр = " + r1.calculatePerimeter());
        System.out.println();
        
        System.out.println("Информация о 'r2'.");
        r2.showStyle();
        r2.showDem();
        System.out.println("Площадь = " + r2.calculateArea());
        System.out.println("Периметр = " + r2.calculatePerimeter());
    }
}
