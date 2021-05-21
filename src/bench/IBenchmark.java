package bench;

public interface IBenchmark {
	void initialize(int size);
	void run();
	void run(Object option);
	String getResult();
	void warmUp();
	void warmUp(Object option);
	void clean();
}
