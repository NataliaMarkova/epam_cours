package ua.epamcourses.natalia_markova.homework03.task07.service;

import ua.epamcourses.natalia_markova.homework03.task07.model.Cell;
import ua.epamcourses.natalia_markova.homework03.task07.model.Ship;

/**
 * Created by natalia_markova on 13.05.2016.
 */
public class Ship1DeckInitializer extends ShipInitializer {

    public Ship1DeckInitializer() {
        qtyOfVariants = 1;
    }

    @Override
    public Ship getShip(Cell initialCell, int variant) {
        Cell[] cells = new Cell[1];
        cells[0] = initialCell;
        return new Ship(cells);
    }

    public int getQtyOfVariants() {
        return qtyOfVariants;
    }
}
