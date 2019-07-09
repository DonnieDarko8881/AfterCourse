package builder.house;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class House {
    private String walls;
    private String floors;
    private String rooms;
    private String windows;
    private String doors;
    private String garage;

    private House(HouseBuilder houseBuilder) {
        this.walls = houseBuilder.walls;
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.garage = houseBuilder.garage;
    }

    public static class HouseBuilder {
        private String walls;
        private String floors;
        private String rooms;
        private String windows;
        private String doors;
        private String garage;

        public HouseBuilder walls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder floors(String floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder rooms(String rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder windows(String windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder doors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder garage(String garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
