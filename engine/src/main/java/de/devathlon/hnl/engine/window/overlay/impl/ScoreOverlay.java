package de.devathlon.hnl.engine.window.overlay.impl;

import de.devathlon.hnl.engine.window.overlay.Overlay;
import de.devathlon.hnl.engine.update.Score;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 * Class description.
 *
 * @author Paul2708
 */
public class ScoreOverlay extends Overlay {

    private Font font;

    @Override
    public void onInitialize() {
        this.font = getFont().deriveFont(15f).deriveFont(Font.BOLD);
    }

    @Override
    public void onRender(Graphics2D graphics) {
        Dimension dimension = getCanvas().getGameDimension();
        Score score = getEngine().getScore();

        graphics.setColor(Color.BLACK);
        graphics.setFont(font);

        graphics.drawString(score.getText() + " " + score.getScore(), (int) (dimension.getWidth() - 300), 30);
        graphics.drawString("High-Score: tba", (int) (dimension.getWidth() - 300), 60);
    }
}