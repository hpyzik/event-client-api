package hello;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/api/v1/events", method = RequestMethod.PUT)
    public Event events(
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "id", required = false) Optional<String>id
    ) {
        String eventId = id.isPresent()
                ? id.get()
                : String.valueOf(counter.incrementAndGet());

        return new Event(eventId, name);
    }
}
