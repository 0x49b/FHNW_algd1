import ch.fhnw.algd.sortdemo.directories.DataPresetterDirectory;
import ch.fhnw.algd.sortdemo.directories.SortAlgDirectory;
import ch.fhnw.algd.sortdemo.directories.SortViewDirectory;

/*
 * Created on 21.03.2014
 */
/**
 * @author Wolfgang Weck
 */
public final class Configuration {
	public static void populateAlgDirectory() {
		SortAlgDirectory.add("InsertionSort", "ch.fhnw.algd.sortalgs.InsertionSort");
		SortAlgDirectory.add("SelectionSort", "ch.fhnw.algd.sortalgs.SelectionSort");
		SortAlgDirectory.add("BubbleSort", "ch.fhnw.algd.sortalgs.BubbleSort");
		// TODO (later for QuickSort exercise) uncomment following line
		// SortAlgDirectory.add("QuickSort", "ch.fhnw.algd.sortalgs.QuickSort");
		SortAlgDirectory.add("InsertionSort Demo", "ch.fhnw.algd.sortdemo.algorithms.InsertionSort");
		SortAlgDirectory.add("SelectionSort Demo", "ch.fhnw.algd.sortdemo.algorithms.SelectionSort");
		SortAlgDirectory.add("BubbleSort Demo", "ch.fhnw.algd.sortdemo.algorithms.BubbleSort");
		// TODO (later for QuickSort exercise) uncomment following line
		// SortAlgDirectory.add("QuickSort Demo", "ch.fhnw.algd.sortdemo.algorithms.QuickSort");
	}

	public static void populateViewDirectory() {
		SortViewDirectory.add("Graphical Sort View", "ch.fhnw.algd.sortdemo.simpleview.View");
		SortViewDirectory.add("Numerical Sort View", "ch.fhnw.algd.sortdemo.awt.numericalview.View");
	}

	public static void populateDataPresetterDirectory() {
		DataPresetterDirectory.add("Set Reverse", "ch.fhnw.algd.sortdemo.presets.SetReverseData");
		DataPresetterDirectory.add("Set Special Case 1", "ch.fhnw.algd.sortdemo.presets.SetWorstCaseData");
		DataPresetterDirectory.add("Set Special Case 2", "ch.fhnw.algd.sortdemo.presets.SetWorstCaseDataSymmetric");
	}
}
