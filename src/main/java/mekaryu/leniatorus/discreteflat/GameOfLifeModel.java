package mekaryu.leniatorus.discreteflat;

import java.util.Arrays;

public class GameOfLifeModel {
	private boolean[][] cells;
	private int width = 100;
	private int heigth = 100;

	public GameOfLifeModel() {
		cells = new boolean[width][heigth];		
	}

	public void init() {
		for (boolean[] row: cells) {
		    Arrays.fill(row, false);
		}
	}
}
