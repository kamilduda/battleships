package com.kduda.battleships.models.units;

import javafx.geometry.Orientation;

public enum UnitFactory {
    INSTANCE;

    Unit createGrounLevelUnit(UnitType type, int size, Orientation orientation) {
        switch (type) {
            case Ship:
                return new Ship(size, orientation);
            case Tank:
                return new Tank(size, orientation);
        }
        return null;
    }

    Unit createPlane(int size, Direction direction) {
        return new Plane(size, direction);
    }
}