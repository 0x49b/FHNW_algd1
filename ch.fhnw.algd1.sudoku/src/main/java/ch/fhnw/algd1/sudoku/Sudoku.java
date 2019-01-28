/*
 * Created on 08.12.2013
 */
package ch.fhnw.algd1.sudoku;

import ch.fhnw.algd1.sudoku.framework.SudokuChecker;
import ch.fhnw.algd1.sudoku.framework.SudokuSample;
import ch.fhnw.algd1.sudoku.framework.SudokuSolver;
import ch.fhnw.algd1.sudoku.sample.SudokuSampleImpl;
import ch.fhnw.algd1.sudoku.solver.SudokuSolverImpl;
import ch.fhnw.algd1.sudoku.std.SudokuCheckerImpl;
import ch.fhnw.algd1.sudoku.std.SudokuModelImpl;
import ch.fhnw.algd1.sudoku.ui.SudokuGUI;

/**
 * @author Wolfgang Weck
 */
public final class Sudoku {
	public static void main(String[] args) {
		SudokuChecker checker = new SudokuCheckerImpl();
		SudokuSolver solver = new SudokuSolverImpl(checker);
		SudokuSample sample = new SudokuSampleImpl();
		new SudokuGUI<>(new SudokuModelImpl(), checker, solver, sample);
	}
}
