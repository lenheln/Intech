package elena.kozlova.publisher;

/**
 * Модуль Publisher
 * Генерирует сообщения в 5 потоков с задержкой между сообщениями в каждом потоке на 15 секунд
 */
public class PublisherApplication {

	//Количество потоков
	private final static int THREADS_COUNT = 5;

	public static void main(String[] args) {

		for (int i = 0; i < THREADS_COUNT; i++) {
			new PublisherThreads().start();
		}
	}
}

