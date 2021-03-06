package elena.kozlova.publisher;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Поток для отправки сообщений
 */
@Slf4j
public class PublisherThreads extends Thread{

    //Идентификатор сообщения
    static AtomicLong id = new AtomicLong(0);

    @Override
    public void run() {
        while (true) {
            try {
                sendMsg();
                Thread.sleep(15000);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Создание и отправка сообщения в Json формате
     * @throws IOException
     * @throws InterruptedException
     */
    public static synchronized void sendMsg() throws IOException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
        Message message = new Message(id.getAndIncrement());
        String json = objectMapper.writeValueAsString(message);

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/messenger"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();
        client.send(request, HttpResponse.BodyHandlers.ofString());
        log.info("Сообщение отправлено " + message.toString());
    }
}
