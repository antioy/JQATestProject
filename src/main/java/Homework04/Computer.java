package Homework04;

public class Computer {
     int year;
     double price;
     String operationSystem;

    Computer(int i, int i1, double v, double v1) {
        this.operationSystem = " WinXP ";
    }
    Computer(int year, double price, Computer computerC) {
        this(2010, 1100, 160.0, 3.0);
        this.year = year;
        this.price = price;


        Computer(int year, double price , String operationSystem;) {
            this.year = year;
            this.price = price;
            this.operationSystem = operationSystem;

        }

        Computer computerC1 = computerC;
        public int comparePrice(Computer computerC) {
            if (this.price < computerC.price) {
                return -1;
            }
            if (this.price > computerC.price) {

                return 1;
            }

            if (this.price == computerC.price) {
            }
            return 0;
        }

    }

    public int comparePrice(Computer b) {
    }
}
