package org.example.DataAccessLayer.models;

public class Restourant {
    private Integer totalCountOfTables = 10, countOfDoubleTables = 5, countOfTripleTables = 2, countOfQuadrupleTables = 3;

    public Integer getTotalCountOfTables() {
        return totalCountOfTables;
    }

    public void setTotalCountOfTables(Integer totalCountOfTables) {
        this.totalCountOfTables = totalCountOfTables;
    }

    public Integer getCountOfDoubleTables() {
        return countOfDoubleTables;
    }

    public void setCountOfDoubleTables(Integer countOfDoubleTables) {
        this.countOfDoubleTables = countOfDoubleTables;
    }

    public Integer getCountOfTripleTables() {
        return countOfTripleTables;
    }

    public void setCountOfTripleTables(Integer countOfTripleTables) {
        this.countOfTripleTables = countOfTripleTables;
    }

    public Integer getCountOfQuadrupleTables() {
        return countOfQuadrupleTables;
    }

    public void setCountOfQuadrupleTables(Integer countOfQuadrupleTables) {
        this.countOfQuadrupleTables = countOfQuadrupleTables;
    }

    public void checkAvailableTables(Integer numberOfReservedSeats) {

        switch (numberOfReservedSeats) {
            case 2, 1:
            System.out.println("They are totally" + totalCountOfTables.toString() + "available.");
            System.out.println("They are totally" + countOfDoubleTables.toString() + "tables with 2 seats available.");
            System.out.println("They are totally" + countOfTripleTables.toString() + "tables with 3 seats available.");
            System.out.println("They are totally" + countOfQuadrupleTables.toString() + "tables with 4 seats available.");
            break;
            case 3:
            System.out.println("They are totally" + totalCountOfTables.toString() + "available.");
            System.out.println("They are totally" + countOfTripleTables.toString() + "tables with 3 seats available.");
            System.out.println("They are totally" + countOfQuadrupleTables.toString() + "tables with 4 seats available.");
            break;
            case 4:
            System.out.println("They are totally" + totalCountOfTables.toString() + "available.");
            System.out.println("They are totally" + countOfQuadrupleTables.toString() + "tables with 4 seats available.");
            break;
            default:
            System.err.println("They are not seats available.");
            break;
        }
    }
}
