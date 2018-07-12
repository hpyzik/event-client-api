package hello;

import hello.dto.EventData;
import hello.dto.EventId;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EventController {
    @RequestMapping(value = "/api/v1/events/{id}", method = RequestMethod.PUT)
    public EventData save(
            EventId eventId,
            @Valid @RequestBody EventData eventData
    ) {
        return eventData;
    }
}
