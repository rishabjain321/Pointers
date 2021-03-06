package jnachos.kern.mem;

/**
 * This algorithm always chooses the 0th page frame to evict.
 * 
 * @author pjmcswee@syr.edu
 * 
 */
public class RandomPageReplacement implements PageReplacementAlgorithm {
	public RandomPageReplacement() {
	}

	@Override
	public int chooseVictimPage() {
		return 0;
	}
}
