package Illnesses;

import java.util.Comparator;

public class IllnessComparable implements Comparator<Illness> {

	@Override
	public int compare(Illness ill1, Illness ill2) {
		return ill2.calcNum() - ill1.calcNum();
	}

}
