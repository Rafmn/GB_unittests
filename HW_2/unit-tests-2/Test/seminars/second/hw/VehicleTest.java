package seminars.second.hw;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class VehicleTest {
    //    Создаем экземпляры объекта для его тестирования:
    Car aCar3 = new Car("Mercedes", "4Matic", 2020);
    Motorcycle aMoto1 = new Motorcycle("Ural", "Chaika", 1999);
    
    //  Проверка принадлежности к классу Vehicle:
    @Test
    void CheckExtends() {
        assertThat(aCar3 instanceof Vehicle).isEqualTo(true);
    }

    //    проверка того, объект Car создается с 4-мя колесами:
    @Test
    void Check4Wheels() {
        assertThat(aCar3.getNumWheels()).isEqualTo(4);
    }

//    проверка того, объект Motorcycle создается с 2-мя колесами:
    @Test
    void Check2Wheels() {
        assertThat(aMoto1.getNumWheels()).isEqualTo(2);
    }

//    проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive()):
    @Test
    void Check60Drive() {
        aCar3.testDrive();
        assertThat(aCar3.getSpeed()).isEqualTo(60);
    }

//    проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void Check75Drive() {
        aMoto1.testDrive();
        assertThat(aMoto1.getSpeed()).isEqualTo(75);
    }

//  проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void CheckCarStartStop() {
        aCar3.testDrive();
        aCar3.park();
        assertThat(aCar3.getSpeed()).isEqualTo(0);
    }

//    проверить, что в режиме парковки (сначала testDrive, потом park т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void CheckMotoStartStop() {
        aMoto1.testDrive();
        aMoto1.park();
        assertThat(aMoto1.getSpeed()).isEqualTo(0);
    }
}