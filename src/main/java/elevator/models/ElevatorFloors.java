package elevator.models;

import elevator.exceptions.IncorrectFloorException;

public class ElevatorFloors {
    /**
     * Класс-модель, хранящий в себе минимальный и максимальный этаж, на который может подниматься и опускаться лифт.
     * Минимальный этаж должен быть обязательно меньше, чем максимальный этаж, а также этаж не может быть нулевым.
     * Отрицательные этажи считаются подземными. Например, если это торговый центр, то подземная парковка это -1 этаж.
     * В четырехэтажном торговом центре с подземной парковкой у лифта будут возможны этажи -1, 1, 2, 3, 4.
     */
    private int minFloor = 0;
    private int maxFloor = 0;

    public ElevatorFloors() {}

    public ElevatorFloors(int minFloor, int maxFloor) {
        if (minFloor >= maxFloor) {
            throw new IncorrectFloorException(minFloor, maxFloor);
        }

        if (maxFloor == 0 || minFloor == 0) {
            throw new IncorrectFloorException(minFloor, maxFloor);
        }

        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }
}
