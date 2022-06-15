public class Car extends Transport implements CheckEngineable{

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}