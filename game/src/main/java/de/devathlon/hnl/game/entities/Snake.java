package de.devathlon.hnl.game.entities;

import de.devathlon.hnl.core.SnakeModel;
import de.devathlon.hnl.core.math.Point;

import java.util.ArrayList;

public class Snake implements SnakeModel {

    private Point headPoint;
    private ArrayList<Point> bodyPoints;

    public Snake() {
        bodyPoints = new ArrayList<>();
        // generate snake at 10;10 with 4 body points
        headPoint = Point.of(10, 10);

        for (int i = 1; i <= 4; i++) {
            bodyPoints.add(Point.of(10 + i, 10));
        }
    }

    @Override
    public Point getHeadPoint() {
        return headPoint;
    }

    @Override
    public ArrayList<Point> getBodyPoints() {
        return bodyPoints;
    }
}
