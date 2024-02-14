package org.HW2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Animal barsik = new Dog("Barsik", 4, "Bigl");
        Animal sharik = new Dog("Sharik", 5, "Toyteryer");
        Animal tisha = new Cat("Tisha", 8, 8);
        Animal murza = new Cat("Murza", 14, 12);
        Animal[] animals = {barsik, sharik, tisha, murza};

        StringBuilder message = new StringBuilder();
        for (Animal animal : animals) {
            message.append(animal.getClass().getName()).append("\n");
            Field[] fields = animal.getClass().getDeclaredFields();
            Field[] superFields = animal.getClass().getSuperclass().getDeclaredFields();
            for (Field superField : superFields) {
                message.append(superField.getName()).append(" - ").append(superField.get(animal)).append("\n");
            }
            for (Field field : fields) {
                message.append(field.getName()).append(" - ").append(field.get(animal)).append("\n");
            }
        }

        System.out.println(message);

        for (Animal animal : animals) {
            try {
                Method makeSound = animal.getClass().getDeclaredMethod("makeSound");
                makeSound.setAccessible(true);
                makeSound.invoke(animal);
            } catch (Exception e) {
                System.out.printf("Сlass %s have no such method with this name \n", animal.getClass().getName());
            }
        }
    }


}
