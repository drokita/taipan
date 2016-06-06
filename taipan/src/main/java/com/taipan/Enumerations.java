package com.taipan;

public class Enumerations {

    enum Options { BUY("Buy"), SELL("Sell"), BANK("Bank"), WAREHOUSE("Warehouse"), QUIT("Quit"), RETIRE("Retire");
        private final String option;
        Options(String option) {
            this.option = option;
        }
        public String getValue() {
            return option;
        }
    }

    enum Locations { HONGKONG("Hong Kong"), SHANGHI("Shanghi"), NAGASAKI("Nagasaki"), MANILLA("Manilla"), SINGAPORE("Singapore"), BATAVIA("Batvia");
        private final String location;
        Locations(String location) {
            this.location = location;
        }
        public String getValue() {
            return location;
        }
    }

    enum ShipClass { BATTLESHIP("Battleship"), DESTROYER("Destroyer"), CRUISER("Cruiser"), SCOUT("Scout");
        private final String ship_class;
        ShipClass(String ship_class) {
            this.ship_class = ship_class;
        }
        public String getValue() {
            return ship_class;
        }
    }

    enum Goods { OPIUM("Opium"), SILK("Silk"), HASHISH("Hashish"), GENERAL("General"), ARMS("Arms");
        private final String good;
        Goods(String good) {
            this.good = good;
        }
        public String getValue() {
            return good;
        }
    }
}
