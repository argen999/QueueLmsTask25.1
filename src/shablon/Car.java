package shablon;

public class Car {
    private int id;
    private int numberCar;

    public Car(int id, int numberCar) {
        this.id = id;
        this.numberCar = numberCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public String toString() {
        return  "Id = " + id + '\n' +
                "NumberCar = " + numberCar;
    }
}
