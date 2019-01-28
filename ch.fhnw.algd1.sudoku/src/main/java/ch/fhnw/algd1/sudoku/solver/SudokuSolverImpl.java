/*
 * Created on 03.12.2013
 */
package ch.fhnw.algd1.sudoku.solver;

import ch.fhnw.algd1.sudoku.framework.SudokuChecker;
import ch.fhnw.algd1.sudoku.framework.SudokuModel;
import ch.fhnw.algd1.sudoku.framework.SudokuSolver;

/**
 * @author
 */
public final class SudokuSolverImpl implements SudokuSolver {
    private final SudokuChecker checker;
    private int count = 0;
    private int changeCounter = 0;

    /**
     * Create a new solver based on a checker
     *
     * @param checker the SudokuChecker this solver will be using to determine the
     *                validity of partial solutions
     */
    public SudokuSolverImpl(SudokuChecker checker) {
        this.checker = checker;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * ch.fhnw.algd1.sudoku.SudokuSolver#solved(ch.fhnw.algd1.sudoku.SudokuModel)
     */
    @Override
    public boolean solved(SudokuModel model) {
        return solve(model, 0, false);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * ch.fhnw.algd1.sudoku.SudokuSolver#nofSolutions(ch.fhnw.algd1.sudoku.SudokuModel
     * )
     */
    @Override
    public int nofSolutions(SudokuModel model) {
        this.count = 0;
        solve(model, 0, true);
        return this.count;
    }

    public boolean solve(SudokuModel model, int fieldNr, boolean doCount) {

        double startTime = System.nanoTime();

        if (fieldNr == model.size() * model.size()) {// alle Felder gefüllt, checke ob ok

            if (checker.allOK(model)) {
                if (doCount) {

                    count++;

                    // Abbruch bei mehr als 10 Lösungen
                    if (count > 10) {
                        return true;
                    }

                    return false;
                } else {
                    System.out.println(this.changeCounter);
                    this.changeCounter = 0;
                    double endTime = System.nanoTime();
                    return true;
                }
            }


            return false; //checker.allOK(model);


        } else {
            final int i = fieldNr / model.size(), j = fieldNr % model.size();
            if (model.get(i, j) != 0) { // Feld hat vordefinierten Wert
                return solve(model, fieldNr + 1, doCount);
            } else { // probiere Werte von 1 bis 9 boolean found = false;

                boolean found = false;
                int nr = 1;

                while (nr <= 9 && !found) {

                    //System.out.println(String.format("Set [%s][%s] to %s", i, j, nr));
                    model.set(i, j, nr);
                    this.changeCounter++;


                    if (checker.oneOK(model, i, j)) {

                        if (solve(model, fieldNr + 1, doCount)) {
                            found = true;
                        }

                    } else {
                        //System.out.println(String.format("clear out [%s][%s]", i, j));
                        model.clear(i, j);
                    }

                    nr++;

                }

                if (!found) {
                    model.clear(i, j);
                }


                return found;
            }
        }
    }
}
