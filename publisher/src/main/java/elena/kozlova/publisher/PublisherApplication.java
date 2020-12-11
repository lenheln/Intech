package elena.kozlova.publisher;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.atomic.AtomicLong;

public class PublisherApplication {

	private final static int THREADS_COUNT = 5;

	public static void main(String[] args) {

		for (int i = 0; i < THREADS_COUNT; i++) {
			new PublisherThreads().start();
		}
	}
}

