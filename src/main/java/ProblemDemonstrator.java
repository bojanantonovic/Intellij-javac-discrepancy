import java.util.Comparator;

public class ProblemDemonstrator<T extends Comparable<T>> {

	private final Comparator<? super T> comparator;

	public ProblemDemonstrator(final Comparator<? super T> comparator) {
		this.comparator = comparator;
	}

	public static <T extends Comparable<T>> ProblemDemonstrator<T> naturalVersion() {
		return new ProblemDemonstrator<>(Comparator.<T>naturalOrder()); // TODO works in IntelliJ, but not with javac
	}

	public static <T extends Comparable<T>> ProblemDemonstrator<T> reverseOrderVersion() {
		return new ProblemDemonstrator<>(Comparator.<T>reverseOrder()); // TODO works in IntelliJ, but not with javac
	}
}
